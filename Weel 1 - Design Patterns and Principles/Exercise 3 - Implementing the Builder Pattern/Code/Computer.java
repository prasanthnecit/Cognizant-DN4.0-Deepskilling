public class Computer {
    private final boolean hasGraphicsCard;
    private final boolean hasWiFi;
    private final String CPU;
    private final String RAM;
    private final String storage;

    private Computer(Builder var1) {
        this.CPU = var1.CPU;
        this.RAM = var1.RAM;
        this.storage = var1.storage;
        this.hasGraphicsCard = var1.hasGraphicsCard;
        this.hasWiFi = var1.hasWiFi;
    }

    public String toString() {
        return "Computer{CPU='" + this.CPU + "', RAM='" + this.RAM + "', storage='" + this.storage + "', hasGraphicsCard=" + this.hasGraphicsCard + ", hasWiFi=" + this.hasWiFi + "}";
    }

    public static class Builder {
        private final String CPU;
        private final String RAM;
        private String storage;
        private boolean hasGraphicsCard;
        private boolean hasWiFi;

        public Builder(String var1, String var2) {
            this.CPU = var1;
            this.RAM = var2;
        }

        public Builder storage(String var1) {
            this.storage = var1;
            return this;
        }

        public Builder graphicsCard(boolean var1) {
            this.hasGraphicsCard = var1;
            return this;
        }

        public Builder wifi(boolean var1) {
            this.hasWiFi = var1;
            return this;
        }

        public Computer build() {
            return new Computer(this);
        }
    }
}
