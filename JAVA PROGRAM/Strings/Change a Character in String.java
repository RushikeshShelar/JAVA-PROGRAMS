import java.util.*;

public class Strings {

	public static void main(String args[]) {
		
		System.out.print("Enter Your Emai : ");
		
		Scanner cc = new Scanner(System.in);
		
		String orginalString = cc.nextLine();

		String result = "";

		for (int i = 0; i < orginalString.length(); i++)    {
			
			if (orginalString.charAt(i) == 'e')
				result += 'i';
			else
				result += orginalString.charAt(i);
				
		}
		System.out.println(result);
	}

}