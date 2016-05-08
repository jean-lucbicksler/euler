package net.pyretaursoft.euler;

import java.util.ArrayList;

public class Euler_12 extends Euler {
	public static void main(String[] args)
	{
		euler = new Euler_12();
		main();
	}

	public int divisors(long i)
	{
		ArrayList<Integer> count = new ArrayList<Integer>();
		count.add(1);
		while(i%2 == 0)
		{
			i/=2;
			count.set(0,count.get(0)+1);
		}
		for(int j = 3; j <= Math.sqrt(i); j += 2)
		{
			if(i%j == 0) count.add(1);
			while(i%j == 0)
			{
				i/=j;
				count.set(count.size()-1,count.get(count.size()-1)+1);
			}
		}
		if(i > 2)
			count.add(2);
		int divisors = 1;
		for(int j = 0; j < count.size(); j++)
			divisors *= count.get(j);
		System.out.println(divisors);
		return divisors;
	}

	public String[] solve()
	{
		long num = 6;
		boolean flag = true;
		for(int i = 3; flag; num += flag ? i : 0)
			if(divisors(num) <= 500)
				i++;
			else
				flag = false;
		String[] solve = { "The first triangular number with over five hundred divisors is", ""+num };
		return solve;
	}
}