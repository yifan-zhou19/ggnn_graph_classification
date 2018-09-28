package <missing>;

public class GlobalMembers
{
	public static int Run(int year)
	{
		if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
		{
			return 1;
		}
		else
		{
			return 0;
		}
	}
	public static int Day(int year,int month1,int month2,int j,int day)
	{
		if (month1 > month2)
		{
			day = month1;
			month1 = month2;
			month2 = day;
		}
		day = 0;
		for (j = month1;j < month2;j++)
		{
			if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
			{
				day += 31;
			}
			else if ((j == 4 || j == 6 || j == 9 || j == 11))
			{
				day += 30;
			}
			else
			{
				if (Run(year) == 0)
				{
					day += 28;
				}
				else
				{
					day += 29;
				}
			}
		}
		return day;
	}

	public static void Main(String[] args)
	{

		int i;
		int j = 1;
		int n;
		int year;
		int month1;
		int month2;
		int day;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				month1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				month2 = Integer.parseInt(tempVar4);
			}
			day = Day(year, month1, month2, j, day);
			if (day % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
	}
}

