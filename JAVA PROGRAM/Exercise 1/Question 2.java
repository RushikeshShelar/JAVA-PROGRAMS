import java.util.*;


public class Main {


	public static void sumOfOdd(int a) {
		int sum = 0;
		for (int i = 1; i <= a; i += 2)
			sum=sum+i;
			System.out.println("Sum :" + sum);
		return;
	}
	public static void main(String[] args) {
		System.out.println("Enter any Number");
		Scanner cc = new Scanner(System.in);
		int a = cc.nextInt();
		sumOfOdd(a);
	}
}