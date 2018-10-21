package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int syear;
		int month;
		int date;
		int last;
		int[] mon1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] mon2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int days;
		int a = 0;
		int b = 0;
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
		int i = 1;
		int j = 0;
		int k = 0;
		int w = 1;
		for (w = 1;;w++)
		{
			year = year - 400;
			if (year <= 0)
			{
				syear = year + 400;
				break;
			}
		}
		for (i = 1;i < syear;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
			{
				a += 366;
			}
			else
			{
				a += 365;
			}
		}
		if ((syear % 4 == 0 && syear % 100 != 0) || syear % 400 == 0)
		{
			for (j = 0;j < month;j++)
			{
				b += mon2[j];
			}
		}
		if (syear % 400 != 0 && (syear % 4 != 0 || syear % 100 == 0))
		{
			for (k = 0;k < month;k++)
			{
				b += mon1[k];
			}
		}
		days = a + b + date;
		last = days % 7;
		switch (last)
		{
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
		case 0:
		System.out.print("Sun.");
		break;
		}
		return 0;
	}

}

