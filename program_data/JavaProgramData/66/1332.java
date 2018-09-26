package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int year;
		int month;
		int day;
		int k = 0;
		int days = 0;
		int i;
		int m;
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
		if (year % 4 == 0)
		{
			k = 1;
			if (year % 100 == 0 && year % 400 != 0)
			{
				k = 0;
			}
		}
		for (i = 1;i <= month;i++)
		{
			switch (i - 1)
			{
				case 1:
					days = days + 31;
					break;
				case 2:
					days = days + 28 + k;
					break;
				case 3:
					days = days + 31;
					break;
				case 4:
					days = days + 30;
					break;
				case 5:
					days = days + 31;
					break;
				case 6:
					days = days + 30;
					break;
				case 7:
					days = days + 31;
					break;
				case 8:
					days = days + 31;
					break;
				case 9:
					days = days + 30;
					break;
				case 10:
					days = days + 31;
					break;
				case 11:
					days = days + 30;
					break;
				case 0:
					days = days;
					break;
			}
		}
		year = year % 400;
		if (year == 0)
		{
		year = 400;
		}
		days = days + day;
		k = 0;
		for (i = 1;i < year;i++)
		{
			if (i % 4 == 0)
			{
				k++;
			if (i % 100 == 0 && i % 400 != 0)
			{
				k--;
			}
			}
		}
		days = 365 * (year - 1) + k + days;
		m = days % 7;
		switch (m)
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
				System.out.print("Wes.");
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
	}
}

