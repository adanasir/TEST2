/*
SITI AMINAH SHUHADA MAT NASIT
2014433638
adanasir@gmail.com
github.com/adanasir
*/


//Company A
package test2;

import java.net.*;

public class main{
	
   public static void main(String[] args){
		
	Inet6Address ip;
	try {
			
		ip = (Inet6Address) Inet6Address.getLocalHost();
		System.out.println("Current IP address : " + ip.getHostAddress());
		
		NetworkInterface network = NetworkInterface.getByInetAddress(ip);
			
		byte[] mac = network.getHardwareAddress();
			
		System.out.print("Current MAC address : ");
			
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < mac.length; i++) {
			sb.append(String.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : ""));		
		}
		System.out.println(sb.toString());
			
	} 
        
        catch (UnknownHostException e) {
		
		e.printStackTrace();
		
	} catch (SocketException e){
			
		e.printStackTrace();
			
	}
	    
   }

}