/*
 * Lab 7
 * Alexander Sun
 * COP3502
 * Makes various cows say things (constructor subclass)
 */
public class Dragon extends Cow {

    // constructor
    public Dragon(String name, String image) {
        super(name);
        // overwrites image from cow superclass
        super.setImage(image);
    }

    // determines that the dragon can breathe fire
    public boolean canBreatheFire() {
        return true;
    }
}
