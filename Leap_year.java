import java.util.Scanner;

public class Leap_year {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		while (true) {
			int Y = scn.nextInt();
			int M = scn.nextInt();
			boolean Leap = false;

			if (Y % 4 == 0 && Y % 100 != 0 || Y % 400 == 0) {
				Leap = true;
			}
			if (M <= 7 && M % 2 == 1) {
				System.out.println("31");
			} else if (M == 2 && Leap == true) {
				System.out.println("29");
			} else if (M == 2 && Leap != true) {
				System.out.println("28");
			} else if (M <= 7 && M % 2 == 0) {
				System.out.println("30");
			}
			if (M > 7 && M % 2 == 0) {
				System.out.println("31");
			} else if (M > 7 && M % 2 == 1) {
				System.out.println("30");
			}
		}
	}
}
