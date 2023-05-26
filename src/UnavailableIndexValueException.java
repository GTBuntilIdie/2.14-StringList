public class UnavailableIndexValueException extends RuntimeException {
    public UnavailableIndexValueException() {
    }

    public UnavailableIndexValueException(String message) {
        super(message);
    }

    public UnavailableIndexValueException(String message, Throwable cause) {
        super(message, cause);
    }

    public UnavailableIndexValueException(Throwable cause) {
        super(cause);
    }

    public UnavailableIndexValueException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
