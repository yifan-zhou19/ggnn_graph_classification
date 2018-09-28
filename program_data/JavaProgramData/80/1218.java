package <missing>;

public class GlobalMembers
{
	public static int calday(int year, int month, int day)
	{
		int total = 0;
		int y;
		int m;
		int Feb;
		for (y = 0;y < year;y++)
		{
			Feb = ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))?29:28;
			for (m = 0;m <= 12;m++)
			{
				if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
				{
					total += 31;
				}
				if (m == 2)
				{
					total += Feb;
				}
				if (m == 4 || m == 6 || m == 9 || m == 11)
				{
					total += 30;
				}
			}
		}
		if (y == year)
		{
			Feb = ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))?29:28;
			for (m = 0;m < month;m++)
			{
				if (m == 1 || m == 3 || m == 5 || m == 7 || m == 8 || m == 10 || m == 12)
				{
					total += 31;
				}
				if (m == 2)
				{
					total += Feb;
				}
				if (m == 4 || m == 6 || m == 9 || m == 11)
				{
					total += 30;
				}
			}
			if (m == month)
			{
				total += day;
			}
		}
		return total;
	}
	public static int Main()

	{
		int syear;
		int smonth;
		int sday;
		int eyear;
		int emonth;
		int eday;
		int tday1;
		int tday2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			syear = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			smonth = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			sday = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			eyear = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			emonth = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			eday = Integer.parseInt(tempVar6);
		}
		tday1 = calday(syear, smonth, sday);
		tday2 = calday(eyear, emonth, eday);
		System.out.printf("%d\n",tday2 - tday1);
		return 0;
	}
}

