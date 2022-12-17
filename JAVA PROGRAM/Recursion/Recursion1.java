import java.util.*;

public class Recursion1 {
	public static void printNum(int n){
	    if(n==0){
	        return;
	    }
	    System.out.print(n + " ");
	    printNum(n-1);
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Any Number : ");
		int x = sc.nextInt();
		System.out.println();
		printNum(x);
		
	}
}