package eu.automationlabs.exchangerates.exception;

import org.apache.commons.lang3.StringUtils;

public class CurrencyServerException extends RuntimeException {
    private static final long serialVersionUID = 1L;

    public CurrencyServerException(String message) {
        super(message);
    }

    public CurrencyServerException(String message, Throwable cause) {
        super(message, cause);
    }

    public CurrencyServerException(Throwable cause) {
        super(StringUtils.isNotEmpty(cause.getMessage()) ? cause.getMessage() : "Currency server error", cause);
    }
}
