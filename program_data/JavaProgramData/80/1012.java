package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int syear;
		int smonth;
		int sday;
		int eyear;
		int emonth;
		int eday;
		int[] leap = new int[3001];
		int i;
		int days = 0;
		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		syear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		smonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		sday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		eyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		emonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		eday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= 3000; i++) //??????
		{
			leap[i] = (((i % 4 == 0) && (i % 100 != 0)) || i % 400 == 0);
		}
		days = days + (eyear - syear) * 365;
		for (i = syear; i <= eyear; i++)
		{
			days = days + leap[i];
		}
		for (i = 1; i <= emonth - 1; i++)
		{
			days = days + m[i];
		}
		for (i = 1; i <= smonth - 1; i++)
		{
			days = days - m[i];
		}
		if (leap [syear] == 1 && smonth > 2)
		{
			days = days - 1;
		}
		if (leap [eyear] == 1 && emonth <= 2)
		{
			days = days - 1;
		}
		days = days + eday - sday;
		System.out.print(days);
		System.out.print("\n");
		return 0;
	}

}

