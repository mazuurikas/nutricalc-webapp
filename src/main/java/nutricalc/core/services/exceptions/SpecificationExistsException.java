package nutricalc.core.services.exceptions;

public class SpecificationExistsException extends RuntimeException {
    public SpecificationExistsException() {
    }

    public SpecificationExistsException(String message) {
        super(message);
    }

    public SpecificationExistsException(String message, Throwable cause) {
        super(message, cause);
    }

    public SpecificationExistsException(Throwable cause) {
        super(cause);
    }
}
