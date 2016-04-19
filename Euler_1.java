package net.pyretaursoft.euler;

public class Euler_1 extends Euler {
   public static void main(String[] args)
   {
	   euler = new Euler_1();
	   main();
   }

   public String[] solve() {
        long sum = 0;
        for(int i = 3; i < 1000; i+=3) sum += i;
        for(int j = 5; j < 1000; j+=5) sum += j;
        String[] solve = {"The sum of all multiples of three and five below 1000 is", ""+sum};
        return solve;
   }
}