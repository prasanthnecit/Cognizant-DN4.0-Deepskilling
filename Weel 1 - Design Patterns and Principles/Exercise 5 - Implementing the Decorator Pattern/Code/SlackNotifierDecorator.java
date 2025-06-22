
class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier var1) {
        super(var1);
    }

    public void send(String var1) {
        super.send(var1);
        this.sendSlack(var1);
    }

    private void sendSlack(String var1) {
        System.out.println("Sending Slack message: " + var1);
    }
}
