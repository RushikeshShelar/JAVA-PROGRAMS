import java.util.*;

public class Main {
	public static void main(String[] args) {

        Scanner cc = new Scanner(System.in);
        int n = cc.nextInt();
        int count = 0;
        
		for (int i = 1; i <=n; i++) {
		 if (n%i==0)
		 count++;
		}
		
		if(count==2)
		System.out.println("Prime Number");
		else
		System.out.print("Not Prime Number");
	}
}