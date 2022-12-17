import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		System.out.print("Enter String : ");
		
		Scanner cc = new Scanner (System.in);
		
		String og = cc.next();
		String reverse = "";

		for(int i = og.length()-1; i >=0 ; i--)
		reverse += og.charAt(i);
		
		System.out.println(reverse);
		
		
	}
}