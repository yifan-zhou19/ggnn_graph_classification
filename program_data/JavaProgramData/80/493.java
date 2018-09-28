package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] dayofpmon = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int day = 0;
		int i;
		for (i = y1;i < y2;i++)
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
		for (i = 1;i < m1;i++)
		{
			if (i == 2 && ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0)))
			{
				day = day - 29;
			}
			else
			{
				day = day - dayofpmon[i];
			}
		}
		day = day - d1;
		for (i = 1;i < m2;i++)
		{
			if (i == 2 && ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0)))
			{
				day = day + 29;
			}
			else
			{
				day = day + dayofpmon[i];
			}
		}
		day = day + d2;
		System.out.print(day);
		return 0;
	}
}

