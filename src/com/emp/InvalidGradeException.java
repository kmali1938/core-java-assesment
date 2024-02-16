package com.emp;

public class InvalidGradeException extends Exception{

	InvalidGradeException(){
		super();
	}
	
	InvalidGradeException(String message){
		super(message);
	}
	
}
