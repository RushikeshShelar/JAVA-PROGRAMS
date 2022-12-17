import java.util.*;

public class Recursion4{
	public static int calcPower(int x,int n){
	    if(n==0){
	        return 1;
	    }
	    else if(x==0){
	        return 0;
	    }
	    else{
	    return x*calcPower(x,n-1);
	    }
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Any Number : ");
		int x = sc.nextInt();
		System.out.println("Enter Power: ");
		int n = sc.nextInt();
		System.out.println();
		int p = calcPower(x,n);
		System.out.println(p);
		
	}
}