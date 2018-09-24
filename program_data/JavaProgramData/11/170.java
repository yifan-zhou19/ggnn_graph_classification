package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int year;
		int month;
		int day;
		int date = 0;
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
		for (i = 1;i < month;i++)
		{
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				date = date+30;
			}
			else
			{
				if (i == 2)
				{
					if (year % 100 != 0 && year % 4 == 0 || year % 400 == 0)
					{
						date = date+29;
					}
					else
					{
						date = date+28;
					}
				}
				else
				{
					date = date+31;
				}
			}
		}
		date = date + day;
		System.out.printf("%d\n",date);
		return 0;
	}

}

