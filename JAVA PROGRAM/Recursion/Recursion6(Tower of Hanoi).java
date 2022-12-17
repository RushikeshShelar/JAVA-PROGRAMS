import java.util.*;

public class Main {
	public static void towerOfHanoi(int n, String src, String helper, String dest) {
		if (n == 1) {
			System.out.println("Transfer disk " + n + " from " + src + " to " + dest);
			return;
		}
		//transfer top n-1 from src to helper using dest as 'helper'
		towerOfHanoi(n - 1, src, dest, helper);
		//transfer nth from src to dest
		System.out.println("Transfer disk " + n +    " from " + src + " to " + dest);
		//transfer n-1 from helper to dest using src as 'helper'
		towerOfHanoi(n - 1, helper, src, dest);
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Number of disks : ");
		int x = sc.nextInt();
		towerOfHanoi(x, "S", "H", "D");
	}
}