package <missing>;

public class GlobalMembers
{
	/*
	 * c.cpp
	 * ???1100012870;
	 * ???????
	 *  Created on: 2011-10-19
	 *      Author: Li Wenpeng
	 */
	public static int Main()
	{
		int[][] a = new int[200][200];
		int m;
		int n;
		int i;
		int j;
		int k;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++) //????
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (k = 0;k < m + n - 1;k++) //?????
		{
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (i + j - k == 0)
					{
						System.out.print(a[i][j]);
						System.out.print("\n");
					}
				}
			}
		}
		return 0;
	}
}

