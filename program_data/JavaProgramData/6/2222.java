package <missing>;

public class GlobalMembers
{
	/*
	 * SumOfEdgeElements.cpp
	 *
	 *  Created on: 2012-12-11
	 *      Author: Cui Zhaoxiong Class4 1200012931
	 */
	public static int sum = 0;
	public static int m;
	public static int n;
	public static void Input(int[] a)
	{
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i <= m - 1; i++)
		{
			for (int j = 0; j <= n - 1; j++)
			{
				*(a[i] + j) = ConsoleInput.readToWhiteSpace(true);
			}
		}
	}
	public static void Sum(int x, int y, int[] a)
	{ //????
		sum += *(a[x] + y);
		if (x == 0 && y < n - 1)
		{
			Sum(x, y + 1, a);
		}
		else if (x < m - 1 && y == n - 1)
		{
			Sum(x + 1, y, a);
		}
		else if (x == m - 1 && y > 0)
		{
			Sum(x, y - 1, a);
		}
		else if (y == 0 && x > 1)
		{
			Sum(x - 1, y, a);
		}
		else
		{
			return;
		}
	}
	public static int Main()
	{
		int[][] a = new int[102][102];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= n; i++)
		{
			sum = 0;
			Input(a);
			Sum(0, 0, a);
			if (i != 1)
			{
				System.out.print("\n");
			}
			System.out.print(sum);
		}
		return 0;
	}

}

