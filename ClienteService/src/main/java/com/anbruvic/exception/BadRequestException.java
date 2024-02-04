package com.anbruvic.exception;

public class BadRequestException  extends RuntimeException {

    private static final long serialVersionUID = 3329861510354954385L;

    public BadRequestException(String message) {
        super(message);
    }
}
