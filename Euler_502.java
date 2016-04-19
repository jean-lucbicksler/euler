package net.pyretaursoft.euler;

import java.math.BigInteger;

public class Euler_502 extends Euler {
	public static void main(String[] args)
	{
		euler = new Euler_502();
		main();
	}

	public BigInteger countCastles(int depth, int width, int blockCount)
	{
		String bin = "1";
		for(int i = 0; i < width; i++)
			bin = bin + "0";
		BigInteger sum = BigInteger.ZERO;
		BigInteger max = new BigInteger(bin, 2);
		for(BigInteger i = BigInteger.ZERO; i.compareTo(max) == -1; i=i.add(BigInteger.ONE))
		{
			int[] widths = new int[width];
			int count = blockCount;
			for(int k = 0; k < width; k++)
			{
				String and = "1";
				for(int j = 0; j < k; j++)
					and = and + "0";
				if(i.and(new BigInteger(and, 2)).compareTo(BigInteger.ZERO) == 1)
				{
					int widthPrime = 1;
					for(; k < width; k++)
					{
						and = and + "0";
						if(i.and(new BigInteger(and, 2)).compareTo(BigInteger.ZERO) == 1)
							widthPrime++;
						else
							break;
					}
					widths[count-blockCount] = widthPrime;
					count++;
				}
			}
			if(depth == 0)
			{
				if(((count+blockCount) & 1) != 0)
					sum = sum.add(BigInteger.ONE);
			} else for(int j = 0; j < count-blockCount; j++)
				sum = sum.add(countCastles(depth-1,widths[j],count+blockCount));
			System.out.println(i.toString(2));
		}
		return sum;
	}

	public String[] solve()
	{

		String[] solve = { "", ""+countCastles(8,13,1)};
		return solve;
	}
}