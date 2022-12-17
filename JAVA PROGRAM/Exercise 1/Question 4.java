import java.util.*;


public class Main {


	public static double circumference(double r) {
	   double a = 2*3.14*r;
        return a;
	}
	public static void main(String[] args) {
		System.out.println("Enter Radius of Circle :");
		Scanner cc = new Scanner(System.in);
		double r = cc.nextInt();
		
		System.out.println(circumference(r));
	}
}