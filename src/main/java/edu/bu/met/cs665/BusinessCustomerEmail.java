package edu.bu.met.cs665;

public class BusinessCustomerEmail extends EmailGenerator {
    @Override
    protected String getGreeting() {
        return "Dear Valued Business Customer,";
    }

    @Override
    protected String getBody() {
        return "We appreciate your business and look forward to continued collaboration.";
    }

    @Override
    protected String getClosing() {
        return "Best Regards,\nThe Company Team";
    }
}
