import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class FileCow extends Cow{

    public FileCow(String name, String filename) {
        super(name);
        try {
            FileInputStream inStream = new FileInputStream(filename);
            Scanner fileScanner = new Scanner(inStream);

            String cow = "";

            while (fileScanner.hasNextLine()) {
                cow += "\n" + fileScanner.nextLine();

            }
            super.setImage(cow);

            inStream.close();
        }
        catch(IOException error) {
            System.out.println("MOOOOO!!!!!!");
        }
    }
    public void setImage() {
        throw new RuntimeException("Cannot reset FileCow Image");
    }
}
