package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year1;
		int month1;
		int day1;
		int year2;
		int month2;
		int day2;
		int total = 0;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			year1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			month1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			day1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			year2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			month2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			day2 = Integer.parseInt(tempVar6);
		}

		for (; ;)
		{
			if (year1 == year2 && month1 == month2 && day1 == day2)
			{
				break;
			}
			else
			{
				if (day1 == 31)
				{
					if (month1 == 1 || month1 == 3 || month1 == 5 || month1 == 7 || month1 == 8 || month1 == 10)
					{
						month1++;
						day1 = 0;
					}
					else if (month1 == 12)
					{
						day1 = 0;
						month1 = 1;
						year1++;
					}
				}
				else if (day1 == 30)
				{
					if (month1 == 4 || month1 == 6 || month1 == 9 || month1 == 11)
					{
						month1++;
						day1 = 0;
					}
				}
				else if (day1 == 28)
				{
					if (month1 == 2)
					{
						if ((year1 % 4 == 0 && year1 % 100 != 0) || (year1 % 400 == 0))
						{
							day1 = 0;
							month1++;
							total++;
						}
						else
						{
							day1 = 0;
							month1++;
						}
					}
				}
			}
			total++;
			day1++;
		}
		System.out.printf("%d",total);
		return 0;
	}
}

