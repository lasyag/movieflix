package io.egen.movie.exceptions;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.NOT_FOUND)
public class MovieNotFoundException extends RuntimeException{
	private static final long serialVersionUID = -2051001906165155911L;
	public MovieNotFoundException(String message){
		super(message);		
	}
	public MovieNotFoundException(String message, Throwable Cause){
		super(message,Cause);
	}
	
}
