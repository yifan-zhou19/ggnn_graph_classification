package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2010-11-20
	 *      Author: jsgl
	 *      ??? ?????
	 */


	public static int Main()
	{ //?????
		int[][] a = new int[101][101]; //????
		int[][] b = new int[101][101];
		int i;
		int n;
		int m;
		int[][] j = new int[101][101];
		int k;
		int c;
		int d;
		int x;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < m;k++)
			{
				a[i][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < c;i++)
		{
		   for (k = 0;k < d;k++)
		   {
			b[i][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		   }
		}

		for (i = 0;i < 101;i++)
		{
		   for (k = 0;k < 101;k++)
		   {
			   j[i][k] = 0; //???j?????0
		   }
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < d;k++)
			{
				for (x = 0;x <= c;x++)
				{
				j[i][k] = a[i][x] * b[x][k] + j[i][k]; //????c???????
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (k = 0;k < d - 1;k++)
			{
				System.out.print(j[i][k]);
				System.out.print(" ");
			}
			System.out.print(j[i][k]);
			System.out.print("\n");
		} //????c
		return 0; //????
	}
}

