package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int year;
	int month;
	int day;
	int total;
	int i;
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
			day = Integer.parseInt(tempVar3);
		}
		total = 0;
		if (year > 1111100000)
		{
			year -= 1111100000;
		}
		for (i = 1; i < month; i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				total += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				total += 30;
			}
			else if (i == 2)
			{
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
				{
					total += 29;
				}
				else
				{
					total += 28;
				}
			}
		}
		total += day;
	for (i = 1;i < year;i++)
	{
		if (i % 400 == 0 || (i % 4 == 0 && i % 100 != 0))
		{
			total += 2;
		}
	else
	{
		total += 1;
	}
	}
	if (total % 7 == 1)
	{
		System.out.print("Mon.");
	}
	if (total % 7 == 2)
	{
		System.out.print("Tue.");
	}
	if (total % 7 == 3)
	{
		System.out.print("Wed.");
	}
	if (total % 7 == 4)
	{
		System.out.print("Thu.");
	}
	if (total % 7 == 5)
	{
		System.out.print("Fri.");
	}
	if (total % 7 == 6)
	{
		System.out.print("Sat.");
	}
	if (total % 7 == 0)
	{
		System.out.print("Sun.");
	}
	return 0;
	}

}

