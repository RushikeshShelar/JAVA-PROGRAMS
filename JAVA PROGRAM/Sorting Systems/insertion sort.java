import java.util.*;

public class Main {
	//function for Printing Sorted array
	public static void printArray(int arr[]) {

		System.out.println("Sorted Array :");
		for (int i = 0 ; i < arr.length ; i++) {
			System.out.print(arr[i] + " ");
		}
	}

	public static void main(String[] args) {
		Scanner cc = new Scanner(System.in);
		System.out.print("Enter the No. of Elements : ");
		int size = cc.nextInt();
		int arr[] = new int [size];

		//Input array
		System.out.println("Enter The Elements :");
		for (int i = 0 ; i < arr.length; i++)
			arr[i] = cc.nextInt();

		//insertion sort
		for (int i = 1; i < arr.length; i++) {
			int current = arr[i];
			int j = i - 1;

			while (j >= 0 && current < arr[j]) {
				arr[j + 1] = arr[j];
				j--;
			}

			//placement of Value
			arr[j + 1] = current;
		}
		printArray(arr);

	}
}