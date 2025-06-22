public class RealImage implements Image {
    private String filename;

    public RealImage(String var1) {
        this.filename = var1;
        this.loadImageFromDisk();
    }

    private void loadImageFromDisk() {
        System.out.println("Loading image from disk: " + this.filename);
    }

    public void display() {
        System.out.println("Displaying image: " + this.filename);
    }
}
