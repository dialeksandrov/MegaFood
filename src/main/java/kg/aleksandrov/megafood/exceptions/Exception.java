package kg.aleksandrov.megafood.exceptions;


public class Exception {
    private final String message;

    public String getMessage() {
        return message;
    }

    public Exception(String message) {
        this.message = message;
    }
}
