package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int i;
		int c;
		int b;
		b = 0;
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
		if ((year - 1) % 400 != 0)
		{
			for (i = 1;i <= (year - 1) % 400;i++)
			{
				if (i % 4 == 0 && i % 100 != 0)
				{
					b += 366;
				}
				else
				{
					b += 365;
				}
			}
		}
		for (i = 1;i < month;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				b += 31;
			}
			else
			{
				if (i == 4 || i == 6 || i == 9 || i == 11)
				{
					b += 30;
				}
				else
				{
					if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
					{
						b += 29;
					}
					else
					{
						b += 28;
					}
				}
			}
		}
		b += day;
		c = b % 7;
		switch (c)
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

