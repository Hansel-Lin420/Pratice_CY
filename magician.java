
import java.util.Scanner;

public class magician {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int M, D, S;
		Scanner scn = new Scanner(System.in);
		M = scn.nextInt();
		D = scn.nextInt();
		S = (M * 2 + D) % 3;
		if (S == 0) {
			System.out.println("´¶³q");
		}
		if (S == 1) {
			System.out.println("¦N");
		}
		if (S == 2) {
			System.out.println("¤j¦N");
		}
	}

}
