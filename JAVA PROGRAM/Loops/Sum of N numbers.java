import java.util.*;

public class Main {
	public static void main(String[] args) {

        Scanner cc = new Scanner(System.in);
        int n = cc.nextInt();
		int sum = 0;
		for (int i = 0; i <=n; i++) {
			sum = sum + i;
		}
		System.out.println(sum);
	}
}