package com.javeex.ec02;

public class UpperThread extends Thread{

	@Override
	public void run() {
		for(char cnt = 'a' ; cnt <='z'; cnt++){
			System.out.print(cnt);
		}
	}
	
	
}
