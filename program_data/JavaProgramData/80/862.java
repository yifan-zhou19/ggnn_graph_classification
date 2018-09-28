package <missing>;

public class GlobalMembers
{
	public static int[] b = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int[] c = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static int calender(int y,int m,int d)
	{
		int date = 0;
		int y1 = 1;
		while (y1 < y)
		{
			if (((y1) % 4 == 0 && (y1) % 100 != 0) || ((y1) % 400 == 0))
			{
				date = date+366;
				y1++;
			}
			else
			{
				date = date+365;
				y1++;
			}
		}
		while (m > 1)
		{
			if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
			{
				date = date + c[m - 1];
				m--;
			}
			else
			{
				date = date + b[m - 1];
				m--;
			}
		}
		date = date + d - 1;
		return date;

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
		System.out.print(calender(y2, m2, d2) - calender(y1, m1, d1));
		return 0;
	}


}

