package com.javeex.ec02;

public class LowerThread extends Thread{
	
	@Override
	public void run() {
		for(char cnt = 'A' ; cnt <='Z'; cnt++){
			System.out.print(cnt);
		}
	}
	
}
