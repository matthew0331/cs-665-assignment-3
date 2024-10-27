package edu.bu.met.cs665;

public class ReturningCustomerEmail extends EmailGenerator {
    @Override
    protected String getGreeting() {
        return "Hello Returning Customer,";
    }

    @Override
    protected String getBody() {
        return "Thank you for trusting us again! We're here to provide the best service.";
    }

    @Override
    protected String getClosing() {
        return "Warm regards,\nThe Company Team";
    }
}
