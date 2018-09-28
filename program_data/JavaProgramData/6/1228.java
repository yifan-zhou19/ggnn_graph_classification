package <missing>;

public class GlobalMembers
{
	/*
	 * caledge.cpp
	 *
	 *  Created on: 2011-12-30
	 *      Author: wangshiheng
	 */
	public static int Main()
	{
		int k;
		int m;
		int n;
		int i;
		int j;
		int s = 0;
		int[][] a = new int[102][102];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (k > 0)
		{
			s = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (i = 1;i <= m;i++)
			{
			  for (j = 1;j <= n;j++)
			  {
				  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  }
			}
			for (i = 1;i <= m;i++)
			{
				s = s + a[i][1] + a[i][n];
			}
			for (j = 2;j <= n - 1;j++)
			{
				s = s + a[1][j] + a[m][j];
			}
			System.out.print(s);
			System.out.print("\n");
			k--;
		}
	}

}

