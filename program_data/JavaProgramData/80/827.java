package <missing>;

public class GlobalMembers
{
	public static int leap(int a)
	{
		if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int[] year = {365, 366};
	public static int[][] month =
	{
		{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	public static int Main()
	{
		int y1;
		int m1;
		int d1;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int y2;
		int m2;
		int d2;
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int day = 0;
		int i;
		for (i = y1 + 1;i < y2;i++)
		{
			day = day + year[leap(i)];
		}
		if (y1 < y2)
		{
		for (i = m1;i < 12;i++)
		{
			day = day + month[leap(y1)][i];
		}
		for (i = 0;i < m2 - 1;i++)
		{
			day = day + month[leap(y2)][i];
		}
		day = day + 31 - d1;
		day = day + d2;
		}
		else if (y1 == y2)
		{
			for (i = m1;i < m2 - 1;i++)
			{
				day = day + month[leap(y1)][i];
			}
			day = day + d2 - d1;
		}
		System.out.print(day);
	}
}

