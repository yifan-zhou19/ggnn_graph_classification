package <missing>;

public class GlobalMembers
{
	/*
	 * 1000012795-??????????.cpp
	 *     ??????????
	 *  Created on: 2010-12-30
	 *      Author: ??
	 */
	public static int[][] a = new int[100][100]; //????????
	public static void cut(int m,int n) //??????????????
	{
		int i;
		int j;
		if (m == 0 || n == 0) //???????m=0||n=0????
		{
			return;
		}
		if (m == 1) //?????m=1??????????????
		{
			for (i = 0;i < n;i++)
			{
				System.out.print(a[0][i]);
				System.out.print("\n");
			}
			return;
		}
		if (n == 1) //?????n=1??????????????
		{
			for (i = 0;i < m;i++)
			{
				System.out.print(a[i][0]);
				System.out.print("\n");
			}
			return;
		}
		for (i = 0;i < n;i++) //?????????
		{
			System.out.print(a[0][i]);
			System.out.print("\n");
		}
		for (i = 1;i < m;i++)
		{
			System.out.print(a[i][n - 1]);
			System.out.print("\n");
		}
		for (i = n - 2;i >= 0;i--)
		{
			System.out.print(a[m - 1][i]);
			System.out.print("\n");
		}
		for (i = m - 2;i > 0;i--)
		{
			System.out.print(a[i][0]);
			System.out.print("\n");
		}
		for (i = 0;i < m - 2;i++) //????????????????
		{
			for (j = 0;j < n - 2;j++)
			{
				a[i][j] = a[i + 1][j + 1];
			}
		}
		cut(m - 2, n - 2); //?????????
	}
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		 cut(m, n);
		 return 0;
	}





}

