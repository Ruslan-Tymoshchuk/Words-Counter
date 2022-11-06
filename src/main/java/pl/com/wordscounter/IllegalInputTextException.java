package pl.com.wordscounter;

@SuppressWarnings("serial")
public class IllegalInputTextException extends RuntimeException {

    public IllegalInputTextException(String message, Throwable cause) {
        super(message, cause);
    }
}