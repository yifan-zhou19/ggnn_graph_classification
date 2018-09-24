package <missing>;

public class GlobalMembers
{
	/*
	 * jisuanjuzhen.cpp
	 *
	 *  Created on: 2011-1-8
	 *      Author: Owner
	 */
	public static int Main()
	{
		int n;
		int x;
		int y;
		int[][] a = new int[100][100];
		int i;
		int j;
		int k;
		int l;
		int m;
		int s;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (j = 0;j < x;j++)
			{
				for (k = 0;k < y;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			s = 0;
			for (l = 0;l < y;l++)
			{
				s = s + a[0][l] + a[x - 1][l];
			}
			for (m = 1;m < x - 1;m++)
			{
				s = s + a[m][0] + a[m][y - 1];
			}
			System.out.print(s);
			System.out.print("\n");

		}
		return 0;
	}
}

