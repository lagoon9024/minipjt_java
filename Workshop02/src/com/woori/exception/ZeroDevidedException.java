package com.woori.exception;

public class ZeroDevidedException extends ArithmeticException{
	
	ZeroDevidedException(){
		this("This is ZeroDevided Exception...");
	}
	
	ZeroDevidedException(String msg){
		super(msg);
	}

}
