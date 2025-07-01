package local.exceptions;

// RunTime Exception

public class TechnicalException extends RuntimeException{

    TechnicalException(String message) {
        super(message);
    }

    TechnicalException(String message, Throwable cause) {
        super(message, cause);
    }


}
