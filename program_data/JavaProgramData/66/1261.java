package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
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
		int runnian = 0;
		runnian = (year - 1) / 4 - (year - 1) / 100 + (year - 1) / 400;


		int yunian = year % 7 - 1;
		int total;
		total = yunian * 365 + day;
		int[] n = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
		int j = 0;
		while (j + 1 < month)
		{
			j++;
		}
		total = total + n[j];
		if ((year / 4 == 0 && year / 100 != 0) || (year / 400 == 0))
		{
			if (j > 1)
			{
				total++;
			}
		}
		total += runnian;
		int today;
		today = total % 7;
		switch (today)
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
		}
		return 0;
	}
}

