package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int all;
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
		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))
		{
			  if (month == 1)
			  {
						  all = day;
			  }
			  if (month == 2)
			  {
						  all = day + 31;
			  }
			  if (month == 3)
			  {
						  all = day + 29 + 31;
			  }
			  if (month == 4)
			  {
						  all = day + 29 + 31 + 31;
			  }
			  if (month == 5)
			  {
						  all = day + 29 + 31 + 31 + 30;
			  }
			  if (month == 6)
			  {
						  all = day + 31 + 29 + 31 + 30 + 31;
			  }
			  if (month == 7)
			  {
						  all = day + 31 + 29 + 31 + 30 + 31 + 30;
			  }
			  if (month == 8)
			  {
						  all = day + 31 + 29 + 31 + 30 + 31 + 30 + 31;
			  }
			  if (month == 9)
			  {
						  all = day + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31;
			  }
			  if (month == 10)
			  {
						  all = day + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
			  }
			  if (month == 11)
			  {
						  all = day + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			  }
			  if (month == 12)
			  {
						  all = day + 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
			  }
		}
		else
		{
			if (month == 1)
			{
						  all = day;
			}
			  if (month == 2)
			  {
						  all = day + 31;
			  }
			  if (month == 3)
			  {
						  all = day + 28 + 31;
			  }
			  if (month == 4)
			  {
						  all = day + 28 + 31 + 31;
			  }
			  if (month == 5)
			  {
						  all = day + 28 + 31 + 31 + 30;
			  }
			  if (month == 6)
			  {
						  all = day + 31 + 28 + 31 + 30 + 31;
			  }
			  if (month == 7)
			  {
						  all = day + 31 + 28 + 31 + 30 + 31 + 30;
			  }
			  if (month == 8)
			  {
						  all = day + 31 + 28 + 31 + 30 + 31 + 30 + 31;
			  }
			  if (month == 9)
			  {
						  all = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31;
			  }
			  if (month == 10)
			  {
						  all = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30;
			  }
			  if (month == 11)
			  {
						  all = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31;
			  }
			  if (month == 12)
			  {
						  all = day + 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30;
			  }
		}
		System.out.printf("%d",all);
	}
}

