package <missing>;

public class GlobalMembers
{
	/*
	 * 1000010175_fe5th_03.cpp
	 *
	 *  Created on: 2011-1-8
	 *      Author: ???
	 *      function:??????????
	 */



	public static int Main()
	{
		int[][] mat = new int[100][100];
		int t;
		int m;
		int n;
		int i;
		int j;
		int sum;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (;t > 0;t--)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(mat,0,(Integer.SIZE / Byte.SIZE));
			sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					mat[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					if (i == 0 || i == m - 1 || j == 0 || j == n - 1)
					{
						sum += mat[i][j];
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

