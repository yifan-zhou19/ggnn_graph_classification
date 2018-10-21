package <missing>;

public class GlobalMembers
{
	/*
	 * main.cpp
	 *
	 *  Created on: 2012-12-10
	 *      Author: ??
	 *     ????????????????????????????????????????????????????????????
	
	 */


	public static void function()
	{
		int[][] a = new int[110][110];
		(int)(*p)[110];
		int n;
		int m;
		int i;
		int sum = 0;
		int j;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		p = a;
		for (i = 0;i < m;i++)
		{
			sum += *(*p + i);
			if (n > 1)
			{
				sum += *(*(p + n - 1) + i);
			}
		}
		for (i = 1;i < n - 1;i++)
		{
			sum += **(p + i);
			if (m > 1)
			{
				sum += *(*(p + i) + m - 1);
			}
		}
		System.out.print(sum);
		System.out.print("\n");
	}
	public static int Main()
	{
		int n;
		int i;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			function();
		}
		return 0;
	}
}

