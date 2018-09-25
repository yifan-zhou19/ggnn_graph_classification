package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int date;
		int February;
		int day;
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
			date = Integer.parseInt(tempVar3);
		}
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			February = 29;
		}
		else
		{
			February = 28;
		}
		if (month == 1)
		{
			day = date;
		}
		if (month == 2)
		{
			day = 31 + date;
		}
		if (month == 3)
		{
			day = 31 + February + date;
		}
		if (month == 4)
		{
			day = 31 + February + 31 + date;
		}
		if (month == 5)
		{
			day = 31 + February + 31 + 30 + date;
		}
		if (month == 6)
		{
			day = 31 + February + 31 + 30 + 31 + date;
		}
		if (month == 7)
		{
			day = 31 + February + 31 + 30 + 31 + 30 + date;
		}
		if (month == 8)
		{
			day = 31 + February + 31 + 30 + 31 + 30 + 31 + date;
		}
		if (month == 9)
		{
			day = 31 + February + 31 + 30 + 31 + 30 + 31 + 31 + date;
		}
		if (month == 10)
		{
			day = 31 + February + 31 + 30 + 31 + 30 + 31 + 31 + 30 + date;
		}
		if (month == 11)
		{
			day = 31 + February + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + date;
		}
		if (month == 12)
		{
			day = 31 + February + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + date;
		}
		System.out.printf("%d\n", day);
		return 0;
	}
}

