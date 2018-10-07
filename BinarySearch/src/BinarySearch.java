import java.util.Scanner;

public class BinarySearch {

	public static int count = 1;

	public static int guess(int low, int high)
	{
		int midpoint = (high + low) / 2;
		
		if(low == high)
			return low;
		else
		{
			System.out.println("Is your number " + midpoint + " ?");
			String input = getInput();
			if(input.equals("YES") || input.equals("Y"))
				return midpoint;
			System.out.println("Is your number higher than " + midpoint + "?");
			input = getInput();
			if(input.equals("YES") || input.equals("Y"))
				{count++;
				return guess(midpoint + 1, high);}
			else if(input.equals("NO") || input.equals("N"))
				{count++;
				return guess(low, midpoint-1);}
		}
		return 0;
		}
		
	
	public static String getInput()
	{
		Scanner kb = new Scanner(System.in);
		
		String input = kb.next().toUpperCase();
		while(!(input.equals("YES") || input.equals("Y")  || input.equals("NO")  || input.equals("N") ))
		{
			//kb.close();
			System.out.println("Illegal Input, use only \"Yes\", \"No\", \"Y\", or \"N\"");
			input = kb.nextLine().toUpperCase();
		}
		//kb.close();
		return input;
				
	}
	
	public static void main(String[] args)
	{
		int number = (guess(1, 1000000));
		System.out.println("Your number is " + number );
		System.out.println("And it only took " + count + (count == 1? " try" : " tries"));

	}
}
