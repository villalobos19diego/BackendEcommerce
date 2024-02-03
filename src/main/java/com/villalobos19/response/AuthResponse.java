package com.villalobos19.response;



//  Esta  clase proporciona proporciona una forma estructurada de
//  enviar información sobre el resultado de una operación de autenticación,
//  incluyendo un token JWT y un indicador de estado.
public class AuthResponse {
	
	private String jwt;
	
	private boolean status;
	
	public AuthResponse() {
		// TODO Auto-generated constructor stub
	}

	public AuthResponse(String jwt, boolean status) {
		super();
		this.jwt = jwt;
		this.status = status;
	}

	public String getJwt() {
		return jwt;
	}

	public void setJwt(String jwt) {
		this.jwt = jwt;
	}

	public boolean getStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
	
	

}
