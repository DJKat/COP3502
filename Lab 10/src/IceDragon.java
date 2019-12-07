/*
 * Lab 7
 * Alexander Sun
 * COP3502
 * Makes various cows say things (constructor class)
 */
public class IceDragon extends Dragon {

    // constructor
    public IceDragon(String name, String image) {
        super(name, image);
    }

    // overwrites method from dragon superclass
    public boolean canBreatheFire() {
        return false;
    }
}
