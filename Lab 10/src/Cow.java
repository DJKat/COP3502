/*
 * Lab 7
 * Alexander Sun
 * COP3502
 * Makes various cows say things (constructor class)
 */
public class Cow {
    private String name;
    private String image;

    // constructor
    public Cow(String name) {
        this.name = name;
    }

    // setters and getters
    public String getName() {
        return name;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String _image) {
        image = _image;
    }
}
