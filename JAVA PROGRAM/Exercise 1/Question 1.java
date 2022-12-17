import java.util.*;


public class Main {
	
	
	public static void averageOfThree(int a,int b,int c){
    int avg = (a+b+c)/3;
    System.out.println("Average :"+avg);
    return;
}
	public static void main(String[] args) {
		System.out.println("Enter any 3 Numbers");
		Scanner cc = new Scanner(System.in);
		int a = cc.nextInt();
		int b = cc.nextInt();
		int c = cc.nextInt();
		averageOfThree(a,b,c);
	}
}