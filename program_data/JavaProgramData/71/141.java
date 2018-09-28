package <missing>;

public class GlobalMembers
{
	/*
	 * 3.cpp
	 *
	 *  Created on: 2010-12-24
	 *      Author: 10082
	 */
	public static int Main()
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int n;
		int i;
		int M = 0;
		int N = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while (n > 0)
		{
			int year;
			int m1;
			int m2;
			int m;
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			M = 0;
			N = 0;
			if (m1 > m2)
			{
				m = m1;
				m1 = m2;
				m2 = m;
			}
			if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
			{
				for (i = 0;i < m1 - 1;i++)
				{
					M = M + b[i];
				}
				for (i = 0;i < m2 - 1;i++)
				{
					N = N + b[i];
				}
				if ((N - M) % 7 == 0)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else
				{
					System.out.print("NO");
					System.out.print("\n");
				}
			}
			else
			{
				for (i = 0;i < m1 - 1;i++)
				{
					M = M + a[i];
				}
				for (i = 0;i < m2 - 1;i++)
				{
					N = N + a[i];
				}
				if ((N - M) % 7 == 0)
				{
					System.out.print("YES");
					System.out.print("\n");
				}
				else
				{
					System.out.print("NO");
					System.out.print("\n");
				}
			}
			n--;
		}
	}
}

