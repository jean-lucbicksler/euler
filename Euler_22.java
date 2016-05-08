package net.pyretaursoft.euler;

import java.io.FileReader;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.Collections;

public class Euler_22 extends Euler {
	public static void main(String[] args)
	{
		euler = new Euler_22();
		main();
	}
	
	public String[] solve()
	{
		try{
			BufferedReader reader = new BufferedReader(new FileReader("p022_names.txt"));
			ArrayList<String> names = new ArrayList<String>();
			char[] c = new char[1];
			boolean flag = false;
			for(;!flag;)
			{
				names.add("");
				for(reader.read(c,0,1); c[0] != ',' && !flag; flag = reader.read(c,0,1) == -1)
					names.set(names.size()-1,names.get(names.size()-1) + c[0]);
			}
			for(int i = 0; i < names.size(); i++)
				names.set(i,names.get(i).substring(1,names.get(i).length()-1));
			Collections.sort(names, String.CASE_INSENSITIVE_ORDER);
			long score = 0;
			long s1;
			for(int i = 0; i < names.size(); score += s1*++i)
			{
				s1 = 0;
				for(int j = 0; j < names.get(i).length(); j++)
					s1 += (int)names.get(i).charAt(j)-64;
			}
			String[] solve = {"The total of all the 'name scores' in the file is", ""+score };
			return solve;
		}catch(Exception e) { e.printStackTrace(); }
		String[] solve = {"uhh...", "fuck"};
		return solve;
	}
}