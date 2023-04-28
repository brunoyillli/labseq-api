package io.github.brunoyillli.labseqapi.config;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import io.github.brunoyillli.labseqapi.exception.ErrorMessage;
import io.github.brunoyillli.labseqapi.exception.LabseqException;

@RestControllerAdvice
public class ExceptionHandlerAdvice {
	
	@ExceptionHandler(LabseqException.class)
	@ResponseStatus(HttpStatus.BAD_REQUEST)
	public ErrorMessage handleLabseqExceptionBadRequestException(LabseqException e) {
		return new ErrorMessage(e.getMessage(), HttpStatus.BAD_REQUEST.value());
	}
}
