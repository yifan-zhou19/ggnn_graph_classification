package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int days;
		int i;
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
		if (year % 4 == 0 && year % 100 == !0)
		{
			switch (month)
			{
			case 1:
				days = day;
				break;
			case 2:
				days = 31 + day;
				break;
			case 3:
				days = 31 + 29 + day;
				break;
			case 4:
				days = 31 + 29 + 31 + day;
				break;
			case 5:
				days = 31 + 29 + 31 + 30 + day;
				break;
			case 6:
				days = 31 + 31 + 29 + 31 + 30 + day;
				break;
			case 7:
				days = 30 + 31 + 31 + 29 + 31 + 30 + day;
				break;
			case 8:
				days = 31 + 30 + 31 + 31 + 29 + 31 + 30 + day;
				break;
			case 9:
				days = 31 + 31 + 30 + 31 + 31 + 29 + 31 + 30 + day;
				break;
			case 10:
				days = 30 + 31 + 31 + 30 + 31 + 31 + 29 + 31 + 30 + day;
				break;
			case 11:
				days = 31 + 30 + 31 + 31 + 30 + 31 + 31 + 29 + 31 + 30 + day;
				break;
			case 12:
				days = 30 + 31 + 30 + 31 + 31 + 30 + 31 + 31 + 29 + 31 + 30 + day;
			default:
				;
			}
		}
		else
		{
			switch (month)
			{
			case 1:
				days = day;
				break;
			case 2:
				days = 31 + day;
				break;
			case 3:
				days = 31 + 28 + day;
				break;
			case 4:
				days = 31 + 28 + 31 + day;
				break;
			case 5:
				days = 31 + 28 + 31 + 30 + day;
				break;
			case 6:
				days = 31 + 31 + 28 + 31 + 30 + day;
				break;
			case 7:
				days = 30 + 31 + 31 + 28 + 31 + 30 + day;
				break;
			case 8:
				days = 31 + 30 + 31 + 31 + 28 + 31 + 30 + day;
				break;
			case 9:
				days = 31 + 31 + 30 + 31 + 31 + 28 + 31 + 30 + day;
				break;
			case 10:
				days = 30 + 31 + 31 + 30 + 31 + 31 + 28 + 31 + 30 + day;
				break;
			case 11:
				days = 31 + 30 + 31 + 31 + 30 + 31 + 31 + 28 + 31 + 30 + day;
				break;
			case 12:
				days = 30 + 31 + 30 + 31 + 31 + 30 + 31 + 31 + 28 + 31 + 30 + day;
			default:
				;
			}
		}
		System.out.printf("%d",days);
		return 0;
	}
}

