package io.egen.movie.exceptions;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(code=HttpStatus.BAD_REQUEST)
public class MovieAlreadyExistsException extends RuntimeException{

	private static final long serialVersionUID = 4870720746577726984L;
	public MovieAlreadyExistsException(String message){
		super(message);		
	}
	public MovieAlreadyExistsException(String message, Throwable Cause){
		super(message,Cause);
	
}

}