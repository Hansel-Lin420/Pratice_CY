
import java.util.Scanner;
public class year {
	public static void main(String[] args) {
Scanner scn = new Scanner(System.in);
int y;
y = scn.nextInt();
if(y%4==0||y%100!=0&&y%400==0) {
	System.out.println("¶|¦~");
	}else {
	System.out.println("¥­¦~");
}
}
}