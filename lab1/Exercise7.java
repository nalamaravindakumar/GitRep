import java.util.*;
public class Exercise7 {
	public static boolean checkNumber(int n)
	{
		boolean flag = true;
		int digit = n % 10;
		n = n/10;
		while(n>0){
			if(digit <n%10){
				flag = false;
				break;
			}
			digit = n%10;
			n=n/10;
		}
		return flag;
	}
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int n =sc.nextInt();
		boolean res = checkNumber(n);
		System.out.println("Increasing Order: "+res);
	}
}

