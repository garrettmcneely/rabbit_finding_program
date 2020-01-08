import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;
public class findTheRabbit
{
	
	Random random = new Random ();
	int rabbit;
	char [] array = new char[] {' ',' ',' ',' ', ' ', ' ', ' ', ' ', ' ',' '};
		
	int getRabbit()
	{
		setRabbit();
		return rabbit;
	}
	
	void setRabbit()
	{
	
		rabbit = random.nextInt(10);
	}
	
	boolean check (int x)
	{
		
		if (x == rabbit)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	void printLine (int x )
	{
		
		
		
		
		switch (x)
		{
		case 9:
			array[9] = 'x';
			break;
		case 8: 	
			array[8] = 'x';
			break;
		case 7:
			array[7] = 'x';
			break;
		case 6:
			array[6] = 'x';
			break;
		case 5:
			array[5] = 'x';
			break;
		case 4:
			array[4] = 'x';
			break;
		case 3: 
			array[3] = 'x';
			break;
		case 2:
			array[2] = 'x';
			break;
		case 1: 
			array[1] = 'x';
			break;
		case 0:
			array[0] = 'x';
			break;
			
			
		}
		
		System.out.println ("| "+array[0]+" | "+array[1]+" | "+array[2]+" | "+array[3]+" | "+array[4]+" | "+array[5]+" | "+array[6]+" | "+array[7]+" | "+array[8]+" | "+array[9]+" | ");
		
	}
	void rabbitFound (int x )
	{
		
		
		
		
		switch (x)
		{
		case 9:
			array[9] = 'R';
			break;
		case 8: 	
			array[8] = 'R';
			break;
		case 7:
			array[7] = 'R';
			break;
		case 6:
			array[6] = 'R';
			break;
		case 5:
			array[5] = 'R';
			break;
		case 4:
			array[4] = 'R';
			break;
		case 3: 
			array[3] = 'R';
			break;
		case 2:
			array[2] = 'R';
			break;
		case 1: 
			array[1] = 'R';
			break;
		case 0:
			array[0] = 'R';
			break;
			
			
		}
		
		System.out.println ("| "+array[0]+" | "+array[1]+" | "+array[2]+" | "+array[3]+" | "+array[4]+" | "+array[5]+" | "+array[6]+" | "+array[7]+" | "+array[8]+" | "+array[9]+" | ");
		System.out.println ("You found the rabbit! ");
		
	}
	
	
}