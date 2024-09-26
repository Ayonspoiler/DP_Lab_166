public interface PaymentMethod {
    boolean processPayment(double amount);
}

class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private double balance;

    public CreditCardPayment(String cardNumber, double balance) {
        this.cardNumber = cardNumber;
        this.balance = balance;
    }

    @Override
    public boolean processPayment(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Credit Card payment of $" + amount + " successful.");
            return true;
        } else {
            System.out.println("Insufficient funds in Credit Card.");
            return false;
        }
    }

    public double getBalance() {
        return balance;
    }
}

class PayPalPayment implements PaymentMethod {
    private String email;
    private double balance;

    public PayPalPayment(String email, double balance) {
        this.email = email;
        this.balance = balance;
    }

    @Override
    public boolean processPayment(double amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("PayPal payment of $" + amount + " successful.");
            return true;
        } else {
            System.out.println("Insufficient funds in PayPal.");
            return false;
        }
    }


    public double getBalance() {
        return balance;
    }
}