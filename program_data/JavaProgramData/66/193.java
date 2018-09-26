package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int year;
		int month;
		int day;
		int i;
		int j = 0;
		int first;
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
		j = (year - 1) / 400 * 97 + ((year - 1) % 400) / 100 * 24 + ((year - 1) % 100) / 4;
		first = (year + j) % 7;

		int[] monthday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = 0;i < month - 1;i++)
		{
			day = day + monthday[i];
		}
		if (year % 4 == 0)
		{
			if (year % 100 == 0)
			{
				if (year % 400 == 0)
				{
					if (month > 2)
					{
					day++;
					}
				}
			}
			else
			{
				if (month > 2)
				{
				day++;
				}
			}
		}
		//printf("%d %d %d\n",j,first,day);
		int weekday = (day - 1 + first) % 7;
		switch (weekday)
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
		}
	}

}

