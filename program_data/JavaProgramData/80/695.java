package <missing>;

public class GlobalMembers
{
	/*
	 * 1.cpp
	 *
	 *  Created on: 2011-11-4
	 *      Author: 11288
	 */
	public static int Main()
	{
		int[] a = new int[3001];
		int i;
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int s1 = 0;
		int s2 = 0;
		int j;
		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] im = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = 1;i < 3001;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
			{
				a[i] = 366;
			}
			else
			{
				a[i] = 365;
			}
		}
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i < y1;i++)
		{
			s1 = s1 + a[i];
		}
		if ((y1 % 4 == 0 && y1 % 100 != 0) || y1 % 400 == 0)
		{
			for (j = 0;j < m1;j++)
			{
			s1 = s1 + im[j];
			}
		}
		else
		{
			for (j = 0;j < m1;j++)
			{
			s1 = s1 + m[j];
			}
		}
		s1 = s1 + d1;
		for (i = 1;i < y2;i++)
		{
			s2 = s2 + a[i];
		}
		if ((y2 % 4 == 0 && y2 % 100 != 0) || y2 % 400 == 0)
		{
			for (j = 0;j < m2;j++)
			{
			s2 = s2 + im[j];
			}
		}
		else
		{
			for (j = 0;j < m2;j++)
			{
			s2 = s2 + m[j];
			}
		}
		s2 = s2 + d2;
		System.out.print(s2 - s1);
		System.out.print("\n");
		return 0;
	}

}

