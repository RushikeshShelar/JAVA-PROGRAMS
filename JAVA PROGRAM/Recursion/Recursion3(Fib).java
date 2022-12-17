import java.util.*;

public class Recursion3{
	public static void printFib(int a,int b,int n){
	   if(n==0){
	       return;
	   }
	   int c = a+b;
	   System.out.print(c+" ");
	   printFib(b,c,n-1);
	   
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter Any Number : ");
		int x = sc.nextInt();
		int a = 0 ,b =1;
		System.out.print(a+" ");
		System.out.print(b+" ");
		printFib(a,b,x-2);
		
	}
}