package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int year;
		int month;
		int day;
		int total;
		int i;
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
		total = 0;
		for (i = 1;i < month;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				total = total + 31;
			}
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				total = total + 30;
			}
			if (i == 2)
			{
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				{
					total = total + 29;
				}
				else
				{
					total = total + 28;
				}
			}
		}
		total = total + day;
		System.out.printf("%d",total);
	}
}

