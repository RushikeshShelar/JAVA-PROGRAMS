import java.util.*;

public class Main {
	public static void main(String[] args) {
		
		System.out.print("Enter Your Age : ");
		Scanner sc=new Scanner(System.in);
		int a = sc.nextInt();
		
		
		if (a<18){
		    System.out.println("Minor");
		}
		else {
		    System.out.println("Adult");
		}
		
	}
}