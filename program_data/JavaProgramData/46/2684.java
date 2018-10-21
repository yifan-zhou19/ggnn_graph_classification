package <missing>;

public class GlobalMembers
{
	/*
	 * CR.cpp
	 *
	 *  Created on: 2012-11-15
	 *      Author: sony
	 */

	public static int a;
	public static int b;
	public static int[][] x = new int[101][101];
	public static int p;
	public static int sum;
	public static void read(int start,int a,int b)
	{
		int v;
		int h;
		int i;
		v = start;
		h = start;
		if (a == 0 || b == 0)
		{
			return;
		}
		if (a == 1 && b == 1)
		{
			System.out.print(x[v][h]);
			System.out.print("\n");
			return;
		}
		for (i = 1;i <= b - 1;i++)
		{
			System.out.print(x[v][h]);
			System.out.print("\n");
			sum++;
			if (sum == p)
			{
				return;
			}
			h++;
		}
		for (i = 1;i <= a - 1;i++)
		{
			System.out.print(x[v][h]);
			System.out.print("\n");
			sum++;
			if (sum == p)
			{
				return;
			}
			v++;
		}
		for (i = 1;i <= b - 1;i++)
		{
			System.out.print(x[v][h]);
			System.out.print("\n");
			sum++;
			if (sum == p)
			{
				return;
			}
			h--;
		}
		for (i = 1;i <= a - 1;i++)
		{
			System.out.print(x[v][h]);
			System.out.print("\n");
			sum++;
			if (sum == p)
			{
				return;
			}
			v--;
		}
		read(v + 1, a - 2, b - 2);

	}
	public static int Main()
	{
		int j;
		int r;
		sum = 0;
		a = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		b = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		p = a * b;
		for (j = 1;j <= a;j++)
		{
			for (r = 1;r <= b;r++)
			{
				x[j][r] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		read(1, a, b);
		return 0;
	}
}

