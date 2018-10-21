package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int a;
		int day1 = 0;
		int day2 = 0;
		int k;
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
		a = (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400 - (year - 1) / 10000 + (year - 1) / 40000 - (year - 1) / 1000000 + (year - 1) / 4000000 - (year - 1) / 100000000 + (year - 1) / 400000000 - (year - 1) / 10000000000 + (year - 1) / 40000000000;
		day1 = 365 * (year - 1 - a) + 366 * a;
		if (month == 1)
		{
			day2 = day;
		}
		if (month == 2)
		{
			day2 = 3 + day;
		}
		if (month == 3)
		{
			day2 = 3 + day;
		}
		if (month == 4)
		{
			day2 = 6 + day;
		}
		if (month == 5)
		{
			day2 = 1 + day;
		}
		if (month == 6)
		{
			day2 = 4 + day;
		}
		if (month == 7)
		{
			day2 = 6 + day;
		}
		if (month == 8)
		{
			day2 = 2 + day;
		}
		if (month == 9)
		{
			day2 = 5 + day;
		}
		if (month == 10)
		{
			day2 = day;
		}
		if (month == 11)
		{
			day2 = 3 + day;
		}
		if (month == 12)
		{
			day2 = 5 + day;
		}
		if ((((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) && (month > 2))
		{
			day2 = day2 + 1;
		}
		k = (day1 + day2) % 7;
		if (k == 0)
		{
			System.out.print("Sun.\n");
		}
		if (k == 1)
		{
			System.out.print("Mon.\n");
		}
		if (k == 2)
		{
			System.out.print("Tue.\n");
		}
		if (k == 3)
		{
			System.out.print("Wed.\n");
		}
		if (k == 4)
		{
			System.out.print("Thu.\n");
		}
		if (k == 5)
		{
			System.out.print("Fri.\n");
		}
		if (k == 6)
		{
			System.out.print("Sat.\n");
		}
		return 0;
	}
}

