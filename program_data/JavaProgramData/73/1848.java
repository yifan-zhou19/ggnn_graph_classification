package <missing>;

public class GlobalMembers
{
	/*
	 * ????.cpp
	 *
	 *  Created on: 2011-1-4
	 *      Author: wangwei
	 */
	public static int Main()
	{
		int i;
		int j;
		int[][] a = new int[6][6];
		int[] m = new int[6];
		int t1 = 0;
		int t2;
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i <= 5;i++)
		{
			m[i] = 1;
		}
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 4;j++)
			{
				if (a[i][j + 1] > a[i][m[i]])
				{
					m[i] = j + 1;
				}
			}
			t2 = 0;
			for (j = 1;j <= 5;j++)
			{
				if (a[j][m[i]] < a[i][m[i]])
				{
					t2 = 1;
				}
			}
			if (t2 == 0)
			{
				System.out.print(i);
				System.out.print(' ');
				System.out.print(m[i]);
				System.out.print(' ');
				System.out.print(a[i][m[i]]);
				System.out.print("\n");
				t1++;
			}
		}
		if (t1 == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

