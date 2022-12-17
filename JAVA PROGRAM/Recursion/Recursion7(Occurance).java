import java.util.*;

public class Main {
	public static int first = -1;
	public static int last = -1;
	public static void findOccurance(String src, int idx, char element) {
		if (idx == src.length()) {
			System.out.println("First : " + first);
			System.out.println("Last : " + last);
			return;
		}
		char currChar = src.charAt(idx);
		if (currChar == element) {
			if (first == -1) {
				first = idx;
			} else {
				last = idx;
			}
		}
		findOccurance(src, idx + 1, element);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter A String : ");
		String x = sc.nextLine();
		findOccurance(x, 0, 'a');
	}
}