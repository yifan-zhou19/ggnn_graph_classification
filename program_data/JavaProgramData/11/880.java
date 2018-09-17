package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int year;
		int mon;
		int date;
		int day = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			mon = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			date = Integer.parseInt(tempVar3);
		}
		switch (mon)
		{
		case 1:
			day = date;
			break;
		case 2:
			day = 31 + date;
			break;
		case 3:
			day = 31 + 28 + date;
			break;
		case 4:
			day = 31 + 28 + 31 + date;
			break;
		case 5:
			day = 31 + 28 + 31 + 30 + date;
			break;
		case 6:
			day = 31 + 28 + 31 + 30 + 31 + date;
			break;
		case 7:
			day = 31 + 28 + 31 + 30 + 31 + 30 + date;
			break;
		case 8:
			day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + date;
			break;
		case 9:
			day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + date;
			break;
		case 10:
			day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + date;
			break;
		case 11:
			day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + date;
			break;
		case 12:
			day = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + date;
			break;
		}
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			if (mon > 2)
			{
				day++;
			}
		}
		System.out.printf("%d",day);



	}
}

