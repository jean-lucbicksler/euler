package net.pyretaursoft.euler;

public class Euler_4 extends Euler {
   	public static void main(String[] args)
   	{
	   	euler = new Euler_4();
	   	main();
   	}

	public String[] solve() {
		long i = 9, j = 9, k = 9;
		boolean flag = false;
		boolean flagPrime = false;
		long ans = 0;
		for(i=9; i >= 0 && !flag; i--)
			for(j=9; j >= 0 && !flag; j--)
				for(k=9; k >= 0 && !flag; k--)
				{
					long num = i*100001+k*010010+j*001100;
					for(int l = 999; l >= 100 && !flag; l--)
					{
						if(num%l == 0)
						{
							long div = num/l;
							flag = div <= 999 && div >= 100;
							ans = num;
						}
					}
				}
		if(!flag)
			for(i=9; i >= 0 && !flag; i--)
				for(j=9; j >= 0 && !flag; j--)
					for(k=9; k >= 0 && !flag; k--)
					{
						long num = i*10001+k*01010+j*00100;
						for(int l = 999; l >= 100 && !flag; l--)
						{
							if(num%l == 0)
							{
								long div = num/l;
								flag = div <= 999 && div >= 100;
								flagPrime = flag;
								ans = num;
							}
						}
					}
		String[] solve = {"The largest palindromic number that is the product of two three-digit numbers is", ""+ans};
		return solve;
	}
}