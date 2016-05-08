package net.pyretaursoft.euler;

public class Euler_21 extends Euler {
	public static void main(String[] args)
	{
		euler = new Euler_21();
		main();
	}

	public long divisorSum(long i)
	{
		long sum = 1;
		for(int j = 2; j*j < i; j++)
			if(i % j == 0)
			{
				sum += j + i/j;
			}
		return sum;
	}

	public long love(long l)
	{
		long love = divisorSum(l);
		if(love != l && divisorSum(love) == l)
			return love;
		else
			return -1;
	}

	public String[] solve()
	{
		long sum = 0;
		for(int i = 3; i < 10000; i++)
		{
			long love = love(i);
			if(love != -1 && love < 10000) {
				sum += i+love;
				System.out.print(love + " " + i + "\n");
			}
		}
		sum /= 2;
		String[] solve = {"The sum of all the amicable numbers below 10 thou is", ""+sum };
		return solve;
	}
}