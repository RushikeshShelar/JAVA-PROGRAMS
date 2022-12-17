import java.util.*;

public class Main {
	public static void moveAllX(String str, int idx, int count, String newStr) {
		if (idx == str.length()) {
			for (int i = 0; i < count; i++) {
				newStr += 'x';
			}
			System.out.println(newStr);
			return;
		}

		char currentChar = str.charAt(idx);
		if (currentChar == 'x') {
			count++;
			moveAllX(str, idx + 1, count, newStr);
		} else {
			newStr += currentChar;
			moveAllX(str, idx + 1, count, newStr);
		}
	}
	
	public static void main(String[] args) {
	    Scanner cc = new Scanner (System.in);
	    String A = cc.nextLine();
	    moveAllX(A,0,0,"");
	}
}