package kh.lclass.thread.run;

import kh.lclass.thread.ThreadAaa;
import kh.lclass.thread.ThreadBbb;

public class Run {
	public static void main(String[] args) {
		
//		Runnable ta= new ThreadAaa();
		Thread tb= new ThreadBbb();
		
		Thread ta =new Thread(new ThreadAaa());
		
		ta.start();
		tb.start();
		Thread tbb = new ThreadBbb();
		tbb.start();
		
//		tb.run();
//		run은 일반 메소드 호출하듯 하면 Thread 동작 안함
		for(int i = 1;i<500;i++) {
			System.out.println(i+"*");
		}System.out.println("===main 끝");
	}
}
