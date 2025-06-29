class SMSNotifierDecorator extends NotifierDecorator {
    public SMSNotifierDecorator(Notifier var1) {
        super(var1);
    }

    public void send(String var1) {
        super.send(var1);
        this.sendSMS(var1);
    }

    private void sendSMS(String var1) {
        System.out.println("Sending SMS: " + var1);
    }
}
