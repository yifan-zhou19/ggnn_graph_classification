package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int year;
	int month;
	int day;
	int days = 0;
	int i;
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
	year = year % 400;
	if (((year % 4 == 0) && (year % 100 != 0)) || (year == 0))
	{
	for (i = 2;i <= month;i++)
	{
	switch (i)
	{
	case 3:
		days += 1;
		break;
	case 2:
	case 4:
	case 6:
	case 8:
	case 9:
	case 11:
		days += 3;
		break;
	case 5:
	case 7:
	case 10:
	case 12:
		days += 2;
		break;
	}

	}
	days -= 1;

	}
	else
	{
		for (i = 2;i <= month;i++)
		{
	switch (i)
	{
	case 3:
		break;
	case 2:
	case 4:
	case 6:
	case 8:
	case 9:
	case 11:
		days += 3;
		break;
	case 5:
	case 7:
	case 10:
	case 12:
		days += 2;
		break;
	}

		}
	}
	days += day + year - 1 + year / 4 - year / 100;
	switch (days % 7)
	{
	case 0:
		System.out.print("Sun.\n");
		break;
	case 1:
		System.out.print("Mon.\n");
		break;
	case 2:
		System.out.print("Tue.\n");
		break;
	case 3:
		System.out.print("Wen.\n");
		break;
	case 4:
		System.out.print("Thu.\n");
		break;
	case 5:
		System.out.print("Fri.\n");
		break;
	case 6:
		System.out.print("Sat.\n");
		break;

	}
	return 0;
	}

}

