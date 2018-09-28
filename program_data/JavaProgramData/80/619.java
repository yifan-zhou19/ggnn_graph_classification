package <missing>;

public class GlobalMembers
{
	public static int year1;
	public static int year2;
	public static int month1;
	public static int month2;
	public static int day1;
	public static int day2;
	public static int[][] year =
	{
		{0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
		{0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
	};
	public static int[] month = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int Main()
	{
		int count_year = 0;

		int count_month = 0;

		int count_day = 0;

		int judge = int a;

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
		System.out.printf("%d\n",(count_year() + count_month() + count_day()));

		return 0;
	}
	public static int judge(int a)
	{
		if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int count_year()
	{
		int i;
		int ans = 0;
		for (i = year1 + 1;i < year2;i++)
		{
			ans += 365 + judge(i);
		}
		return ans;
	}
	public static int count_month()
	{
		int i;
		int ans = 0;
		if (year2 > year1)
		{
			month2 += 12;
		}
		month[2] = year[judge(year1)][2];
		month[14] = year[judge(year2)][2];
		for (i = month1 + 1;i < month2;i++)
		{
			ans += month[i];
		}
		return ans;
	}
	public static int count_day()
	{
		if (month2 > month1)
		{
			return (year[judge(year1)][month1] - day1 + day2);
		}
		else
		{
			return (day2 - day1);
		}
	}

}

