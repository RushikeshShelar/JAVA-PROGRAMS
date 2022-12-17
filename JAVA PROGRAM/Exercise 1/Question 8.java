import java.util.*;

public class Main {
	
	public static int raisedTo(int x,int n){
	    int a=1;
	    if(n==0)
	    return 1;
	    else{
	    for(int i = 1;i<=n;i++)
	    a=a*x;
	    return a;
	    }
	    
	    
	    
	}
	public static void main(String[] args) {
		Scanner cc = new Scanner(System.in);
		System.out.print("Enter Base :");
		int x = cc.nextInt();
		System.out.print("Enter Power :");
		int n = cc.nextInt();
		int result = raisedTo(x,n);
		
		System.out.print("The Number "+x+" riased to "+n+" is = "+result);
	
	}
}