package <missing>;

public class GlobalMembers
{
	public static int judge(int x)
	{
		if ((x % 4 == 0 && x % 100 != 0) || x % 400 == 0)
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
		int y2;
		int d1;
		int d2;
		int m1;
		int m2;
		int sum = 0;
		int i;
		int[] pin = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] run = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (y1 == y2)
		{
			if (m1 == m2)
			{
				sum = d2 - d1;
			}
			else
			{
				if (judge(y1) != 0)
				{
					for (i = m1 + 1;i < m2;i++)
					{
						sum = sum + run[i];
					   sum = sum + run[m1] - d1 + d2;
					}
				}
				else
				{
					for (i = m1 + 1;i < m2;i++)
					{
						sum = sum + pin[i];
						sum = sum + pin[m1] - d1 + d2;
					}
				}
			}
		}
		else
		{
			if (judge(y1) != 0)
			{
				for (i = 12;i > m1;i--)
				{
					sum = sum + run[i];
				}
				sum = sum + run[m1] - d1;
			}
			else
			{
					for (i = 12;i > m1;i--)
					{
						sum = sum + pin[i];
					}
					sum = sum + pin[m1] - d1;
			}
			for (i = y1 + 1;i < y2;i++)
			{
				if (judge(i) != 0)
				{
					sum = sum + 366;
				}
				else
				{
					sum = sum + 365;
				}
			}
			if (judge(y2) != 0)
			{
				for (i = 1;i < m2;i++)
				{
					sum = sum + run[i];
				}
				sum = sum + d2;
			}
			else
			{
				for (i = 1;i < m2;i++)
				{
					sum = sum + pin[i];
				}
				sum = sum + d2;
			}
		}
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}


}

