package edu.bu.met.cs665;

public abstract class EmailGenerator {
    // Template method
    public final String generateEmail() {
        return getGreeting() + "\n\n" + getBody() + "\n\n" + getClosing();
    }

    protected abstract String getGreeting();
    protected abstract String getBody();
    protected abstract String getClosing();
}
