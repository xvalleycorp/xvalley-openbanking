package com.xvalley.openbanking.common.exceptions;

/**
 * IOpenBankingException is an interface that defines the standard for exception handling
 * based on the BIAN (Banking Industry Architecture Network) guidelines.
 */
public interface IBaseException {

    /**
     * Returns the error code associated with the exception.
     *
     * @return the error code
     */
    String getErrorCode();

    /**
     * Returns the error message associated with the exception.
     *
     * @return the error message
     */
    String getErrorMessage();

    /**
     * Returns any additional details or context related to the exception.
     *
     * @return the additional details or context
     */
    String getAdditionalDetails();
}
