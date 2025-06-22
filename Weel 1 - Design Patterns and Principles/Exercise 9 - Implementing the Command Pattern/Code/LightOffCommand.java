public class LightOffCommand implements Command {
    private Light light;

    public LightOffCommand(Light var1) {
        this.light = var1;
    }

    public void execute() {
        this.light.turnOff();
    }
}
