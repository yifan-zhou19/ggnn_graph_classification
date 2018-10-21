package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int year;
		int month;
		int data;
		int days = 0;
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
			data = Integer.parseInt(tempVar3);
		}
		days = data;
		if (month == 1)
		{
			days = days;
		}
		else
		{
			for (i = 1;i < month;i++)
			{
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
				{
				days = days + 31;
				}
				else
				{
				if (i == 4 || i == 6 || i == 9 || i == 11)
				{
				days = days + 30;
				}
				else
				{
				if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
				{
				days = days + 29;
				}
				else
				{
					days = days + 28;
				}
				}
				}
			}
			days = days;
		}
		System.out.printf("%d",days);
		return 0;
	}


}

