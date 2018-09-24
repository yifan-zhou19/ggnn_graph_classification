package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int days = 0;
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
		days = ((year - 1) % 7 + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400) % 7;
		int i;
		for (i = 1;i < month;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				days += 31;
			}
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				days += 30;
			}
			if (i == 2)
			{
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
				{
					days += 29;
				}
				else
				{
					days += 28;
				}
			}
		}
		days = (days + day) % 7;
		switch (days)
		{
			case 1:
				System.out.print("Mon.\n");
				break;
			case 2:
				System.out.print("Tue.\n");
				break;
			case 3:
				System.out.print("Wed.\n");
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
			case 0:
				System.out.print("Sun.\n");
				break;
		}
		return 0;
	}
}

