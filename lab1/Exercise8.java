import java.util.*;
public class Exercise8 {
	public static boolean checkNumber(int n)
	{
		if(n==0)
			return false;
		while(n!=1)
		{
			if(n%2!=0)
				return false;
			n=n/2;
		}
		return true;
	}
	public static void main(String arg[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		boolean res = checkNumber(n);
		System.out.println("Power of two: "+res);
	}
} 