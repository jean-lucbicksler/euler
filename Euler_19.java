package net.pyretaursoft.euler;

public class Euler_19 extends Euler {
	int[] length = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
	public static void main(String[] args)
	{
		euler = new Euler_19();
		main();
	}
	
	public String[] solve()
	{
		int year = 1900;
		int month = 0;
		int dow = 1;
		while(month < 12)
		{
			dow += length[month];
			if(month == 1 && (year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0)))
				dow++;
			dow %= 7;
			month++;
		}
		year++;
		month = 0;
		int counter = 0;
		while(year < 2001)
		{
			while(month < 12)
			{
				dow += length[month];
				if(month == 1 && (year % 4 == 0 && !(year % 100 == 0 && year % 400 != 0)))
					dow++;
				dow %= 7;
				month++;
				if(dow == 0)
					counter++;
			}
			year++;
			month = 0;
		
		}
		String[] solve = {"The number of sundays between our two dates is", ""+counter };
		return solve;
	}
}