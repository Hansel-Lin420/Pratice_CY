import java.io.File;  
import java.util.Scanner;  
  
public class test {  
  
   public static void main(String[] args)  {  
     Scanner scn = new Scanner(System.in);
     int n = scn.nextInt();
     String str = "";
     while(n>0) {
    	 str = Integer.toString(n%2)+str;
    	 n=n/2;
     }
     str = Integer.toString(n)+str;
     System.out.printf("%08d\n", Integer.parseInt(str));
   }  
}  