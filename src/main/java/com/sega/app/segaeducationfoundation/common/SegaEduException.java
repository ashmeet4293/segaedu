package com.sega.app.segaeducationfoundation.common;

public class SegaEduException extends Exception {


    public SegaEduException(String message) {
        super(message);
    }

    public SegaEduException(String message, Throwable cause) {
        super(message, cause);
    }

    public SegaEduException(Throwable cause) {
        super(cause);
    }

    public SegaEduException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
