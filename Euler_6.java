package net.pyretaursoft.euler;

public class Euler_6 extends Euler {
	public static void main(String[] args)
	{
		euler = new Euler_6();
		main();
	}
	
	public String[] solve()
	{
		long sum1 = 0;
		for(int i = 1; i <= 100; i++) sum1 += i;
		sum1 *= sum1;
		long sum2 = 0;
		for(int i = 1; i <= 100; i++) sum2 += i*i;
		String[] solve = {"The sum-square difference of all numbers between one and a hundred is ", ""+(sum1-sum2) };
		return solve;
	}
}