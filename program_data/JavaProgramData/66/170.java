package <missing>;

public class GlobalMembers
{
	public static int getMonthDay(int year, int month)
	{
		switch (month)
		{
			case 1:
		case 3:
	case 5:
	case 7:
	case 8:
	case 10:
	case 12:
		return 31;
			case 2:
				if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
				{
					return 29;
				}
				return 28;
		}
		return 30;
	}

	public static int Main()
	{

		int year;
		int month;
		int day;
		int total;
			int m;
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
		total = ((year - 1) % 7) * (365 % 7) + (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;

		for (m = 1; m < month; ++m)
		{
			total += getMonthDay(year, m) % 7;
		}
		total += day;
		switch (total % 7)
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
			System.out.print("????!");
			break;
		}
		return total % 7;
	}
}

