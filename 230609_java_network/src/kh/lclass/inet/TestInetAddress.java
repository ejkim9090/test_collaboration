package kh.lclass.inet;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Arrays;

public class TestInetAddress {
	public void testInetAddressEx()	{
		//the constructor inetaddress() is now visible
		//원인 생성자 없음
		//조치내용 : 1. singleton인지 확인(주로 getInstance(), create()이런 메소드로 시작함
		//조치내용 : 2. 생성자 없이 static method 즉 클래스메소드지원이 됨
		String host1= "www.naver.com";
		String host2= "www.google.com";
		String host3= "www.oracle.com";
		try {
			InetAddress localIp = InetAddress.getLocalHost();
			System.out.println(localIp);
			InetAddress[] ipAll =InetAddress.getAllByName(host1);//getter와 동일하게 쓰임
			InetAddress ip2 =InetAddress.getByName(host2);//getter와 동일하게 쓰임
			InetAddress ip3 =InetAddress.getByName(host3);//getter와 동일하게 쓰임
			for (InetAddress ip: ipAll) {
				System.out.println(ip);
			}
			System.out.println(Arrays.toString(ipAll));
			System.out.println("============");
			System.out.println(ipAll);
			System.out.println(ip2);
			byte[] ipAddr = ip2.getAddress();
				System.out.print("ip : ");
				for(int i=0; i<ipAddr.length;i++)
				if(ipAddr[i]<0) {
					System.out.print(i+256);
				}else {
					System.out.print(i);
				}
			
			
			
			
			System.out.println();
		} catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
	}
}
