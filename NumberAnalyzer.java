//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.ArrayList;
import java.util.Scanner;

public class NumberAnalyzer
{
	//Instance Variable/Collection
	private ArrayList<Number> list;

	//Default Constructor
	public NumberAnalyzer()
	{
		//Just make the ArrayList exist.
		ArrayList list = new ArrayList();
	}

	//Modified Constructor
	public NumberAnalyzer(String numbers)
	{
		//Make the list exist first
		list = new ArrayList<Number>();

		//Filter the parameter through to the set method
		setList(numbers);
	}

	//Methods
	public void setList(String numbers)
	{
		//Clear the list
		list.clear();

		//Create a scanner to chop up the string of numbers
		Scanner chopper = new Scanner(numbers);

		//Chop up the string
		while(chopper.hasNextInt())
		{
			list.add(new Number(chopper.nextInt()));
		}

	}

	public int countOdds()
	{
      	int oddCount=0;
		
		for(Number x: list)
			if (x.isOdd())
				oddCount++;

      	return oddCount;
	}

	public int countEvens()
	{
      	int evenCount=0;

		for(Number x: list)
			if (!x.isOdd())
				evenCount++;

      	return evenCount;

      	/*
      	 *Other option - If it's not odd, it's even
      	 *
      	 *return list.size()-countOdds();
      	 *
      	 */
	}

	public int countPerfects()
	{
      	int perfectCount=0;

		for(Number x: list)
			if (x.isPerfect())
				perfectCount++;

      	return perfectCount;
	}

	public String toString( )
	{
		return "" + list;
	}
}