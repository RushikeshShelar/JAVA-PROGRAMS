import java.util.*;

public class Main {
	public static void main(String[] args) {
		System.out.println("Enter Any Two Numbers : ");

		Scanner CC = new Scanner(System.in);
		int a = CC.nextInt();
		int b = CC.nextInt();
		
		System.out.println("Choose Operator :");
		
		System.out.println("1 -> Add");
		System.out.println("2 -> Subtract");
		System.out.println("3 -> Multiply");
		System.out.println("4 -> Divide");
		System.out.println("5 -> Remainder");
		
		int operator = CC.nextInt();

		switch (operator) {
		    case 1:
		    System.out.println(a+b);
		    break;
            case 2:
		    System.out.println(a-b);
		    break;
		    case 3:
		    System.out.println(a*b);
		    break;
		    case 4: if(b==0){
		            System.out.println("Invalid Division");
		    }
		    else {
		    	    System.out.println(a/b);
		    }
		    break;
		    case 5: if (b==0){
		            System.out.println("Invalid Division");
		    }
		    else{
		    System.out.println(a%b);
		    }
		    break;
		    default: 
		    System.out.println("Invalid Operator");
		}

		}
	}