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
		for (int i = 0 ; i < arr.length ; i++)
			arr[i] = cc.nextInt();


		//Time Complexcity = O(n^2)
		//bubble sort
		for (int i = 0 ; i < arr.length - 1; i++) {
			for (int j = 0 ; j < arr.length - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					//swap
					int temp = arr[j];
					arr[j] = arr [j + 1];
					arr[j + 1] = temp;
				}
			}
		}
		printArray(arr);
	}
}