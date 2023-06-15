package kh.lclass.thread;

public class ThreadBbb extends Thread {
	@Override
	public void run() {
		// TODO Auto-generated method stub
	
		for(int i = 1;i<101;i++) {
			for(int dan = 1; dan<10;dan++) {
				System.out.printf("%3d*%2d=%3d\n",i ,dan,i*dan);
			}System.out.println("====");
			
		}
		System.out.println("===끝bbbaa");
		return;
	}
}

