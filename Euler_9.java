package net.pyretaursoft.euler;

public class Euler_9 extends Euler {
	public static void main(String[] args)
	{
		euler = new Euler_9();
		main();
	}
	
	public String[] solve()
	{
		int ans = -1;
		for(int a = 1; a < 50 && ans == -1; a++)
			for(int b = 1; b < 50 && ans == -1; b++)
				for(int c = 1; c < 50 && ans == -1; c++)
					if(a*a+b*b == c*c)
						for(int d = 1; d*(a+b+c) <= 1000 && ans == -1; d++)
							if(d*(a+b+c) == 1000)
								ans=d*d*d*a*b*c;
		String[] solve = {"The product abc of the a+b+c=1000 Pythagorean triplet is", ""+ans };
		return solve;
	}
}