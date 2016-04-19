package net.pyretaursoft.euler;

public class Euler_7 extends Euler {
	public static void main(String[] args)
	{
		euler = new Euler_7();
		main();
	}
	
	public String[] solve()
	{
		long[] primes = new long[10001];
		primes[0] = 2;
		primes[1] = 3;
		for(int i = 2; i < primes.length; i++)
		{
			primes[i] = primes[i-1]+2;
			for(int j = 0; j < i; j++)
				if(primes[i] % primes[j] == 0)
				{
					j=0;
					primes[i]+=2;
				}
		}
		String[] solve = {"The 10001st prime is", ""+primes[10000] };
		return solve;
	}
}