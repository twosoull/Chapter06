package com.javaex.ex01;

public class DigitThread extends Thread{
	
	//field
	
	//constructor
	
	//method g/s
	
	//method 
	
	
	
	@Override
	public void run() {
		for(int cnt = 0 ; cnt <10; cnt++) {
			System.out.print(cnt);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
				
		}
	}
}
