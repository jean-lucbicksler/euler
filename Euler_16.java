package net.pyretaursoft.euler;

import java.math.BigInteger;

public class Euler_16 extends Euler {
	public static void main(String[] args)
	{
		euler = new Euler_16();
		main();
	}

	public String[] solve()
	{
		String number = "1";
		for(int i = 0; i < 1000; i++)
			number = number + "0";
		BigInteger num = new BigInteger(number,2);
		BigInteger sum = BigInteger.ZERO;
		for(BigInteger i = BigInteger.ONE; i.compareTo(num) < 0; i=i.multiply(BigInteger.TEN))
		{
			sum = sum.add(num.divide(i).mod(BigInteger.TEN));
		}
		String[] solve = { "", ""+sum };
		return solve;
	}
}