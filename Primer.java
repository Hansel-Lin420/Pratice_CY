import java.util.Scanner;

public class Primer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		if (n >= 4 && n <= 1000) {
			for (int i = 2; i <= n / 2; i++) {
				if (prime(i) && prime(n - i)) {
					System.out.println(n + "=" + i + "+" + (n - i));
				}
			}


	}

}

	private static boolean prime(int n) {
		// TODO Auto-generated method stub
		boolean flag = true;
		if (n == 2 || n == 3) {

		} else {
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					flag = false;
					break;
				}
			}
		}
		return flag;
	}
	}
