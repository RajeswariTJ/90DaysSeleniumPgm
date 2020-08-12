package javaPgm.day6;
import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddress {
	
	public static void main(String[] args) throws UnknownHostException {
		
		InetAddress IP = InetAddress.getLocalHost();
		System. out. println("IP address of my system is : "+IP.getHostAddress());
		
	}

}
