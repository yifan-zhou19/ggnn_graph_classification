package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int day = 0;
		int i;
		int year1;
		int year2;
		int m1;
		int m2;
		int d1;
		int d2;
		year1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		year2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if ((year2 - year1) == 0)
		{
			if (m1 == m2)
			{
				day = d2 - d1;
			}
			else
			{
			if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0))
			{
				for (i = m1 + 1; i <= m2 - 1; i++)
				{
					day = day + b[i];
				}
			day = day + b[m1] - d1 + d2;
			}
			else
			{
				for (i = m1 + 1; i <= m2 - 1; i++)
				{
					day = day + a[i];
				}
			day = day + a[m1] - d1 + d2;
			}
			}
		}
		if ((year2 - year1) == 1)
		{
			day = 0;
			if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0))
			{
				for (i = m1 + 1; i <= 12; i++)
				{
					day = day + b[i];
				}
			day = day + b[m1] - d1;
			}
			else
			{
				for (i = m1 + 1; i <= 12; i++)
				{
					day = day + a[i];
				}
			day = day + a[m1] - d1;
			}
			if ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0))
			{
				for (i = 1; i <= m2 - 1; i++)
				{
					day = day + b[i];
				}
				day = day + d2;
			}
			else
			{
					for (i = 1; i <= m2 - 1; i++)
					{
					day = day + a[i];
					}
				day = day + d2;
			}
		}
		if ((year2 - year1) > 2)
		{
			day = 0;
			for (i = year1 + 1; i <= year2 - 1; i++)
			{
				if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
				{
					day = day + 366;
				}
				else
				{
					day = day + 365;
				}
			}
			if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0))
			{
				for (i = m1 + 1; i <= 12; i++)
				{
					day = day + b[i];
				}
			day = day + b[m1] - d1;
			}
			else
			{
				for (i = m1 + 1; i <= 12; i++)
				{
					day = day + a[i];
				}
			day = day + a[m1] - d1;
			}
			if ((year2 % 4 == 0 && year2 % 100 != 0) || (year2 % 400 == 0))
			{
				for (i = 1; i <= m2 - 1; i++)
				{
					day = day + b[i];
				}
				day = day + d2;
			}
			else
			{
					for (i = 1; i <= m2 - 1; i++)
					{
					day = day + a[i];
					}
				day = day + d2;
			}
		}
	System.out.print(day);
	System.out.print("\n");
	return 0;
	}





}

