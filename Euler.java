package net.pyretaursoft.euler;

public abstract class Euler
{
	protected static Euler euler;
	public static void main()
	{
		String[] solve = euler.solve();
	    for (int i = 0; i < solve.length; i++)
            System.out.println(solve[i]);
	}

    public abstract String[] solve();
}