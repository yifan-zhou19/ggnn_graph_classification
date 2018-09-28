package <missing>;

public class GlobalMembers
{
	public static int[] lmonth = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int[] pmonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static int days(int year,int m,int d)
	{
		int day = 0;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			for (int i = 1;i <= m - 1;i++)
			{
				day += lmonth[i];
			}
		}
		else
		{
			for (int i = 1;i <= m - 1;i++)
			{
			day += pmonth[i];
			}
		}
		day += d;
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
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int sum = 0;
		for (int i = y1;i <= y2 - 1;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				sum += 366;
			}
			else
			{
				sum += 365;
			}
		}
		sum -= days(y1, m1, d1);
		sum += days(y2, m2, d2);
		System.out.print(sum);
		return 0;
	}


}

