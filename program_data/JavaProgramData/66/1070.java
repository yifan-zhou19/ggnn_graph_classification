package <missing>;

public class GlobalMembers
{
	public static String[] weekday = {"Sun.", "Mon.", "Tue.", "Wed.", "Thu.", "Fri.", "Sat."};
	public static short[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static int Main()
	{
		int y;
		int m;
		int d;
		long days;
		long lys = 0;
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		d = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (y % 4 == 0 && y % 400 != 0 && m >= 3)
		{
			lys += 1;
		}
		y--,m--;
		lys += y / 4 - y / 100 + y / 400;
		days = (long)y * 365 + lys;
		for (int i = 0;i < m;i++)
		{
			days += month[i];
		}
		days += d;

		System.out.print(weekday[days % 7]);
		return 0;
	}

}

