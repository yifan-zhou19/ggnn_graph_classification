package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int i;
		int date = 0;
		int[] m = {3, 0, 3, 2, 3, 2, 3, 3, 2, 3, 2, 3};
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
		year -= 1;
		date = year + year / 4 - year / 100 + year / 400;
		year += 1;
		if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
		{
			m[1] = 1;
		}
		for (i = 0;i < (month - 1);i++)
		{
			date += m[i];
		}
		date += day;
		date = date % 7;
		switch (date)
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
		}
		return 0;
	}
}

