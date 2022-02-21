class Game
{
	private String player1;
	private String player2;

	 public Game(String player1,String player2)
	{
		 this.player1=player1;	
		 this.player2=player2;
	}
	public String getPlayer1()
	{
		return player1;	
	}
	public String getPlayer2()
	{
		return player2;	
	}
}
class PlayMonitor
{
	Game game;
	String winningTracking="";
	
	public int matchWin(String winningTracking)
	{ 
		this.winningTracking=winningTracking;
		int sum=0;
		int won=0;
		for(int i=0;i<winningTracking.length();i++)
		{
			if(winningTracking.charAt(i)==',')
			{
				 sum=sum+Character.getNumericValue(winningTracking.charAt(i-1));
				 won=won+Character.getNumericValue(winningTracking.charAt(i+1));
			}
		} 
		 int percentage=won*100/sum;
		return percentage;
	}
	public int playerValidate(Game game) 
	{
		String player1=game.getPlayer1();
		String player2=game.getPlayer2();
		boolean v1=validatePlayer(player1);
		boolean v2=validatePlayer(player2);
		 
		if(v1&&v2)
			return 10;
		else if(v1||v2)
			return 5;
		else
			return 0; 
	}
	private boolean validatePlayer(String s1)
	{
		if(s1.charAt(0)>='A' && s1.charAt(0)<='Z')
		{
			for(int i=1;i<s1.length();i++)
			{
				if(s1.charAt(i)>='a' && s1.charAt(i)<='z'||s1.charAt(i)=='-' || s1.charAt(i)==' ')
				{
					continue;
				}
				else
				{
					return false;
				}
			}
			return true;
		}
		 else
		{
			return false;	
		}	 
	}
}
class String_Manipulation3
{
	public static void main(String[] args)
	{
		Game g1=new Game("Pavan","Ranjith");
		PlayMonitor p=new PlayMonitor();
		System.out.println("Validation is = "+p.playerValidate(g1));
		System.out.println("Percentage is = "+p.matchWin("3,2:5,2:2,0"));
		
	}

}