package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int year;
		int month;
		int day;
		int i;
		int sum = 0;
		int t;
		int[] month1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] month2 = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
		year = year % 400;
		if (year == 0)
		{
			sum = -2;
		}
		for (i = 0;i < year;i++)
		{
			if (i == 0)
			{
				sum += 0;
			}
			else if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
			{
				sum += 366;
			}
			else
			{
				sum += 365;
			}
		}

		for (i = 0;i < month;i++)
		{
			if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0)
			{
				sum += month2[i];
			}
			else
			{
				sum += month1[i];
			}
		}
		sum += day;
		t = sum % 7;
		switch (t)
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

