abstract class NotifierDecorator implements Notifier {
    protected Notifier decoratedNotifier;

    public NotifierDecorator(Notifier var1) {
        this.decoratedNotifier = var1;
    }

    public void send(String var1) {
        this.decoratedNotifier.send(var1);
    }
}
