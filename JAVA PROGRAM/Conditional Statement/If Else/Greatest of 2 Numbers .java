import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		System.out.print("Enter Number(a): ");
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		System.out.print("Enter Number(b): ");
		int b =  sc.nextInt();
		
		if (a==b){
		    System.out.println("Equal");
		}
		else {
		    if (a>b){
		        System.out.println("A is Greater");
		        }
		  else{
		      System.out.println("B is Greater");
		  }
		}
	}
}