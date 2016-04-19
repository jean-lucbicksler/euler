package net.pyretaursoft.euler;

import java.math.BigInteger;

public class Euler_20 extends Euler {
	public static void main(String[] args)
	{
		euler = new Euler_20();
		main();
	}

	public String[] solve()
	{
		BigInteger factorial = BigInteger.ONE;
		byte[] i = new byte[1];
		for(i[0] = 100; i[0] > 1; i[0]--)
			factorial=factorial.multiply(new BigInteger(i));
		System.out.println(factorial);
		BigInteger sum = BigInteger.ZERO;
		for(; factorial.compareTo(BigInteger.ZERO)>0; factorial=factorial.divide(BigInteger.TEN))
			sum=sum.add(factorial.mod(BigInteger.TEN));
		String[] solve = { "", ""+sum };
		return solve;
	}
}