package edu.bu.met.cs665;

public class Main {
    public static void main(String[] args) {
        EmailGenerator businessEmail = new BusinessCustomerEmail();
        System.out.println("Business Email:\n" + businessEmail.generateEmail());

        EmailGenerator returningEmail = new ReturningCustomerEmail();
        System.out.println("\nReturning Customer Email:\n" + returningEmail.generateEmail());

        EmailGenerator frequentEmail = new FrequentCustomerEmail();
        System.out.println("\nFrequent Customer Email:\n" + frequentEmail.generateEmail());

        EmailGenerator newEmail = new NewCustomerEmail();
        System.out.println("\nNew Customer Email:\n" + newEmail.generateEmail());

        EmailGenerator vipEmail = new VIPCustomerEmail();
        System.out.println("\nVIP Customer Email:\n" + vipEmail.generateEmail());
    }
}
