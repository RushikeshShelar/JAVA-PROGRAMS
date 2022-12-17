import java.util.*;

//stack height = log n 

public class Recursion4 {
	public static int calcPower(int x, int n) {
		if (n == 0) {
			return 1;
		} else if (x == 0) {
			return 0;
		}
		// if x is Even
		if (n % 2 == 0) {
			return calcPower(x, n / 2) * calcPower(x, n / 2);
		}
		//if x is Odd
		else {
			return calcPower(x, n / 2) * calcPower(x, n / 2) * x;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Any Number : ");
		int x = sc.nextInt();
		System.out.println("Enter Power: ");
		int n = sc.nextInt();
		System.out.println();
		int p = calcPower(x, n);
		System.out.println(p);

	}
}