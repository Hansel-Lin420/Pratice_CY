
import java.util.Scanner;

public class English {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		String str = scn.nextLine();
		char[] charArr = str.toCharArray();
		int ch, count = 0;
		for (int i = 0; i < charArr.length; i++) {
			ch = charArr[i];
			if (ch >= 65 && ch <= 90 || ch >= 97 && ch <= 122) {
				count += 1;

			}

		}
		System.out.println(count);

	}

}
