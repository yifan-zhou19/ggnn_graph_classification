package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int sum = 0;
		int[] d = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
		if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) // when this year is a leap year.
		{
			if (month > 2) // when >=3 month
			{
				  sum = sum + 29 + 31;
				  for (int k = 3;k < month;k++)
				  {
					  sum = sum + d[k];
				  }
				  sum = sum + day;
			}
			else if (month == 2)
			{
				sum = 31 + day;
			}
			else
			{
				sum = day;
			}

		}
		else // when this year is not a leap year.
		{
			if (month > 2) // when >=3 month
			{
				  sum = sum + 28 + 31;
				  for (int k = 3;k < month;k++)
				  {
					  sum = sum + d[k];
				  }
				  sum = sum + day;
			}
			else if (month == 2)
			{
				sum = 31 + day;
			}
			else
			{
				sum = day;
			}
		}
		System.out.printf("%d",sum);
		System.in.read();
		System.in.read();
		System.in.read();
	}

}

