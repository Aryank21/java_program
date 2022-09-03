
package JavaApplication_;

/**
 *
 * @author Aryan
 */
import java.net.*; 
import java.util.*; 

public class IPDemo 
{ 
	public static void main(String[] args){ 
		String host; 
                System.out.println("Enter host name: "); 
		Scanner input = new Scanner(System.in); 
		
		host = input.nextLine(); 
		try { 
			InetAddress address = InetAddress.getByName(host);
			System.out.println("IP address: " + address.getHostAddress());
			System.out.println("Host name : " + address.getHostName());  
			System.out.println("Host name and IP address: " + address.toString()); 

		} 
		catch (UnknownHostException ex) {
		     System.out.println("Could not find " + host); 
		}
	} 
}