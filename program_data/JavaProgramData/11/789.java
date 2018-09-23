package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
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
		if (month == 2)
		{
			System.out.printf("%d",31 + day);
		}
	else
	{
		if (month == 1)
		{
			System.out.printf("%d",day);
		}
		else
		{
			if (month == 3)
			{
				day = day + 59;
			}
			if (month == 4)
			{
				day = day + 90;
			}
			if (month == 5)
			{
				day = day + 120;
			}
			if (month == 6)
			{
				day = day + 151;
			}
			if (month == 7)
			{
				day = day + 181;
			}
			if (month == 8)
			{
				day = day + 212;
			}
			if (month == 9)
			{
				day = day + 243;
			}
			if (month == 10)
			{
				day = day + 273;
			}
			if (month == 11)
			{
				day = day + 304;
			}
			if (month == 12)
			{
				day = day + 334;
			}
			if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
			{
				System.out.printf("%d",day + 1);
			}
			else
			{
				System.out.printf("%d",day);
			}
		}
	}
		return 0;
	}


}

