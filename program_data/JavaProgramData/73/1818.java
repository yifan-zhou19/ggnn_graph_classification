package <missing>;

public class GlobalMembers
{
	/*
	 * ????.cpp
	 *
	 *  Created on: 2010-11-19
	 *      Author: IBM
	 */


	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int k;
		int ok;
		int x;
		int y;
		int s;
		int p = 0;
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
				ok = 1;
				for (k = 0;k < 5;k++)
				{
					if ((a[i][k] > a[i][j]) || (a[i][j] > a[k][j]))
					{
						ok = 0;
					}
				}
				if (ok == 1)
				{
					x = i;
					y = j;
					s = a[i][j];
					p = 1;
				}
			}
		}
		if (p == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		else
		{
			System.out.print(x + 1);
			System.out.print(' ');
			System.out.print(y + 1);
			System.out.print(' ');
			System.out.print(s);
			System.out.print("\n");
		}
		return 0;
	}
}

