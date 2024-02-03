package com.villalobos19.response;



// est  clase proporciona una forma estructurada de enviar información sobre
// el resultado de una operación en tu API,
// incluyendo un mensaje descriptivo y un indicador de estado.
public class ApiResponse {

	private String message;
	private boolean status;
	
	public ApiResponse(String message, boolean status) {
		super();
		this.message = message;
		this.status = status;
	}
	
	public ApiResponse() {
		
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
	
	
}
