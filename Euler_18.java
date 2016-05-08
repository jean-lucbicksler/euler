package net.pyretaursoft.euler;

public class Euler_18 extends Euler {
	int[] triangle = {
				75,
				95, 64,
				17, 47, 82,
				18, 35, 87, 10,
				20,  4, 82, 47, 65,
				19,  1, 23, 75,  3, 34,
				88,  2, 77, 73,  7, 63, 67,
				99, 65,  4, 28,  6, 16, 70, 92,
				41, 41, 26, 56, 83, 40, 80, 70, 33,
				41, 48, 72, 33, 47, 32, 37, 16, 94, 29,
				53, 71, 44, 65, 25, 43, 91, 52, 97, 51, 14,
				70, 11, 33, 28, 77, 73, 17, 78, 39, 68, 17, 57,
				91, 71, 52, 38, 17, 14, 91, 43, 58, 50, 27, 29, 48,
				63, 66,  4, 68, 89, 53, 67, 30, 73, 16, 69, 87, 40, 31,
				 4, 62, 98, 27, 23,  9, 70, 98, 73, 93, 38, 53, 60,  4, 23
			};
	int[] worths;

	public static void main(String[] args)
	{
		euler = new Euler_18();
		main();
	}

	public long highest(int row, int index, int drive)
	{
		int rowsRemaining = 15-row;
		if(rowsRemaining == 1)
			return Math.max(triangle[index+row+1],triangle[index+row]);
		else
		{
			drive += triangle[index+row+1]-triangle[index+row];
			if(Math.abs(drive) > worths[rowsRemaining-1])
				return highest(row+1, index+row+((int)Math.signum(drive)+1)/2, drive)+triangle[index+row+((int)Math.signum(drive)+1)/2];
			else
				return Math.max(highest(row+1,index+row,drive)+triangle[index+row], highest(row+1,index+row+1,drive)+triangle[index+row+1]);
		}
	}

	public String[] solve()
	{
		worths = new int[15];
		worths[0] = 99;
		for(int i = 1; i < worths.length; i++)
			worths[i] = worths[i-1]+99;
		
		String[] solve = {"The highest valued path in the triangle has the value", ""+(highest(1,0,0)+75) };
		return solve;
	}
}