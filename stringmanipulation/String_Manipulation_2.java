import java.util.*;
class String_Manipulation_2{
    public static int isNumber(String s1){
     int a = Integer.parseInt(s1);
     int sum = 0;
     if(a<9)
       { 
          return a;
       }
      else{
              while(a>0)
                  {
    		 sum = sum+a%10;
    		 a=a/10;
    	           }
    	 return sum;               
}
}    public static void subString(String s2){
       for(int i = 0 ;i <s2.length();i++)
         {
           char c,m;
		if((s2.charAt(i) == 'c')&& (s2.charAt(i+2) =='m'))
             { 
              System.out.println(s2.charAt(i)+""+s2.charAt(i+1)+""+s2.charAt(i+2));
             }
 
          }   
}
     public static void subString2(String s2){
       for(int i = 0 ;i <s2.length();i++)
         {
           char c,m;
		if((s2.charAt(i) == 'c')&& ((s2.charAt(i+2) =='m')||(s2.charAt(i+2) =='p')))
             { 
              System.out.println(s2.charAt(i)+""+s2.charAt(i+1)+""+s2.charAt(i+2));
             }
 
          }   
}
    public static void main(String[] args)
     { 
         Scanner sc = new Scanner(System.in);
         System.out.println("Enter a String1");
         String s1 = sc.nextLine();
         System.out.println("Enter a String2");
         String s2 = sc.nextLine();  
         System.out.println(isNumber(s1));
         subString(s2);
         subString2(s2);
     } 
}