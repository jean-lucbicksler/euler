package net.pyretaursoft.euler;

public class Euler_17 extends Euler {
	String[] lexicon = {
				"zero",		//0
				"one",		//1
				"two",		//2
				"three",	//3
				"four",		//4
				"five",		//5
				"six",		//6
				"seven",	//7
				"eight",	//8
				"nine",		//9
				"ten",		//10
				"eleven",	//11
				"twelve",	//12
				"thirteen",	//13
				"fourteen",	//14
				"fifteen",	//15
				"sixteen",	//16
				"seventeen",	//17
				"eighteen",	//18
				"nineteen",	//19
				"twenty",	//20
				"thirty",	//21
				"forty",	//22
				"fifty",	//23
				"sixty",	//24
				"seventy",	//25
				"eighty",	//26
				"ninety",	//27
				"hundred",	//28
				"thousand",	//29
				"and"		//30
			};
	public static void main(String[] args)
	{
		euler = new Euler_17();
		main();
	}

	public int lexicalLength(int i)
	{
		if(i < 100)
		{
			if(i < 20)
				return lexicon[i].length();
			else if(i % 10 == 0)
				return lexicon[18+i/10].length();
			else
				return lexicon[18+i/10].length() + lexicon[i%10].length();
		} else if(i < 1000) {
			if(i % 100 == 0)
				return lexicon[i/100].length() + lexicon[28].length();
			else
				return lexicon[i/100].length() + lexicon[28].length() + lexicon[30].length() + lexicalLength(i%100);
		} else
			return lexicon[1].length() + lexicon[29].length();
	}

	public String[] solve()
	{
		long length = 0;
		for(int i = 1; i <= 1000; i++)
			length += lexicalLength(i);
		String[] solve = {"The length of all the numbers between one and one thou written out in word form is", ""+length };
		return solve;
	}
}