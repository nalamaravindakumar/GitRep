import java.util.Scanner;
class NameException extends Exception{
NameException(){
Super();
}
}
Class Exercise5{
public static void main(String[]args){
String firstName="";
String lastName="";
try{
  if((lastName.equals("") &&(lastName.equals(""))){
System.out.println("Exception occured");
throw new NameException();
}
else{
System.out.println(FirstName+" "+lastName);
}
}
catch(Exception e){
System.out.println("Enter valid name");
}
}
}