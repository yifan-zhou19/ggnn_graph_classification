package <missing>;

public class GlobalMembers
{
	/*
	 * 12.11.2.cpp
	 *Created on: 2012-11-2
	 *Author:???
	 *?? ????
	 */
	public static int judge(int y)
	{
		if (y % 400 == 0 || y % 4 == 0 && y % 100 != 0)
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
		int n;
		int y;
		int m1;
		int m2;
		int num;
		int i;
		int j;
		int t;
		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m1 > m2)
			{
				t = m1;
				m1 = m2;
				m2 = t;
			}
			for (j = m1,num = 0;j < m2;j++)
			{
				num = num + m[j] + (j == 2) * judge(y);
			}
			if (num % 7 == 0)
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
		return 0;
	}
}

