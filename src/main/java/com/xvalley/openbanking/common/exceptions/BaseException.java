package com.xvalley.openbanking.common.exceptions;

public class BaseException extends RuntimeException implements IBaseException {
    private final String errorCode;
    private final String errorMessage;
    private final String additionalDetails;

    public BaseException(String errorCode, String errorMessage) {
        this(errorCode, errorMessage, null);
    }

    public BaseException(String errorCode, String errorMessage, String additionalDetails) {
        this.errorCode = errorCode;
        this.errorMessage = errorMessage;
        this.additionalDetails = additionalDetails;
    }

    /**
     * Returns the error code associated with the exception.
     *
     * @return the error code
     */
    @Override
    public String getErrorCode() {
        return errorCode;
    }

    /**
     * Returns the error message associated with the exception.
     *
     * @return the error message
     */
    @Override
    public String getErrorMessage() {
        return errorMessage;
    }

    /**
     * Returns any additional details or context related to the exception.
     *
     * @return the additional details or context
     */
    @Override
    public String getAdditionalDetails() {
        return additionalDetails;
    }
}
