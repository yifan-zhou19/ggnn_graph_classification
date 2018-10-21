package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int date;
		int i;
		int n = 0;
		int xq;
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
			date = Integer.parseInt(tempVar3);
		}
		year = year % 400;
		if (year == 0)
		{
			year = 400;
		}
		for (i = 1;i < year;i++)
		{
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
			{
				n += 366;
			}
			else
			{
				n += 365;
			}
		}
		for (i = 1;i < month;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
			{
				n += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				n += 30;
			}
			else
			{
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				{
					n += 29;
				}
				else
				{
					n += 28;
				}
			}
		}
		n += date;
		xq = n % 7;
		switch (xq)
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
		}
		return 0;
	}
}

