import java.util.*;

public class Strings {

	public static void main(String args[]) {
		
		System.out.print("Enter Your Emai : ");
		
		Scanner cc = new Scanner(System.in);
		
		String orginalString = cc.nextLine();

		String userName = "";

		for (int i = 0; i < orginalString.length(); i++)    {
			
			if (orginalString.charAt(i) == '@')
				break;
			else
				userName += orginalString.charAt(i);
				
		}
		System.out.println(userName);
	}

}