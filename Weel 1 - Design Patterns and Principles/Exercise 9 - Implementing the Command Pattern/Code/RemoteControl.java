public class RemoteControl {
    private Command command;

    public void setCommand(Command var1) {
        this.command = var1;
    }

    public void pressButton() {
        this.command.execute();
    }
}
