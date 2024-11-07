package Class;

import Interface.PostalMail;

public class PostalMailSender implements PostalMail {
    @Override
    public void sendPostalMail(String message, String recipientName, String address, String postalCode) {
        System.out.println("Sending Postal Mail to " + recipientName + " at " + address + ", " + postalCode + ": " + message);
    }
}