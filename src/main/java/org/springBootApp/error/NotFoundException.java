package org.springBootApp.error;

import org.springframework.http.HttpStatus;

public class NotFoundException extends APIBaseException{
    public NotFoundException(String message) {
        super(message);
    }
    public HttpStatus getStatusCode()
    {
        return HttpStatus.NOT_FOUND;
    }
}
