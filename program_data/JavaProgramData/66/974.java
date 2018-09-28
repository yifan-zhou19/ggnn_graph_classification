package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int i;
		int s;
		int sum = 0;
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
		/* ?????400???? */
		s = (year - 1) % 400 + 1;
		for (i = 1; i < s; i++)
		{
			/* ???????????1 */
			if (i % 4 != 0 || (i % 100 == 0 && i % 400 != 0))
			{
				sum++;
			}
			/* ??????????2 */
			else if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
			{
				sum += 2;
			}
		}
		for (i = 1; i < month; i++)
		{
			/* ??????????3 */
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
			{
				sum += 3;
			}
			/* ??????????2 */
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				sum += 2;
			}
			/* 2??????????? */
			else if (i == 2 && (year % 4 != 0 || (year % 100 == 0 && year % 400 != 0)))
			{
				sum += 0;
			}
			/* 2??????????1 */
			else if (i == 2 && (year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			{
				sum += 1;
			}
		}
		/* ?????? */
		sum += day;
		switch (sum % 7)
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
		}
		return 0;
	}

}

