package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int date;
		int leap;
		int num = 0;
		int[] mon = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
			date = Integer.parseInt(tempVar3);
		}

		if (year % 100 == 0)
		{
			if (year % 400 == 0)
			{
				leap = 1;
			}
			else
			{
				leap = 0;
			}
		}
		else
		{
			if (year % 4 == 0)
			{
				leap = 1;
			}
			else
			{
				leap = 0;
			}
		}

		int i;
		switch (leap)
		{
			case 1:
				for (i = 0; i < month - 1; i++)
				{
						num = num + mon[i];
				}
					if (month >= 3)
					{
						num = num + date + 1;
					}
					else
					{
						num = num + date;
					}
					break;
			case 0:
				for (i = 0; i < month - 1; i++)
				{
						num = num + mon[i];
				}
					num = num + date;
		}

		System.out.printf("%d", num);

		return 0;
	}

}

