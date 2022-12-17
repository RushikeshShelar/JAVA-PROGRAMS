import java.util.*;


public class Arrays {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter No. of Rows :");
		int rows = sc.nextInt();
System.out.print("Enter No. of Coloumns :");
int coloumns = sc.nextInt();
		int numbers[][] = new int[rows][coloumns];

		//input
		System.out.println("Enter Array Elements :");
		for (int i = 0; i < rows; i++) {
			for(int j = 0;j<coloumns;j++)
			numbers[i][j] = sc.nextInt();
		}
		
		System.out.println("Enter no.to Search");
		int x = sc.nextInt();
		
		for (int i = 0; i < rows; i++) {
			for(int j = 0;j<coloumns;j++){
			if(numbers[i][j] == x)
			System.out.println("Found at Indices ("  +i+"," + j+")");
			}
		}
		
	}
}