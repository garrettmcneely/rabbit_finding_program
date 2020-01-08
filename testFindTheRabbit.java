import java.util.Scanner;

public class testFindTheRabbit {

	public static void main (String[] args)
	{
		Scanner sc = new Scanner (System.in);
		findTheRabbit r1 = new findTheRabbit();
		int rabbit = r1.getRabbit();
		
		
		System.out.println ("        Find the rabbit!");
		System.out.println ("|   |   |   |   |   |   |   |   |   |   |");

		int[] array = new int [10];
		
			for (boolean found = false; found == false;)
			{
				System.out.println ("Pick a hole (0-9): ");
				int x = sc.nextInt();
				found = r1.check(x);
					if (found == false )
					{
						r1.printLine(x);
					}
					if (found == true)
					{
						r1.rabbitFound(x);
					}
				
			}
		
		
}
}
