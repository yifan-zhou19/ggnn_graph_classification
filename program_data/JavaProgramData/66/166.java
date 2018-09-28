package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] leap = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] none = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	//C++ TO JAVA CONVERTER WARNING: Unsigned integer types have no direct equivalent in Java:
	//ORIGINAL LINE: unsigned long a,year,month,day,i,week;
		int a;
		int year;
		int month;
		int day;
		int i;
		int week;
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
			a = year / 4 - year / 100 + year / 400;
			if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))
			{
				a = a - 1;
				day += year - 1 - a + 2 * a;
				for (i = 0;i < (month - 1);i++)
				{
				day += leap[i];
				}
				week = day % 7;
			}
		else
		{
			day += year - 1 - a + 2 * a;
			for (i = 0;i < (month - 1);i++)
			{
				day += none[i];
			}
				week = day % 7;
		}

		switch (week)
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

		}

	return 0;
	}
}

