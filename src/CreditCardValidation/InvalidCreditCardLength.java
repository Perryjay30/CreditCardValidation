package CreditCardValidation;

public class InvalidCreditCardLength extends RuntimeException {
    public InvalidCreditCardLength(String message) {
        super(message);
    }
}
