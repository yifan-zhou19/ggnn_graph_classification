package <missing>;

public class GlobalMembers
{
	 /* homework2.cpp
	 *
	 *  Created on: 2012-11-10
	 *      Author: Lixurong
	 */

	public static int[][] a = new int[101][101];
	public static int sum = 0;

	public static void zero(int n)
	{
		for (int i = 0; i < n; i++)
		{
			int min;
			min = a[i][0];
			for (int j = 0; j < n; j++)
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
			for (int j = 0; j < n; j++)
			{
				a[i][j] -= min;
			}
		}
		for (int j = 0; j < n; j++)
		{
			int min2;
			min2 = a[0][j];
			for (int i = 0; i < n; i++)
			{
				if (a[i][j] < min2)
				{
					min2 = a[i][j];
				}
			}
			for (int i = 0; i < n; i++)
			{
				a[i][j] -= min2;
			}
		}
	}

	public static void subtract(int n)
	{
		if (n > 2)
		{
			for (int j = 2; j < n; j++)
			{
				a[0][j - 1] = a[0][j];
			}
			for (int i = 2; i < n; i++)
			{
				a[i - 1][0] = a[i][0];
			}
			for (int i = 2; i < n; i++)
			{
				for (int j = 2; j < n; j++)
				{
					a[i - 1][j - 1] = a[i][j];
				}
			}
		}
	}

	public static void process(int n)
	{
		if (n != 1)
		{
			zero(n);
			sum += a[1][1];
			subtract(n);
			process(n - 1);
		}
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int p = 0; p < n; p++)
		{
			for (int i = 0; i < n; i++)
			{
				for (int j = 0; j < n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			process(n);
			System.out.print(sum);
			if (p != n - 1)
			{
				System.out.print("\n");
			}
			sum = 0;
		}

	}
}

