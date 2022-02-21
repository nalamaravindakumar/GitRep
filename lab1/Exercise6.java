import java.util.*;
public class Exercise6{
	public static int calculateDifference(int n)
	{
		int squareSum=0,numberSum=0,difference=0;
		for(int i=1;i<=n;i++)
		{
			squareSum = squareSum+1*1;
			squareSum = numberSum+1;
			difference=squareSum - numberSum*numberSum;
		}
		return difference;
	}
	public static void main(String args[]){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int res = calculateDifference(n);
		System.out.println("Difference: "+ res);
	}
}

