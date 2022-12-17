import java.util.*;

public class Strings {

	public static void main(String args[]) {
		System.out.print("Enter No. of Strings :");
		Scanner cc = new Scanner(System.in);
		int size = cc.nextInt();

		String array[] = new String[size];

		int totalLength = 0;

		System.out.println("Enter Your Strings:");
		for (int i = 0; i < size; i++)    {

			array[i] = cc.next();
			totalLength = totalLength + array[i].length();
		}
		System.out.println("Total Length = " + totalLength);
	}

}