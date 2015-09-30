package game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Match game = new Match();
		String [] valore;
		String result;
		
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		
		String nome;
		
		
		System.out.println("Simulazione Set di Tennis tra due player:");
		System.out.println("Premi 1 per Set in advance");
		System.out.println("Premi 2 per Set in deuce");
		System.out.println("Premi 3 per un vincitore");
		try {
			nome = tastiera.readLine();
			switch (nome)
			{
				case "1": result = game.matchAdvantage();break;				
				case "2": result = game.matchDeuce();break;
				case "3": result = game.startMatch();break;
				default: result = game.startMatch();break;
			}
			
			System.out.println(result);
		} 
		catch (IOException e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
