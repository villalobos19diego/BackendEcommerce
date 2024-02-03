package com.villalobos19.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.villalobos19.response.ApiResponse;

@RestController
public class HomeController {
	//classe que conrola peticiones GET  hacia "http://localhost:8080/"
	// la cual debe imprimir un welcome si el  login es  exitoso  debe de  mostrar  el mensaje

	@GetMapping("/")
	public ResponseEntity<ApiResponse> homeController(){
		
		ApiResponse res=new ApiResponse("Welcome To E-Commerce System", true);
		
		return new ResponseEntity<>(res,HttpStatus.OK);
	}
}
