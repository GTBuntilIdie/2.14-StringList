public class IndexIsOutOfStorageException extends RuntimeException {
    public IndexIsOutOfStorageException() {
    }

    public IndexIsOutOfStorageException(String message) {
        super(message);
    }

    public IndexIsOutOfStorageException(String message, Throwable cause) {
        super(message, cause);
    }

    public IndexIsOutOfStorageException(Throwable cause) {
        super(cause);
    }

    public IndexIsOutOfStorageException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
