package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int month;
		int day;
		int week = 0;
		int i;
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned int year;
		int year;
		int[] m = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] weekday = {"Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat"};
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
		week = year % 7 + year / 4 - year / 100 + year / 400;
		for (i = 0;i < month;i++)
		{
		week = week + m[i];
		}
		week += day - 1;
		if (((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) && month <= 2)
		{
			week--;
		}
		System.out.printf("%s.",weekday[week % 7]);
		return 0;
	}


}

