import java.util.*;


public class Solutions {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number 1:");
		int n1 = sc.nextInt();
		System.out.print("Enter Number 2 :");
		int n2 = sc.nextInt();


		while (n1 != n2) {

			if (n1 > n2) {

				n1 = n1 - n2;

			} else {

				n2 = n2 - n1;

			}

		}

		System.out.println("GCD is : " + n2);

	}

}