package edu.bu.met.cs665;

public class FrequentCustomerEmail extends EmailGenerator {
    @Override
    protected String getGreeting() {
        return "Hi Frequent Customer,";
    }

    @Override
    protected String getBody() {
        return "We value your frequent patronage and have exclusive offers just for you.";
    }

    @Override
    protected String getClosing() {
        return "Sincerely,\nThe Company Team";
    }
}
