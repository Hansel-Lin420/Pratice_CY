
public class factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i, j, mul, sum = 0;

		for (i = 1; i <= 10; i++) {
			mul = 1;
			for (j = 1; j <= i; j++) {
				mul = mul * j;
			}
			sum = sum + mul;
		}
		System.out.println(sum);
	}
}