import java.util.Scanner;
 
class AgeException extends Exception {
 
 public AgeException(String str) {
  System.out.println(str);
 }
}
public class AgeLimit {
 
 public static void main(String[] args) {
  Scanner s = new Scanner(System.in);
  System.out.print("Enter ur age :: ");
  int age = s.nextInt();
  
  try {
   if(age < 15) 
    throw new AgeException("Age of the person is above 15");
   else
    System.out.println("Valid age");
  }
  catch (AgeException a) {
   System.out.println(a);
	}
}
}