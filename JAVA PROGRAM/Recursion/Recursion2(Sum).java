import java.util.*;

public class Recursion3{
	public static int fact(int n){
	    if(n==0){
	        return 1;
	    }
	    else
	    return n*fact(n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Any Number : ");
		int x = sc.nextInt();
		System.out.println();
		int f = fact(x);
		System.out.println(f);
		
	}
}