import java.util.*;


public class Main {


	public static int greatestNum(int a,int b) {
        if(a>b)
       	return a;
       else
       	return b;
	}
	public static void main(String[] args) {
		System.out.println("Enter any two Number");
		Scanner cc = new Scanner(System.in);
		int a = cc.nextInt();
		int b = cc.nextInt();
		int c = greatestNum(a,b);
			System.out.println("Greatest Number:"+c);
	}
}