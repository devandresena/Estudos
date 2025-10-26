public class SenhaInvalidaException extends RuntimeException {
String message;

    public SenhaInvalidaException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
