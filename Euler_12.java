package net.pyretaursoft.euler;

import java.util.ArrayList;

public class Euler_12 extends Euler {
	ArrayList<Long> primes = new ArrayList<Long>();
	public static void main(String[] args)
	{
		euler = new Euler_12();
		main();
	}

	public int divisors(long i)
	{
		ArrayList<Integer> count = new ArrayList<Integer>();
		double sqrt = Math.sqrt(i);
		int max_Index = 0;
		for(int j = 0; primes.get(j) <= sqrt; j++)
		{
			count.add(new Integer(0));
			if(j == primes.size()-1)
			{
				primes.add(new Long(primes.get(primes.size()-2)+2));
				for(int k = 0; k < primes.size()-1; k++)
					if(primes.get(primes.size()-1) % primes.get(k) == 0)
					{
						k = 0;
						primes.set(primes.size()-1,primes.get(primes.size()-1)+2);
					}
				System.out.print(primes.get(primes.size()-1) + " ");
			}
			while(i % primes.get(j) == 0)
			{
				i /= primes.get(j);
				count.set(j, new Integer(count.get(j)+1));
				max_Index = j;
			}
		}
		int divisors = 1;
		for(int j = 0; j < max_Index; j++)
			divisors+=count.get(j);
		System.out.print(divisors + " ");
		return divisors;
	}

	public String[] solve()
	{
		primes.add(new Long(2));
		primes.add(new Long(3));
		long num = 0;
		for(int i = 1; divisors(num) <= 100; i++)
			num += i;
		String[] solve = { "", ""+num };
		return solve;
	}
}