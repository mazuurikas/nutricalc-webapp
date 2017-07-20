package nutricalc.core.services.exceptions;

public class SpecificationNotFoundException extends RuntimeException {
    public SpecificationNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }

    public SpecificationNotFoundException(String message) {
        super(message);
    }

    public SpecificationNotFoundException() {
    }
}
