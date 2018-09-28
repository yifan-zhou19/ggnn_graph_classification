package <missing>;

public class GlobalMembers
{
	public static int days(int y, int m, int d)
	{
		int[] year = new int[3001];

		for (int i = 1; i <= 3000; i++)
		{
			if (i % 4 == 0 && i % 100 != 0)
			{
				year[i] = 366;
			}
			else if (i % 400 == 0)
			{
				year[i] = 366;
			}
			else
			{
				year[i] = 365;
			}
		}

		int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] loopmon = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		int days = 0;
		for (int i = 1; i < y; i++)
		{
			days += year[i];
		}
		for (int i = 1; i < m; i++)
		{
			if (y % 4 == 0 && y % 100 != 0)
			{
				days += loopmon[i];
			}
			else if (y % 400 == 0)
			{
				days += loopmon[i];
			}
			else
			{
				days += month[i];
			}
		}
		days += d;

		return days;
	}

	public static int Main()
	{
		int y1 = 0;
		int m1 = 0;
		int d1 = 0;
		int y2 = 0;
		int m2 = 0;
		int d2 = 0;

		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		System.out.print(days(y2, m2, d2) - days(y1, m1, d1));


		return 0;
	}
}

