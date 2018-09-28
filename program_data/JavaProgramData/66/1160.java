package <missing>;

public class GlobalMembers
{
	public static int isRunNian(int year)
	{
		int result;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		  return result;
	}
	public static int Main()
	{
		int year;
		int month;
		int day;
		int total;
		int j;
		int xqj;
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


			 total = 0;
		for (int i = 1; i < month; i++)
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
				if (isRunNian(year) != 0)
				{
					total += 29;
				}
				else
				{
					total += 28;
				}
			}
		}
		total += day;
		year = year - 1;
		xqj = total % 7;
		xqj = xqj + (year / 4 - year / 100 + year / 400) * 2 + year - (year / 4 - year / 100 + year / 400);
					   xqj = xqj % 7;
					  if (xqj == 0)
					  {
								 System.out.print("Sun.");
					  }
								 if (xqj == 1)
								 {
								 System.out.print("Mon.");
								 }
								  if (xqj == 2)
								  {
								 System.out.print("Tue.");
								  }
								  if (xqj == 3)
								  {
								 System.out.print("Wed.");
								  }
								 if (xqj == 4)
								 {
								 System.out.print("Thu.");
								 }
									if (xqj == 5)
									{
								 System.out.print("Fri.");
									}
								  if (xqj == 6)
								  {
								 System.out.print("Sat.");
								  }



		  return 0;
	}


}

