package com.javaex.ex01;

public class ThreadApp {

	public static void main(String[] args) throws Exception {
		
		//준비
		Thread thread =new DigitThread();
		
		
		
		//스레드 실행 -- >
		//thread.run()
		thread.start();
		
		
		for(char ch = 'A'; ch <= 'Z'; ch ++) {
			System.out.print(ch);
			thread.sleep(1000);
		}
		
		//스레드 끝
		
	}
}
