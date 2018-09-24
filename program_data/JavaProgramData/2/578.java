package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2013-1-13
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int n;
		int i;
		int j;
		int max = 0;
		int maxi = 0;
		int[] a = new int[1100];
		int[] b = new int[30];
		int[][] c = new int[30][1100];
		char[][] zz = new char[1100][30];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			a[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			zz[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			for (j = 0; zz[i][j] != '\0'; j++)
			{
				b[(int)zz[i][j] - 'A']++;
				c[(int)zz[i][j] - 'A'][i] = 1;
			}
		}
		for (i = 0; i <= 25; i++)
		{
			if (b[i] > max)
			{
				max = b[i];
				maxi = i;
			}
		}
		System.out.print((char)(maxi + 'A'));
		System.out.print("\n");
		System.out.print(max);
		System.out.print("\n");
		for (i = 1; i <= 1000; i++)
		{
			if (c[maxi][i] == 1)
			{
				System.out.print(a[i]);
				System.out.print("\n");
			}
		}
		return 0;
	}

}

