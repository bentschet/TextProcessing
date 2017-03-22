package text.controller;

import java.util.Scanner;
import java.util.Random;

public class TextController 
{
	Scanner userInput = new Scanner(System.in);
	Random randomPlay = new Random();
	String finalPlay = new String();
	String response = new String();
	
	
	public void start()
	{
		System.out.print("Which will you play: Rock, Paper, or Scissors?");
		String response = userInput.next();
		
		
		//System.out.println("You played: " + response);
	}
	
	public void playRandom()
	{
		// Generates a random play from the computer.
		int randomPlay = (int)(Math.random() * 3 + 1);
		if(randomPlay == 1)
		{
			finalPlay = "Rock";
		}
		else if(randomPlay == 2)
		{
			finalPlay = "Paper";
		}
		else
		{
			finalPlay = "Scissors";
		}
	}
	
	public void readPlay()
	{
		// Reads input and converts it to a "play", numbers 1 2 or 3.
	}
}
