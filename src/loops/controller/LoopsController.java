package loops.controller;

public class LoopsController
{
	public LoopsController()
	{
		
	}
	public void start()
	{
		int NumberOfTimes = 0;
		while(NumberOfTimes < 5)
		{
			System.out.println("I will say this 5 times.");
			NumberOfTimes++;
		}
		
		int dollars = 0;
		while(dollars < 10)
		{
			System.out.println("I have " + dollars + " dollars!");
			dollars++;
		}
		
		for(int counter = 0; counter <= 3; counter++)
		{
			System.out.println(counter);
		}
		
		for(int time = 0; time < 5; time++)
		{
			System.out.println(time + "seconds!");
		}
		
			
	}
}
