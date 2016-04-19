package net.pyretaursoft.euler;

public class Euler_3 extends Euler {
    public int storageSize = 1024;
    public static void main(String[] args)
    {
    	euler = new Euler_3();
    	main();
    }

    public String[] solve() {
        long[] storage = new long[storageSize];
        storage[0]=600851475143L;
        storage[1]=1;
        for(int i = 2; i < storage.length && storage[0] != 1; i++)
        {
            long factor = storage[i-1];
            boolean prime = false;
            do
            {
				factor += 2;
				prime = true;
				for(int j = 2; j < i && prime; j++)
					prime = factor%storage[j] != 0;
			} while (!prime);
            while(storage[0] % factor == 0)
            {
                 storage[0] /= factor;
                 storage[1] = factor;
            }
            storage[i] = factor;
        }
        String[] solve = { "The highest prime factor of 600851475143 is", ""+storage[1] };
        if(storage[0] != 1)
        	 solve[0] = "I couldn't solve problem Euler_3! Please set my storageSize to something greater than " + storageSize + " and try again.";
        return solve;
    }
}
