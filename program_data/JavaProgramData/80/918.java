package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int s = 0;
		int i;
//C++ TO JAVA CONVERTER TODO TASK: Java does not allow declaring types within methods:
	//	struct Date
	//	{
	//		int year;
	//		int month;
	//		int day;
	//	}
	//	date1,date2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			date1.year = tempVar;
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			date1.month = tempVar2;
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			date1.day = tempVar3;
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			date2.year = tempVar4;
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			date2.month = tempVar5;
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			date2.day = tempVar6;
		}
		s += (date2.year - date1.year) * 365;
		s += (date2.month - date1.month) * 30;
		s += (date2.day - date1.day);
		for (i = date1.year;i < date2.year;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
			s++;
			}
		}
		if (date2.month >= date1.month)
		{
			for (i = date1.month;i < date2.month;i++)
			{
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
				{
					s++;
				}
				if (i == 2)
				{
					if ((date2.year % 4 == 0 && date2.year % 100 != 0) || (date2.year % 400 == 0))
					{
						s--;
					}
					else
					{
						s = s - 2;
					}
				}
			}
		}
		else
		{
			for (i = date2.month;i < date1.month;i++)
			{
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
				{
					s--;
				}
				if (i == 2)
				{
					if ((date2.year % 4 == 0 && date2.year % 100 != 0) || (date2.year % 400 == 0))
					{
						s++;
					}
					else
					{
						s = s + 2;
					}
				}
			}
		}
		System.out.printf("%d",s);
	}

}

