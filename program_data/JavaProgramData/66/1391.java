package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int i;
		int sum = 0;
		int rest;
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
		if (year % 400 != 0)
		{
			year = year % 400;
			for (i = 1;i < year;i++)
			{
				if (i % 4 == 0 && i % 100 != 0)
				{
					  sum += 366;
				}
				else
				{
					sum += 365;
				}
			}
		}
		else
		{
			year = 400;
			for (i = 1;i < 400;i++)
			{
				 if (i % 4 == 0 && i % 100 != 0)
				 {
					  sum += 366;
				 }
				else
				{
					sum += 365;
				}
			}
		}
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
		  else
		  {
			  if (year == 400 || (year % 100 != 0 && year % 4 == 0))
			  {
				   sum += 29;
			  }
			  else
			  {
				   sum += 28;
			  }
		  }
		}
		sum = sum + day;
		rest = sum % 7;
		if (rest == 0)
		{
				 System.out.print("Sun.");
		}
		else if (rest == 1)
		{
				 System.out.print("Mon.");
		}
		else if (rest == 2)
		{
				 System.out.print("Tue.");
		}
		else if (rest == 3)
		{
				 System.out.print("Wed.");
		}
		else if (rest == 4)
		{
				 System.out.print("Thu.");
		}
		else if (rest == 5)
		{
				 System.out.print("Fri.");
		}
		else
		{
				 System.out.print("Sat.");
		}
		return 0;
	}



}

