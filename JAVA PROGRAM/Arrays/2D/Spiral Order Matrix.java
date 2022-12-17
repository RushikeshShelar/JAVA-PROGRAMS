import java.util.*;

public class Arrays {

	public static void main(String args[]) {

		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter No. of Rows :");
		int m = sc.nextInt();

		System.out.print("Enter No. of Coloumn :");
		int n = sc.nextInt();

		int matrix[][] = new int[m][n];

		//input
		System.out.println("Enter Array Elements :");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++)
				matrix[i][j] = sc.nextInt();
		}


		System.out.println("The Spiral Order Matrix is :");

		int rowStart = 0;
		int colStart = 0;
		int rowEnd = m - 1;
		int colEnd = n - 1;


		while (rowStart <= rowEnd && colStart <= colEnd) {

			//going Through 1 St Row
			for (int col = colStart; col <= colEnd; col++) {
				System.out.print(matrix[rowStart][col] + " ");
			}
			rowStart++;


			//going Throgh last Coloumn
			for (int row = rowStart; row <= rowEnd; row++) {
				System.out.print(matrix[row][colEnd] + " ");
			}
			colEnd--;

			//going Through last Row
			for (int col = colEnd; col >= colStart; col--) {
				System.out.print(matrix[rowEnd][col] + " ");
			}
			rowEnd--;


			//going Throgh 1 st Coloumn
			for (int row = rowEnd; row >= rowStart; row--) {
				System.out.print(matrix[row][colStart] + " ");
			}

			colStart++;


		}


	}
}