package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int startyear;
		int startmonth;
		int startday;
		int endyear;
		int endmonth;
		int endday;
		int n = 0;
		int year;
		int j;
		int t = 0;
		int d;
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		startyear = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		startmonth = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		startday = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		endyear = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		endmonth = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead();
	if (tempVar6 != null)
	{
		endday = Integer.parseInt(tempVar6);
	}
		for (year = startyear;year <= endyear;year++)
		{
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
			{
				n++;
			}
		}
		year = startyear;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			if (startmonth > 2)
			{
			n--;
			}
		}
		year = endyear;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			if ((endmonth < 2) || ((endmonth == 2) && (endday < 29)))
			{
			n--;
			}
		}
		if (n < 0)
		{
			n = 0;
		}
		for (j = 1;j <= 12;j++)
		{
			if (j > startmonth)
			{
		t = t + a[j];
			}
		}
		t = t + a[startmonth] - startday;
		t = t + 365 * (endyear - startyear - 1) + n;
		for (j = 1;j <= 12;j++)
		{
			if (j < endmonth)
			{
		t = t + a[j];
			}
		}
		t = t + endday;
		System.out.printf("%d",t);
		return 0;
	}
}

