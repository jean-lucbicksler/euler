package net.pyretaursoft.euler;

import java.math.BigInteger;

public class Euler_48 extends Euler {
	public static void main(String[] args)
	{
		euler = new Euler_48();
		main();
	}
	
	public String[] solve()
	{
		BigInteger n = BigInteger.ZERO;
		String s = "1";
		for(int i = 0; i < 10; i++)
			s = s + "0";
		BigInteger mod = new BigInteger(s);
		BigInteger ub = new BigInteger("1000");
		for(BigInteger i = BigInteger.ONE; i.compareTo(ub) <= 0; i=i.add(BigInteger.ONE))
			n = n.add(i.pow(i.intValue())).mod(mod);
		String[] solve = {"The sum of all the self-powers from 1 to 1 thou is", ""+n };
		return solve;
	}
}