package net.pyretaursoft.euler;

public class Euler_5 extends Euler {
	public static void main(String[] args)
	{
		euler = new Euler_5();
		main();
	}
	
	public String[] solve()
	{
		final int[] primes = {2,3,5,7,11,13,17,19};
		byte[] count = new byte[primes.length];
		for(int i = 2; i <= 20; i++)
		{
			for(int j = 0; j < primes.length; j++)
			{
				byte l = 0;
				for(int k = i; k % primes[j] == 0; l++)
					k/= primes[j];
				count[j] = (byte)Math.max(l,count[j]);
			}
		}
		long product = 1;
		for(int i = 0; i < primes.length; i++)
			for(int j = 0; j < count[i]; j++)
				product *= primes[i];
		String[] solve = {"The smallest number divisible by all numbers between one and twenty (inclusive) is", ""+product };
		return solve;
	}
}