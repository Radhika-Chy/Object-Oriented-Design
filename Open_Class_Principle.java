//*************************************************************************
// Title : A java programme to demonstrate Open Class Principle.
// Author : Radhika Chowdhury, Undergrduate student, Khulna University.
//*************************************************************************

/**
 * Interface representing a method of payment.
 */
interface PaymentMethod {
    /**
     * Method to analyze the payment.
     * @param amount The amount to be paid.
     * @return true if payment is successful, false otherwise.
     */
    boolean processPayment(double amount);
}

/**
 * Class representing credit card payment method.
 * This class is the child class of parent class Payment method.
 */
class CreditCardPayment implements PaymentMethod {
    private String cardNumber;
    private String expiryDate;
    private String cvv;

    /**
     * Constructor to initialize credit card details.
     * @param cardNumber The credit card number.
     * @param expiryDate The expiry date of the credit card.
     * @param cvv The CVV number of the credit card.
     */
    public CreditCardPayment(String cardNumber, String expiryDate, String cvv) {
        this.cardNumber = cardNumber;
        this.expiryDate = expiryDate;
        this.cvv = cvv;
    }

    /**
     * Method to process the payment using credit card.
     * @param amount The amount to be paid.
     * @return true if payment is successful, false otherwise.
     */
    @Override
    public boolean processPayment(double amount) {
        // Logic to process credit card payment
        System.out.println("Processing credit card payment...");
        // Simulated success for demonstration
        return true;
    }
}
/**
 * Class representing Bkash payment method.
 * This class is the child class of parent class Payment method.
 */
class Bkash implements PaymentMethod {
    private String phoneNo;
    private String password;

    /**
     * Constructor to initialize Bkash details.
     * @param phoneNo The phoneNo associated with Bkash account.
     * @param password The password of Bkash account.
     */
    public Bkash(String phoneNo , String password) {
        this.phoneNo = phoneNo;
        this.password = password;
    }

    /**
     * Method to process the payment using Bkash.
     * @param amount The amount to be paid.
     * @return true if payment is successful, false otherwise.
     */
    @Override
    public boolean processPayment(double amount) {
        // Logic to process PayPal payment
        System.out.println("Processing Bkash payment...");
        // Simulated success for demonstration
        return true;
    }
}

/**
 * Class representing PayPal payment method.
 * This class is the child class of parent class Payment method.
 */
class PayPalPayment implements PaymentMethod {
    private String email;
    private String password;

    /**
     * Constructor to initialize PayPal details.
     * @param email The email associated with PayPal account.
     * @param password The password of PayPal account.
     */
    public PayPalPayment(String email, String password) {
        this.email = email;
        this.password = password;
    }

    /**
     * Method to process the payment using PayPal.
     * @param amount The amount to be paid.
     * @return true if payment is successful, false otherwise.
     */
    @Override
    public boolean processPayment(double amount) {
        // Logic to process PayPal payment
        System.out.println("Processing PayPal payment...");
        // Simulated success for demonstration
        return true;
    }
}

/**
 * Main class to demonstrate Open/Closed Principle.
 */
class Open_Class_Principle {
    /**
     * Method to process payment using the given payment method.
     * @param paymentMethod The payment method to be used.
     * @param amount The amount to be paid.
     * @return true if payment is successful, false otherwise.
     */
    public static boolean processPayment(PaymentMethod paymentMethod, double amount) {
        return paymentMethod.processPayment(amount);
    }

    public static void main(String[] args) {
        // Payment using credit card
        PaymentMethod creditCardPayment = new CreditCardPayment("3323456754360123456", "05/24", "576");
        boolean creditCardSuccess = processPayment(creditCardPayment, 1000.0);
        System.out.println("Credit card payment success: " + creditCardSuccess);
         
        // Payment using Bkash
        PaymentMethod bkash = new Bkash("01678934563", "password103");
        boolean bkashSuccess = processPayment(bkash, 500.0);
        System.out.println("Bkash payment success: " + bkashSuccess);

        // Payment using PayPal
        PaymentMethod payPalPayment = new PayPalPayment("example@example.com", "password123");
        boolean payPalSuccess = processPayment(payPalPayment, 500.0);
        System.out.println("PayPal payment success: " + payPalSuccess);
    }
}
