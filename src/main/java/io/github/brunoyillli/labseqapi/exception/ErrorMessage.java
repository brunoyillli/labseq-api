package io.github.brunoyillli.labseqapi.exception;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ErrorMessage {
	private String message;
	private int statusCode;
	
	public ErrorMessage(String message, int statusCode) {
		this.message = message;
		this.statusCode = statusCode;
	}
}
