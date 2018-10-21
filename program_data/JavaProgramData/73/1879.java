package <missing>;

public class GlobalMembers
{
	/*
	 * a.cpp
	 *
	 *  Created on: 2010-11-13
	 *      Author: Administrator
	 */
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int k;
		int n;
		int flag;
		int m = 1;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				flag = 1;
				for (k = 0;k < 5;k++)
				{
					if (a[i][j] > a[i][k] || k == j)
					{
						continue;
					}
					else
					{
						flag = 0;
						break;
					}
				}
				if (flag != 0)
				{
					for (n = 0;n < 5;n++)
					{
						if (a[i][j] >= a[n][j] != 0 && n != i)
						{
							flag = 0;
							break;
						}
					}
					if (flag != 0)
					{
						System.out.print(i + 1);
						System.out.print(" ");
						System.out.print(j + 1);
						System.out.print(" ");
						System.out.print(a[i][j]);
						System.out.print("\n");
						m = 0;
					}
				}
			}
		}
		if (m != 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}

}

