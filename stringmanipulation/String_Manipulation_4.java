class Person
{
	private String loc;
	private String name;
	private double salary;
	
	public Person(String loc,String name,double salary)
	{
		this.loc=loc;
		this.name=name;
		this.salary=salary;		
	}
	public void setLoc(String loc)
	{
		this.loc=loc;	
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public void setSalary(double salary)
	{
		this.salary=salary;	
	}
	public String getLoc()
	{
		return loc;	
	}
	public String getName()
	{
		return name;
	}
	public double getSalary()
	{
		return salary;	
	}
}
class String_Manipulation_4
{
	public static void main(String[] args)
	{
		String s1="HydNMKiran-KumarSAL25";
		String s2="BngNMDPavan-KumarSAL30";
		Person p=buildPerson(s1);
		System.out.println("Employee Location = "+p.getLoc());
		System.out.println("Employee Name = "+p.getName());
		System.out.println("Employee Salary = "+p.getSalary());
		 System.out.println("Grade = "+findGrade(p));
		System.out.println();
		Person p1=buildPerson(s2);
		System.out.println("Employee Location = "+p1.getLoc());
		System.out.println("Employee Name = "+p1.getName());
		System.out.println("Employee Salary = "+p1.getSalary());
		 System.out.println("Grade = "+findGrade(p1));	
	}
	public  static Person buildPerson(String locationNameSalaryStringe)
	{
		String loc="",name="";
		double sal=0;
		int i=0;
		while(i<locationNameSalaryStringe.length())
		{
			if(!(locationNameSalaryStringe.charAt(i)=='N' && locationNameSalaryStringe.charAt(i+1)=='M'))
			{
				loc=loc+String.valueOf(locationNameSalaryStringe.charAt(i));	
			}
			else
			{
				i=i+2;
				break;
			}
			i++;
		}
		while(i<locationNameSalaryStringe.length())
		{
			if(!(locationNameSalaryStringe.charAt(i)=='S' && locationNameSalaryStringe.charAt(i+1)=='A'&& locationNameSalaryStringe.charAt(i+2)=='L'))
			{
				name=name+String.valueOf(locationNameSalaryStringe.charAt(i));
			}
			else
			{
				i=i+3;
				break;	
			}
			i++;	
		}
		String temp="";
		while(i<locationNameSalaryStringe.length())
		{
			temp=temp+String.valueOf(locationNameSalaryStringe.charAt(i));
			i++;	
		}
		sal=Double.parseDouble(temp)*1000;
		 Person p1=new Person(loc,name,sal);

		return p1;
	}
	public static String findGrade(Person person)
	{
		String grade="";
		double sal=person.getSalary();
		if(sal>25000)
			grade="A";
		else if(sal>=10000 && sal<=25000)
			grade="B";
		else
			grade="C";
		return grade;	
	}

}