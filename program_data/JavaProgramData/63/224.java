package <missing>;

public class GlobalMembers
{
	/*
	 * ???test.cpp
	 * ??????
	 * ????: 2010-11-20
	 * ??????
	 */
	public static int Main()
	{
		int x1; //???????????
		int y1;
		int x2;
		int y2;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] c1 = new int[x1][y1]; //????????????
		for (int x = 0;x < x1;x++) //??????
		{
			for (int y = 0;y < y1;y++)
			{
				c1[x][y] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] c2 = new int[x2][y2];
		for (int x = 0;x < x2;x++)
		{
			for (int y = 0;y < y2;y++)
			{
				c2[x][y] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int[][] c = new int[x1][y2]; //????????
		for (int i = 0;i < x1;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(c[i],0,(Integer.SIZE / Byte.SIZE));
		}
				 //??????????0
		for (int x = 0;x < x1;x++) //????
		{
			for (int y = 0;y < y2;y++)
			{
				for (int i = 0;i < y1;i++)
				{
			  //??????????????????????
					c[x][y] += c1[x][i] * c2[i][y];
				}
			}
		}
		for (int x = 0;x < x1;x++)
		{ //????
			for (int y = 0;y < y2 - 1;y++)
			{
				System.out.print(c[x][y]);
				System.out.print(" ");
			}
			System.out.print(c[x][y2 - 1]);
			System.out.print("\n");
		}
	return 0;
	}

}

