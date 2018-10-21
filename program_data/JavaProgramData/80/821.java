package <missing>;

public class GlobalMembers
{
	public static final int[] monthlength = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};

	public static int isLeapYear(int yearAD)
	{
		if (yearAD % 4 == 0 && (yearAD % 100 != 0 || yearAD % 400 == 0))
		{
			return 1;
		}
		return 0;
	}

	public static int Main()
	{
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int delta;
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		delta = d2 - d1;
		if (m1 < m2)
		{
			for (; m1 < m2; m1++)
			{
				if (m1 == 2)
				{
					delta += 28 + isLeapYear(y1) + isLeapYear(y2);
				}
				else
				{
					delta += monthlength[m1];
				}
			}
		}
		else
		{
			for (; m1 > m2; m1--)
			{
				if (m1 == 2)
				{
					delta -= 28 + isLeapYear(y1) + isLeapYear(y2);
				}
				else
				{
					delta -= monthlength[m1];
				}
			}
		}
		for (; y1 < y2; y1++)
		{
			if (isLeapYear(y1) != 0)
			{
				delta += 366;
			}
			else
			{
				delta += 365;
			}
		}
		System.out.print(delta);
		return 0;
	}
}

