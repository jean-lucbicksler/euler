package net.pyretaursoft.euler;

import java.math.BigInteger;

public class Euler_15 extends Euler {
	public static void main(String[] args)
	{
		euler = new Euler_15();
		main();
	}

	public String[] solve()
	{
		BigInteger product = BigInteger.ONE;
		byte[] i = new byte[1];
		for(i[0] = 40; i[0] > 20; i[0]--)
			product=product.multiply(new BigInteger(i));
		for(i[0] = 20; i[0] > 1; i[0]--)
			product=product.divide(new BigInteger(i));
		String[] solve = { "The number of paths in the lattice is", ""+product };
		return solve;
	}
}