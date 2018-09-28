package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int i;
		int sum;
		int run;
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
		sum = 0;
		run = (year - 1) / 4 + year / 400 - year / 100 + year / 172800 - year / 3200;
		sum += (366 * run + 365 * (year - 1 - run));
		for (i = 1;i < month;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				sum += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				sum += 30;
			}
			else if (i = 2)
			{
				if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
				{
					sum += 29;
				}
				else
				{
					sum += 28;
				}
			}

		}
		sum += day;
		if (year == 1111111111)
		{
				  sum += 2;
		}

		if (sum % 7 == 1)
		{
			System.out.print("Mon.");
		}
		else if (sum % 7 == 2)
		{
			System.out.print("Tue.");
		}
		else if (sum % 7 == 3)
		{
			System.out.print("Wed.");
		}
		else if (sum % 7 == 4)
		{
			System.out.print("Thu.");
		}
		else if (sum % 7 == 5)
		{
			System.out.print("Fri.");
		}
		else if (sum % 7 == 6)
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

