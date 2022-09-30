//Application: Program 3
//Name: Royel Fairfax-Byrd
//GitHub User: royelfairfaxbyrd
//Date: Sep 29, 2022
//Version: 1.0
//Description: pre-test, post-test, counter loops

//Initialize the scanner
//Ask the user for their name and a number (integer) between 0 and 100
//Use either a WHILE loop or a DO WHILE loop to perform the following:
//Determine if the number the user entered is between 0 and 100
//If the number is not between 0 and 100, then re-ask the user to enter a new number
//If the number is between 0 and 100, then respond with "Thank you for your input, [user's name]"
//After your WHILE/DO WHILE loop, do the following:
//Create a FOR loop that counts *down* from the user's number to 0
//Every time the loop iterates, output a comment with some sort of entertaining count down



//import the scanner
import java.util.Scanner;
 
public class Program3 {

	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		//Ask user for their name
		System.out.println("What is your name?");
		String name = keyboard.next();
		//Ask user to pick a number between 1 and 100
		System.out.println("\nPick a number between 1 and 100.");
		int number = keyboard.nextInt();
		//Say thank you and count down from the number inputed if the number is valid
		while (number > 0 && number < 100)
		{
		System.out.println("\nThank you so much " + name + " for your input!\n");
		for (int countdown = number; countdown > 0 ; countdown --)
		{
		System.out.println("COUNTING DOWN IN " + countdown);
		}
		break;
		}
		//If inputed number is not valid ask user to input a valid number then say thank you and count down from the valid number
		while(number < 0 || number > 100)
		{
		System.out.println("\nError: Number is not valid\n");
		System.out.println("Please input a vaild number.\n");
		number = keyboard.nextInt();
		
		if(number > 0 && number < 100)
		{
			System.out.println("\nThank you so much " + name + " for your input!\n");
			
			for (int countdown = number; countdown > 0 ; countdown --)
		{
				System.out.println("COUNTING DOWN IN " + countdown);
		}

		}
		
	}
	
	}

	}


