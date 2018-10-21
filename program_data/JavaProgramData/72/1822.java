package <missing>;

public class GlobalMembers
{
	/*
	 * intergratedexercise1.21.cpp
	 *
	 *  Created on: 2013-12-28
	 *      Author: st
	 */
	public static int Main()
	{
		int[][] hill = new int[22][22];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(hill,0,(Integer.SIZE / Byte.SIZE));
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int i;
		int j;
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				hill[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (hill[i][j] >= hill[i][j - 1] != 0 && hill[i][j] >= hill[i][j + 1] != 0 && hill[i][j] >= hill[i - 1][j] != 0 && hill[i][j] >= hill[i + 1][j])
				{
					System.out.print(i - 1);
					System.out.print(' ');
					System.out.print(j - 1);
					System.out.print("\n");
				}
			}
		}

	}

}

