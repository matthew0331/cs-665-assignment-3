package edu.bu.met.cs665;

public class NewCustomerEmail extends EmailGenerator {
    @Override
    protected String getGreeting() {
        return "Welcome New Customer!";
    }

    @Override
    protected String getBody() {
        return "Thank you for choosing us. We're excited to have you on board!";
    }

    @Override
    protected String getClosing() {
        return "Cheers,\nThe Company Team";
    }
}
