package net.pyretaursoft.euler;

public class Euler_2 extends Euler {
	public static void main(String[] args)
	{
		euler = new Euler_2();
		main();
	}

    public String[] solve() {
        long[] storage = {1,1,1,0};
        for(;storage[1]<=4000000; storage[1]+=storage[0])
        {
            storage[0]=storage[2];
            if((storage[1] & 1) == 0)
                storage[3]+=storage[1];
            storage[2]=storage[1];
        }
        String[] solve = {"The sum of all even Fibonacci numbers below 4 mil is", ""+storage[3]};
        return solve;
    }
}