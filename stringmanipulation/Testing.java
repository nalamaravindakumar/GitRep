import java.util.*;
class  Bucket
{
	String data;
	int counter;
	int value;
	int number;
	Bucket()
	{
	}
	public String getData() {
		return data;
	}
	public void setData(String data) {
		this.data = data;
	}
	public int getCounter() {
		return counter;
	}
	public void setCounter(int counter) {
		this.counter = counter;
	}
	public int getValue() {
		return value;
	}
	public void setValue(int value) {
		this.value = value;
	}
}
	
class Testing {
	public static void main(String [] args)
	{
		Testing t1 =new Testing();
		Scanner sc= new Scanner(System.in);
		Bucket bkt =new Bucket();
		System.out.println("Enter a String contains number");
		String str1 = sc.next();
		t1.transfer(str1,bkt);
		System.out.println("Enter a String");
		String str2 = sc.next();
		System.out.println("Enter a Character");
		char c = sc.next().charAt(0);
		t1.countChars(str2,c,bkt);
		t1.reverse(str2);
		System.out.println(t1.transfer(str1,bkt));
		System.out.println(t1.countChars(str2,c,bkt));
		System.out.println(t1.reverse(str2));
		System.out.println(bkt.getValue());
		System.out.println(bkt.getCounter());
}
	int transfer(String str1,Bucket bkt)
	{
		bkt.setValue(Integer.parseInt(str1));
		return Integer.parseInt(str1);
	}
	int countChars(String str2 ,char c,Bucket bkt)
	{ 
		int count = 0;
		for(int i = 0;i<str2.length();i++)
		{
			if(str2.charAt(i) =='c')
			{
				count++;
			}
		}
		bkt.setCounter(count);
		return count;	
	}
	String reverse( String str2)
	{
		StringBuffer s1 = new StringBuffer(str2);
		return s1.reverse().toString();
		
	}
	}

