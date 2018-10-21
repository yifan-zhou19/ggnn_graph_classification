package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int w;
		int m = 0;
		int year;
		int month;
		int day;
		int total = 0;
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
		for (i = 1; i < month; i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				total += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				total += 30;
			}
			else if (i == 2)
			{
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
				{
					total += 29;
				}
				else
				{
					total += 28;
				}
			}
		}
		year = year - 1;
		int n = year / 4 - year / 100 + year / 400;
		total += n * 2 + (year - n) + day;
		w = total % 7;
		if (w == 1)
		{
			System.out.print("Mon.");
		}
		else if (w == 2)
		{
			System.out.print("Tue.");
		}
		else if (w == 3)
		{
			System.out.print("Wed.");
		}
		else if (w == 4)
		{
			System.out.print("Thu.");
		}
		else if (w == 5)
		{
			System.out.print("Fri.");
		}
		else if (w == 6)
		{
			System.out.print("Sat.");
		}
		else
		{
			System.out.print("Sun.");
		}
		return 0;
	}
}

