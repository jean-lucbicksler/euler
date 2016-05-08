package net.pyretaursoft.euler;

import java.math.BigInteger;

public class Euler_25 extends Euler {
	public static void main(String[] args)
	{
		euler = new Euler_25();
		main();
	}
	
	public String[] solve()
	{
		BigInteger[] storage = {BigInteger.ONE, BigInteger.ONE, BigInteger.ONE};
		String upperBound = "1";
		for(int i = 0; i < 999; i++)
			upperBound = upperBound + "0";
		BigInteger ub = new BigInteger(upperBound);
		int counter = 2;
		for(; storage[1].compareTo(ub) < 0; storage[1]=storage[0].add(storage[1]))
		{
			storage[0] = storage[2];
			storage[2] = storage[1];
			System.out.print(storage[1]+ " ");
			counter++;
		}
		String[] solve = {"The index of the first thousand-digit fibbonacci number is", ""+counter };
		return solve;
	}
}