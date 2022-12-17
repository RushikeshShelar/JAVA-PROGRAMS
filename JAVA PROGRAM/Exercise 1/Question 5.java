import java.util.*;


public class Main {


	public static void eligibleToVote(int age) {
        if(age>18)
       	System.out.println("Eligible to Vote");
       else
           System.out.println("Not Eligible to Vote");
           return;
	}
	public static void main(String[] args) {
		System.out.println("Enter Age:");
		Scanner cc = new Scanner(System.in);
		int age = cc.nextInt();
		eligibleToVote(age);
	}
}