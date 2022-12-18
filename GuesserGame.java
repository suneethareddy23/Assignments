package in.ineuron.main;

import java.util.Scanner;

class Introduction {
	void intro() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Hello!! Are you feeling bored now? (yes/no): ");
		String response = sc.nextLine();
		if (response.equalsIgnoreCase("yes")) {
			System.out.println("Oh okay dear, Let's play Guesser game \n");
		} 
		else {
			System.out.println("That's great! Have a nice day!");
			System.exit(0);
		}
	}
}

class Guesser
{
	int guessNum;
	
	int guessNum()
	{	
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Hello Guesser!! Please enter your name");
		String s1=scan.nextLine();
		System.out.println("Hey "+s1+"! kindly guess the number");
		guessNum=scan.nextInt();
		return guessNum;
	}	
}

class Player
{
	int guessNum;
	
	int guessNum()
	{
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		System.out.println("Hey player!! Please enter your name");
		String s1=scan.nextLine();
		System.out.println("Hey "+s1+"! kindly guess the number");
		guessNum=scan.nextInt();
		return guessNum;
	}
}

class Umpire
{
	int numFromGuesser;
	int numFromPlayer1;
	int numFromPlayer2;
	int numFromPlayer3;
	
	void collectNumFromGuesser()
	{
		Guesser g=new Guesser();
		numFromGuesser=g.guessNum();
	}
	void collectNumFromPlayers()
	{
		Player p1=new Player();
		Player p2=new Player();
		Player p3=new Player();
		numFromPlayer1=p1.guessNum();
		numFromPlayer2=p2.guessNum();
		numFromPlayer3=p3.guessNum();
	}
	void compare()
	{
		if(numFromGuesser==numFromPlayer1)
		{
			if(numFromGuesser==numFromPlayer2 && numFromGuesser==numFromPlayer3)
			{
				System.out.println("All players won the game");
			}
			else if(numFromGuesser==numFromPlayer2 )
			{
				System.out.println("Player 1 & Player2 won");
			}
			else if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 1 & Player3 won");
			}
			else
			{
			System.out.println("Player 1 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer2)
		{
			if(numFromGuesser==numFromPlayer3)
			{
				System.out.println("Player 2 & Player3 won");
			}
			else
			{
			System.out.println("Player 2 won the game");
			}
		}
		else if(numFromGuesser==numFromPlayer3)
		{
			System.out.println("Player 3 won the game");
		}
		else
		{
			System.out.println("Game lost Try Again!");
		}
		
	}
	
}

public class GuesserGame {

	public static void main(String[] args) {
		while (true) {
			Introduction intro = new Introduction();
			intro.intro();
			Umpire u=new Umpire();
			u.collectNumFromGuesser();
			u.collectNumFromPlayers();
			u.compare();
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			// Ask the user if they want to play again
			System.out.print("\nDo you want to play again? (yes/no): ");
			String playAgain = input.nextLine();
			if (playAgain.equalsIgnoreCase("yes")) {
				
			}
			else {
				System.out.println("\nOkay, Take care. Bye!!");
				break;
			}
	    }

	}

}
