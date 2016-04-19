package net.pyretaursoft.euler;

public class Euler_15 extends Euler {
	public static void main(String[] args)
	{
		euler = new Euler_15();
		main();
	}

	public String[] solve()
	{
		int sum = 0;
		for(long path = 0b11111111111111111111;	path < 1099510579200L; path++)
		{
			int count = 0;
			for(int i = 0; i < 40; i++)
				if(((1 << i) & path) == 1)
					count++;
			if(count == 20)
				sum++;
			System.out.println(path - 1099510579200L);
		}
		String[] solve = { "", ""+sum };
		return solve;
	}
}