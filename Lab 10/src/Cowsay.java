/*
 * Lab 7
 * Alexander Sun
 * COP3502
 * Makes various cows say things (runner class)
 */
public class Cowsay {
    // lists cow names in cow object array
    private static void listCows(Cow[] cows) {
        System.out.print("Cows available: ");
        for(int i = 0; i < cows.length; i++) {
            System.out.print(cows[i].getName() + " ");
        }
    }

    private static Cow findCow(String name, Cow[] cows) {
        // finds cow name which equals name input
        for(int i = 0; i < cows.length; i++) {
            if(name.equals(cows[i].getName())) {
                return cows[i];
            }
        }
        return null;
    }

    public static void main(String[] args) {
        Cow[] ourCows = HeiferGenerator.getCows();
        Cow[] ourFileCows = HeiferGenerator.getFileCows();
        // determines action based  on argument input
        switch(args[0]) {
            case "-l":
                System.out.print("Regular cows available: ");
                listCows(ourCows);
                System.out.println();
                System.out.print("File cows available: ");
                listCows(ourFileCows);
                System.out.println();
                break;
            case "-n":
                Cow cow = findCow(args[1], ourCows);
                if (cow != null) {
                    for (int i = 2; i < args.length; i++) {
                        System.out.print(args[i] + " ");
                    }
                    System.out.println();
                    System.out.println(cow.getImage());
                    if (cow instanceof Dragon) {
                        if (((Dragon) cow).canBreatheFire() == true) {
                            System.out.println("This dragon can breathe fire.");
                        } else {
                            System.out.println("This dragon cannot breathe fire.");
                        }
                    }
                } else {
                    System.out.println("Could not find " + args[1] + " cow!");
                }
                System.out.println();
                break;
            case "-f":
                Cow fileCow = findCow(args[1], ourFileCows);
                if (fileCow != null) {
                    for (int i = 2; i < args.length; i++) {
                        System.out.print(args[i] + " ");
                    }
                    System.out.println();
                    System.out.println(fileCow.getImage());
                } else {
                    System.out.println("Could not find " + args[1] + " cow!");
                }
                System.out.println();
                break;
            default:
                // defaults heifer cow
                for (int i = 0; i < args.length; i++) {
                    System.out.print(args[i] + " ");
                }
                System.out.println();
                System.out.println(HeiferGenerator.getCows()[0].getImage());
                System.out.println();
                break;
             }
        }
    }