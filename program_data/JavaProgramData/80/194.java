package <missing>;

public class GlobalMembers
{
	public static int year1;
	public static int month1;
	public static int day1;
	public static int year2;
	public static int month2;
	public static int day2;
	public static int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int Main()
	{
		int i;
		int j;
		int temp;
		int dis1;
		int dis2;
		int sum;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			year2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			month2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			day2 = Integer.parseInt(tempVar6);
		}
		int cmpa;
		int ru = int year;
		if (cmpa == 0)
		{
			temp = year1;
			year1 = year2;
			year2 = temp;
			temp = month1;
			month1 = month2;
			month2 = temp;
			temp = day1;
			day1 = day2;
			day2 = temp;
		}
		dis1 = 0;
		for (i = 1; i < month1; i++)
		{
			if ((i == 2) && (ru(year1) == 1))
			{
				dis1++;
			}
			dis1 = dis1 + month[i];
		}
		dis1 = dis1 + day1;
		dis2 = 0;
		for (i = 1; i < month2; i++)
		{
			if ((i == 2) && (ru(year2) == 1))
			{
				dis2++;
			}
			dis2 = dis2 + month[i];
		}
		dis2 = dis2 + day2;
		sum = dis2 - dis1;
		for (i = year1; i < year2; i++)
		{
			if (ru(i) == 1)
			{
				sum = sum + 366;
			}
			else
			{
				sum = sum + 365;
			}
		}
		System.out.printf("%d",sum);
		return 0;
	}

	public static int cmpa()
	{
		if (year1 < year2)
		{
			return (1);
		}
		if (year1 > year2)
		{
			return (0);
		}
		if (month1 < month2)
		{
			return (1);
		}
		if (month1 > month2)
		{
			return (0);
		}
		if (day1 < day2)
		{
			return (1);
		}
		return (0);
	}
	public static int ru(int year)
	{
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}

}

