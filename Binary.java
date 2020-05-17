

import java.util.*;

public class Binary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		binaryToDecimal(10);

	}
	public static void binaryToDecimal(int n){

		int t = 0; 

		int bin = 0; 

		int r = 0; 

		while(n != 0){

		r = n % 2;

		n = n / 2;

		bin += r * Math.pow(10,t);

		t++; 

		}

		System.out.println(bin);

		}
}
