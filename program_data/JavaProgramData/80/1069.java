package <missing>;

public class GlobalMembers
{
	public static int[][] mon =
	{
		{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};


	public static int f(int y, int m, int d)
	{
		int i;
		int day = 0;
		for (i = 1; i < y; i++)
		{
			if ((i % 400 == 0) || ((i % 100 != 0) && (i % 4 == 0)))
			{
				day = day + 366;
			}
			else
			{
				day = day + 365;
			}
		}
		int temp = ((y % 400 == 0) || ((y % 100 != 0) && (y % 4 == 0)));
		for (i = 1; i < m; i++)
		{
			day = day + mon[temp][i];
		}
		day = day + d;
		return day;
	}

	public static int Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int day1;
		int day2;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		day1 = f(y1, m1, d1);
		day2 = f(y2, m2, d2);
		if (day1 >= day2)
		{
			System.out.print(day1 - day2);
			System.out.print("\n");
		}
		else
		{
			System.out.print(day2 - day1);
			System.out.print("\n");
		}
		return 0;
	}
}

