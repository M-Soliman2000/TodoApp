package org.springBootApp.error;

import org.springframework.http.HttpStatus;

public class ConflictException extends APIBaseException{

    public ConflictException(String message) {
        super(message);
    }

    @Override
    public HttpStatus getStatusCode() {
        return HttpStatus.CONFLICT;
    }
}
