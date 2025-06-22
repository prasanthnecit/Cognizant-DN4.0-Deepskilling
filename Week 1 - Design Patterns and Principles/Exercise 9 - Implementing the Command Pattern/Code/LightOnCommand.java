public class LightOnCommand implements Command {
    private Light light;

    public LightOnCommand(Light var1) {
        this.light = var1;
    }

    public void execute() {
        this.light.turnOn();
    }
}