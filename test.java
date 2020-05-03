import java.io.File;  
import java.util.Scanner;  
  
public class test {  
  
   public static void main(String[] args) throws Throwable {  
       Scanner sc = new Scanner(new File("C:\\Users\\ASUS\\eclipse-workspace\\WeiFu_Java\\src\\Ex05.txt"), "UTF8");  
       String inputStr = sc.useDelimiter("\\Z").next();  
       sc.close();  
  
       System.out.println(inputStr);  
   }  
}  