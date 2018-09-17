package <missing>;

public class GlobalMembers
{
	public static int leapyear(int year)
	{
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int whichday(int year,int month,int day)
	{
		int[] mon = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int d = 0;
		int i;
		if (leapyear(year) == 1)
		{
			mon[1]++;
		}
		for (i = 0;i < month - 1;i++)
		{
			d += mon[i];
		}
		d += day;
		return d;
	}
	public static int Main()
	{
		int year;
		int month;
		int day;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		d = whichday(year, month, day);
		System.out.printf("%d",d);
	}

}

