package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int startYear;
		int startMonth;
		int startDay;
		int endYear;
		int endMonth;
		int endDay;
		int TOTAL1 = 0;
		int TOTAL2 = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		startYear = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		startMonth = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		startDay = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead("\n");
	if (tempVar4 != null)
	{
		endYear = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		endMonth = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		endDay = Integer.parseInt(tempVar6);
	}
	for (year = 1;year < startYear;year++)
	{
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
	  TOTAL1 += 366;
		}
	else
	{
		TOTAL1 += 365;
	}
	}
	for (month = 1;month < startMonth;month++)
	{
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
	TOTAL1 += 31;
		}
	else if (month == 2 && ((startYear % 4 == 0 && startYear % 100 != 0) || (startYear % 400 == 0)))
	{
	TOTAL1 += 29;
	}
	else
	{
		TOTAL1 += 30;
	}
	}
	TOTAL1 += startDay;


	for (year = 1;year < endYear;year++)
	{
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
	  TOTAL2 += 366;
		}
	else
	{
		TOTAL2 += 365;
	}
	}
	for (month = 1;month < endMonth;month++)
	{
		if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12)
		{
	TOTAL2 += 31;
		}
	else if (month == 2 && ((endYear % 4 == 0 && endYear % 100 != 0) || (endYear % 400 == 0)))
	{
	TOTAL2 += 29;
	}
	else
	{
		TOTAL2 += 30;
	}
	}
	TOTAL2 += endDay;

	System.out.printf("%d",TOTAL2 - TOTAL1);
	return 0;
	}

}

