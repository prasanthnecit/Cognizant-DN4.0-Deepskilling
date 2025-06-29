
public class ProxyImage implements Image {
    private RealImage realImage;
    private String filename;

    public ProxyImage(String var1) {
        this.filename = var1;
    }

    public void display() {
        if (this.realImage == null) {
            this.realImage = new RealImage(this.filename);
        }

        this.realImage.display();
    }
}