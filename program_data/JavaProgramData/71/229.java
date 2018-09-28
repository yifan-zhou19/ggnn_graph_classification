package <missing>;

public class GlobalMembers
{
	/*
	 * ???????
	 *  ????: 2010-12-24
	 *    ??????
	 */

	public static int run(int y)
	{
		int i;
		if (y % 4 == 0)
		{
			if (y % 100 == 0)
			{
				if (y % 400 == 0)
				{
					i = 1;
				}
				else
				{
					i = 0;
				}
			}
			else
			{
				i = 1;
			}
		}
		else
		{
			i = 0;
		}
		return i;
	}
	public static int Main()
	{
		int num;
		num = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < num; i++)
		{
			int year;
			int m1;
			int m2;
			int n = 0;
			year = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (run(year) == 1)
			{
				int[] yue = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
				if (m1 < m2)
				{
					for (int j = m1 - 1; j < m2 - 1; j++)
					{
						n = n + yue[j];
					}
					if (n % 7 == 0)
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
					for (int j = m2 - 1; j < m1 - 1; j++)
					{
						n = n + yue[j];
					}
					if (n % 7 == 0)
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
			}
			else
			{
				int n = 0;
				int[] yue = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
				if (m1 < m2)
				{
					for (int j = m1 - 1; j < m2 - 1; j++)
					{
						n = n + yue[j];
					}
					if (n % 7 == 0)
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
					for (int j = m2 - 1; j < m1 - 1; j++)
					{
						n = n + yue[j];
					}
					if (n % 7 == 0)
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
			}
		}
		return 0;
	}
}

