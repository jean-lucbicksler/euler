package net.pyretaursoft.euler;

public class Euler_14 extends Euler {
	public static void main(String[] args)
	{
		euler = new Euler_14();
		main();
	}

	public long collatzLength(long sp)
	{
		System.out.print(sp + " -> ");
		long length = 0;
		while(sp != 1)
		{
			if((sp & 1) == 0) sp >>= 1;
			else sp = 3*sp+1;
			length++;
		}
		System.out.print(length + "\n");
		return length;
	}

	public String[] solve()
	{
		long max_length = 1;
		long number = 0;
		for(int i = 750000; i < 1000000; i++)
		{
			long length = collatzLength(i);
			if(length > max_length)
			{
				number = i;
				max_length = length;
			}
		}
		String[] solve = { "The longest collatz sequence from a number below 1 mill starts with", ""+number };
		return solve;
	}
}