package <missing>;

public class GlobalMembers
{
	/*
	 * ??????????.cpp
	 *
	 *  Created on: 2012-12-28
	 *      Author: i
	 */
	public static int[][] a = new int[100][100];
	public static int n = 0;
	public static int m = 0;
	public static int i = 0;
	public static int j = 0;
	public static void bianli(int hang,int lie)
	{
		if (lie == 0 || hang == n - 1)
		{
			System.out.print(a[hang][lie]);
			System.out.print("\n");
		}
		else
		{
			System.out.print(a[hang][lie]);
			System.out.print("\n");
			bianli(hang + 1, lie-1);
		}
	}
	public static int Main()
	{
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < m;i++)
		{
			bianli(0, i);
		}
		for (i = 1;i < n;i++)
		{
			bianli(i, m - 1);
		}
		return 0;
	}
}

