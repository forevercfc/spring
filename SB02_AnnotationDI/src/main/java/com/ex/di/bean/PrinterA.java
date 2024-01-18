package com.ex.di.bean;

public class PrinterA implements Printer{
	@Override
	public void print(String message) {
		System.out.println("A를 출력"+message);
	}
}
