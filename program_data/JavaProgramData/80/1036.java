package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j = 1;
		int startyear;
		int endyear;
		int startmonth;
		int endmonth;
		int startday;
		int endday;
	int dou = 0;
	int days;
	int p;
	int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	int[] b = new int[1000];
	startyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	startmonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	startday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	endyear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	endmonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	endday = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (i = 1;i <= 3000;i++)
	{
		if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
		{
				b[j] = i; /*????(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)?
	???2???29?*/
			j++;
		}
	}
	for (i = 1;i < j;i++)
	{
		if (startyear < b[i] && b[i] < endyear)
		{
			dou = dou + 1;
		}
		if (startyear == b[i] && startmonth <= 2)
		{
			dou = dou + 1;
		}
		if (endyear == b[i] && endmonth >= 3)
		{
				dou = dou + 1;
		}
	}
	p = endyear - startyear;
	days = p * 365;
	if (startmonth < endmonth)
	{
		for (i = startmonth;i < endmonth;i++)
		{
			days = days + a[i];
		}
	}
	if (startmonth > endmonth)
	{
			for (i = startmonth;i <= 12;i++)
			{
			days = days + a[i];
			}
		for (i = 1;i < endmonth;i++)
		{
				days = days + a[i];
		}
		days = days - 365;
	}
	days = days + dou + endday - startday;
	System.out.print(days);
	System.out.print("\n");

	return 0;
	}
}

