import java.util.Scanner;

public class CheckDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		int year = scn.nextInt();
		int month = scn.nextInt();
		int day = scn.nextInt();
		int daycheck = 0;
		boolean Leap = false;

		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
			Leap = true;
		}
		if (month <= 7 && month % 2 == 1) {
			daycheck = 31;
		} else if (month == 2 && Leap == true) {
			daycheck = 29;
		} else if (month == 2 && Leap != true) {
			daycheck = 28;
		} else if (month <= 7 && month % 2 == 0) {
			daycheck = 30;
		}
		if (month > 7 && month % 2 == 0) {
			daycheck = 31;
		} else if (month > 7 && month % 2 == 1) {
			daycheck = 30;
		}
if(day<=daycheck) {
	System.out.println(year+"/"+month+"/"+day);
}else {
	System.out.println("¤é´Á¿ù»~");
}
	}
}
