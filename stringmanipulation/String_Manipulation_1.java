class String_Manipulation_1
{
	String s1 = "Hin dustan";
	String s2 = "dust";
    public static String concatAdd(String s1,String s2) 
    {
      s1 = s1.concat(s2);
      s1=s1.replaceAll(" ","");
       return s1;
     }
    public static String reverse(String s1) 
    {
     StringBuffer str = new StringBuffer(s1);
      String Reverse = str.reverse().toString();
      return Reverse;
     } 
    protected static int paddingIndex(String s2,String s3) 
    {
       return s2.indexOf(s3);
     }
    public static boolean isDigit(String s1) 
    {	 
		for(int i=0;i<s1.length();i++)
		{
			char ch=s1.charAt(i);
			if(ch>='0' && ch<='9')
				continue;
			else
				return false;	
		}
		return true; 
    }
   public static void main(String[] args){
   String_Manipulation_1 s = new String_Manipulation_1();
    System.out.println(concatAdd(s.s1,s.s2));
    System.out.println(reverse(s.s1));
    System.out.println(paddingIndex(s.s1,s.s2));
    System.out.println(isDigit(s.s2));
    }
}
    