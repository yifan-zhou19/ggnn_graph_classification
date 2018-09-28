package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int n;
		int weekday;
		int i;
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
		if (year > 400)
		{
			n = (year - 1) % 400;
		}
		else
		{
			n = year - 1;
		}
		n = (int)((n % 100) / 4) + (int)(n / 100) * 5 + n % 100;
		if (((year % 400) % 100) % 4 == 0 && ((year % 400) % 100) != 1 && ((year % 400) % 100) != 2 && ((year % 400) % 100) != 3 && month >= 2)
		{
			i = 1;
		}
		else
		{
			i = 0;
		}
		switch (month)
		{
			case 12:
				n = n + 2;
			case 11:
				n = n + 3;
			case 10:
				n = n + 2;
			case 9:
				n = n + 3;
			case 8:
				n = n + 3;
			case 7:
				n = n + 2;
			case 6:
				n = n + 3;
			case 5:
				n = n + 2;
			case 4:
				n = n + 3;
			case 3:
				n = n + i;
			case 2:
				n = n + 3;
			case 1:
				;
			default :
				;
		}
		n = n + day;
		weekday = n % 7;
		switch (weekday)
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
			default :
				;
		}
		return 0;
	}
}

