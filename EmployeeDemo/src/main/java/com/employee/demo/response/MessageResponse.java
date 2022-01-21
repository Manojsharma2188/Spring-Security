package com.employee.demo.response;

/**
 * Used for map the application message response from response entity Failure
 * message/ Success message / Exception message
 * 
 * @author Manoj
 */
public class MessageResponse {

	private String message;

	public MessageResponse(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

}
