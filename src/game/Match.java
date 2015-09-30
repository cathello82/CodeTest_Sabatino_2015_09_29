package game;

import bean.Player;

public class Match {

	Player player1;
	Player player2;
	
	public Match ()
	{
		player1 = new Player();
		player2 = new Player();
	}
	
	private String checkGamePoint()
	{		
		if (player1.getPoint().getIndice() == 4 && (player1.getPoint().getIndice() - player2.getPoint().getIndice() >= 2))
			return "Player 1 win the game";		
		if (player2.getPoint().getIndice() == 4 && (player2.getPoint().getIndice() - player1.getPoint().getIndice() >= 2))
			return "Player 2 win the game";		
		if ((player1.getPoint().getValuePoint().equals("forty") || player2.getPoint().getValuePoint().equals("forty")) && (player1.getPoint().getIndice() == 4 || player2.getPoint().getIndice() == 4))
			return "advantage";
		if (player1.getPoint().getIndice() < 4 && player2.getPoint().getIndice() < 4)
		{
			if (player1.getPoint().getValuePoint().equals("forty") && player1.getPoint().getValuePoint().equals(player2.getPoint().getValuePoint()))
				return "deuce";
		}
		return "";
	}	
	
	private void addPoint()
	{
		int x = (int)Math.random() + 1/2;
		if (x == 0)
			player1.getPoint().addPoint();
		else
			player2.getPoint().addPoint();
	}
	
	public String matchDeuce()
	{
		player1.getPoint().setPoint(3);
		player2.getPoint().setPoint(3);
		return checkGamePoint();
	}
	
	public String matchAdvantage()
	{
		player1.getPoint().setPoint(3);
		player2.getPoint().setPoint(4);
		return checkGamePoint();
	}
	
	public String startMatch()
	{
		String result = checkGamePoint();
		while (result == "")
		{			
			addPoint();
			result = checkGamePoint();
		}
		return result;
	}
	
}
