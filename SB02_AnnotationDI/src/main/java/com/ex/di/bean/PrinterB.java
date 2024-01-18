package com.ex.di.bean;

public class PrinterB implements Printer{
	@Override
	public void print(String message) {
		System.out.println("B를 출력"+message);
	}
}