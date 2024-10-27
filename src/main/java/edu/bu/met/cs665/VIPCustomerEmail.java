package edu.bu.met.cs665;

public class VIPCustomerEmail extends EmailGenerator {
    @Override
    protected String getGreeting() {
        return "Dear VIP Customer,";
    }

    @Override
    protected String getBody() {
        return "As one of our most valued clients, we have tailored offers and services for you.";
    }

    @Override
    protected String getClosing() {
        return "With appreciation,\nThe Company Team";
    }
}
