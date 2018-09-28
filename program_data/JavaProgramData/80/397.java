package <missing>;

public class GlobalMembers
{
	/*
	 * j3.cpp
	 *
	 *  Created on: 2011-1-9
	 *      Author: jsgl
	 */
	public static int runnian(int y)
	{
		if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
		{
		return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int D1 = 0;
		int D2 = 0;
		int i;
		int j;
		int p = 0;
		int t;
		int t1;
		int t2;
		int a;
		int b;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] tianshu = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = 0;i < m1 - 1;i++)
		{
			D1 += tianshu[i];
		}
		for (j = 0;j < m2 - 1;j++)
		{
			D2 += tianshu[j];
		}
		if (y1 == y2 && m1 == m2)
		{
			System.out.print(d2 - d1);
		}
		else
		{
			int s1 = 365 * (y2 - y1);
			for (i = y1;i < y2;i++)
			{
				t = runnian(i);
				if (t == 1)
				{
					p++;
				}
			}
			int s2 = s1 + p;
			t1 = runnian(y1);
			if (t1 == 1)
			{
				if (m1 >= 3)
				{
					a = D1 + 1 + d1;
				}
				else
				{
					a = D1 + d1;
				}
			}
			else
			{
				a = D1 + d1;
			}
			t2 = runnian(y2);
			if (t2 == 1)
			{
				if (m2 >= 3)
				{
					b = D2 + 1 + d2;
				}
				else
				{
					b = D2 + d2;
				}
			}
			else
			{
				b = D2 + d2;
			}
			System.out.print(s2 + b - a);
			System.out.print("\n");
		}
			return 0;
	}

}

