import java.util.*;

public class exercise {
	public static void main(String args[]) {
		Scanner cc = new Scanner(System.in);
		int positive = 0, negative = 0, zero = 0;

		System.out.println("Press 1 to Continue & 0 to Stop");
		int input = cc.nextInt();

		while (input == 1) {
			System.out.print("Enter Number = :");
			int number = cc.nextInt();

			if (number == 0)
				zero++;
			else if (number > 0)
				positive++;
			else
				negative++;
				
			System.out.println("Press 1 to continue & 0 to stop");

           input = cc.nextInt();
		}
		
		System.out.println("No. of Positive = "+positive);
		System.out.println("No. of Negative = "+negative);
		System.out.println("No. of Zero = "+zero);
	}
}
