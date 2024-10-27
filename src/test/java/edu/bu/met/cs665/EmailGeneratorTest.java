package edu.bu.met.cs665;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class EmailGeneratorTest {

    @Test
    public void testBusinessCustomerEmail() {
        EmailGenerator email = new BusinessCustomerEmail();
        String content = email.generateEmail();
        assertTrue(content.contains("Dear Valued Business Customer,"));
        assertTrue(content.contains("We appreciate your business"));
    }

    @Test
    public void testReturningCustomerEmail() {
        EmailGenerator email = new ReturningCustomerEmail();
        String content = email.generateEmail();
        assertTrue(content.contains("Hello Returning Customer,"));
        assertTrue(content.contains("Thank you for trusting us again"));
    }

    @Test
    public void testFrequentCustomerEmail() {
        EmailGenerator email = new FrequentCustomerEmail();
        String content = email.generateEmail();
        assertTrue(content.contains("Hi Frequent Customer,"));
        assertTrue(content.contains("We value your frequent patronage"));
    }

    @Test
    public void testNewCustomerEmail() {
        EmailGenerator email = new NewCustomerEmail();
        String content = email.generateEmail();
        assertTrue(content.contains("Welcome New Customer!"));
        assertTrue(content.contains("We're excited to have you on board!"));
    }

    @Test
    public void testVIPCustomerEmail() {
        EmailGenerator email = new VIPCustomerEmail();
        String content = email.generateEmail();
        assertTrue(content.contains("Dear VIP Customer,"));
        assertTrue(content.contains("As one of our most valued clients"));
    }
}
