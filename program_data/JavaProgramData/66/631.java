package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year2;
		int year1;
		int year;
		int month;
		int day;
		int count;
		int c;

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

		year2 = ((year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400) * (366 % 7);

		year1 = (year - 1) * (365 % 7) + ((year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400);

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			if (month >= 8)
			{
				count = ((month - 1) / 2 + 1) * 31 + 29 + (month - 3 - (month - 1) / 2) * 30 + year1 + day;
			}
			else if (2 < month && month < 8)
			{
				count = (month / 2) * 31 + 29 + (month - month / 2 - 2) * 30 + year1 + day;
			}
			else
			{
				count = month / 2 * 31 + year1 + day;
			}
		}
		else
		{
			 if (month >= 8)
			 {
				count = ((month - 1) / 2 + 1) * 31 + 28 + (month - 3 - (month - 1) / 2) * 30 + year1 + day;
			 }
			else if (2 < month && month < 8)
			{
				count = (month / 2) * 31 + 28 + (month - month / 2 - 2) * 30 + year1 + day;
			}
			else
			{

				count = month / 2 * 31 + year1 + day;
			}
		}
		c = count % 7;

		switch (c)
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
		default:
			System.out.printf("%d",c);
		}
		return 0;
	}
}

