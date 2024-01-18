package com.hidarisoft.mxprevlist.exceptions;

import lombok.Builder;
import lombok.Data;
import org.springframework.http.HttpStatus;

import java.time.Instant;

@Data
@Builder
public class GenericErrorResponse {
    private final String timestamp = Instant.now().toString();
    private final HttpStatus httpStatus;
    private final int httpStatusCode;
    private final String title;
    private final String message;
    private final Object details;

}
