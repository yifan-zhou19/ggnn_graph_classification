package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int Year;
		int Month;
		int Day;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			day = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			Year = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			Month = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			Day = Integer.parseInt(tempVar6);
		}
		int[] m = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
		int i;
		int date;
		for (i = 0;i <= 11;i++)
		{
			if (Month == i + 1)
			{
				date = m[i];
				break;
			}
		}
		date = date + Day;
		for (i = 0;i <= 11;i++)
		{
			if (month == i + 1)
			{
				date = date+365 - m[i];
				break;
			}
		}
		date = date - day;
		int r;
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			r = Math.floor((Year - year) / 4) + 1;
		}
		else
		{
			if (year % 4 == 1)
			{
				r = Math.floor((Year - year + 1) / 4);
			}
			else
			{
				if (year % 4 == 2)
				{
					r = Math.floor((Year - year + 2) / 4);
				}
				else
				{
					if (year % 4 == 3)
					{
						r = Math.floor((Year - year + 3) / 4);
					}
				}
			}
		}
		if (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && (month > 2))
		{
			r = r - 1;
		}
		if (((Year % 4 == 0 && Year % 100 != 0) || (Year % 400 == 0)) && (Month < 3))
		{
			r = r - 1;
		}
		int h = year % 400;
		int s = year % 100;
		r = r - Math.floor((Year - year + s) / 100) + Math.floor((Year - year + h) / 400);
		date = date + r + 365 * (Year - year - 1);
		System.out.printf("%d",date);
		return 0;
	}
}

