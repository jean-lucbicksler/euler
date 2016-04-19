package net.pyretaursoft.euler;

import java.util.ArrayList;

public class Euler_10 extends Euler {
	public static void main(String[] args)
	{
		euler = new Euler_10();
		main();
	}
	
	public boolean isPrime(int i)
	{
		if((i&1)==0) return false;
		double sqrt = Math.sqrt(i);
		for(int j = 3; j <= sqrt; j+=2) if(i%j==0) return false;
		return true;
	}
	
	public String[] solve()
	{
		long sum = 2;
		for(int i = 3; i < 2000000L; i+=2)
			if(isPrime(i))
				sum += i;
		String[] solve = {"", ""+sum };
		return solve;
	}
}