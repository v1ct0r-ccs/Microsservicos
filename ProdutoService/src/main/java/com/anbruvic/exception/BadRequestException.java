package com.anbruvic.exception;

public class BadRequestException extends RuntimeException {
    public static final long serialVersionUID = -1594382861057608663L;

    public BadRequestException(String message) {
        super(message);
    }
}
