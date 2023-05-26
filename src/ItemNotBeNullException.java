public class ItemNotBeNullException extends RuntimeException {
    public ItemNotBeNullException() {
    }

    public ItemNotBeNullException(String message) {
        super(message);
    }

    public ItemNotBeNullException(String message, Throwable cause) {
        super(message, cause);
    }

    public ItemNotBeNullException(Throwable cause) {
        super(cause);
    }

    public ItemNotBeNullException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
