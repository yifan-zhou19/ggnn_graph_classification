package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int year;
		int month;
		int day;
		int i;
		int total = 0;
		int week;
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

		year = year % 400 + 400;

		for (i = 1;i < year;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				total = total + 366;
				total = total % 7;
			}
			else
			{
				total = total + 365;
				total = total % 7;
			}
		}
		for (i = 1;i < month;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				total = total + 31;
			}
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				total = total + 30;
			}
			if (i == 2)
			{
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				{
					total = total + 29;
				}
				else
				{
					total = total + 28;
				}
			}
			total = total % 7;
		}
		total = total + day;
		week = total % 7;
		switch (week)
		{
			case 0:
				System.out.print("Sun.");
				break;
			case 1:
				System.out.print("Mon.");
				break;
			case 2:
				System.out.print("Tue.");
				break;
			case 3:
				System.out.print("Wed.");
				break;
			case 4:
				System.out.print("Thu.");
				break;
			case 5:
				System.out.print("Fri.");
				break;
			case 6:
				System.out.print("Sat.");
				break;
			default:
				System.out.print("def.");
				break;
		}
	}



}

