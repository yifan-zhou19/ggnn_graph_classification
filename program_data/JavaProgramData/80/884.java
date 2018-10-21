package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int day1 = 0;
		int day2 = 0;
		int i;
		int j;
		int[] m = {0, 31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = y1;i < y2;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				day2 = day2 + 366;
			}
			else
			{
				day2 = day2 + 365;
			}
		}
		if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
		{
			for (i = 1;i < m2;i++)
			{
				if (i == 2)
				{
					day2 = day2 + 29;
				}
				else
				{
					day2 = day2 + m[i];
				}
			}
			day2 = day2 + d2;
		}
		else
		{
			for (i = 1;i < m2;i++)
			{
				if (i == 2)
				{
					day2 = day2 + 28;
				}
				else
				{
					day2 = day2 + m[i];
				}
			}
			day2 = day2 + d2;
		}
		if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
		{
			for (i = 1;i < m1;i++)
			{
				if (i == 2)
				{
					day1 = day1 + 29;
				}
				else
				{
					day1 = day1 + m[i];
				}
			}
			day1 = day1 + d1;
		}
		else
		{
			for (i = 1;i < m1;i++)
			{
				if (i == 2)
				{
					day1 = day1 + 28;
				}
				else
				{
					day1 = day1 + m[i];
				}
			}
			day1 = day1 + d1;
		}
		System.out.print(day2 - day1);
		System.out.print("\n");
			return 0;
	}

}

