package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int days1 = 0;
		int days2 = 0;
		int days = 0;
		int leap_year = 0;
		int startYear;
		int startMonth;
		int startDay;
		int endYear;
		int endMonth;
		int endDay;
		int[] year = {365, 366};
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		startYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		startDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		endDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		if (startYear == endYear)
		{
		  if ((startYear % 4 == 0 && startYear % 100 != 0) || (startYear % 400 == 0))
		  {
		   for (i = 0;i < startMonth - 1;i++)
		   {
			   days1 = days1 + month[12 + i];
		   }
		   days1 = days1 + startDay;
		   for (j = 0;j < endMonth - 1;j++)
		   {
			   days2 = days2 + month[12 + j];
		   }
		   days2 = days2 + endDay;
		   days = days2 - days1;
		   System.out.print(days);
		   System.out.print("\n");
		  }
		 else
		 {
		   for (i = 0;i < startMonth - 1;i++)
		   {
			   days1 = days1 + month[i];
		   }
		   days1 = days1 + startDay;
		   for (j = 0;j < endMonth - 1;j++)
		   {
			   days2 = days2 + month[j];
		   }
		   days2 = days2 + endDay;
		   days = days2 - days1;
		   System.out.print(days);
		   System.out.print("\n");
		 }
		}
	   if (startYear != endYear)
	   {
		 k = startYear;
		 while (k < endYear)
		 {
			 leap_year = ((k % 4 == 0 && k % 100 != 0) || (k % 400 == 0));
		 days = days + year[leap_year];
		 k++;
		 }
		 if ((startYear % 4 == 0 && startYear % 100 != 0) || (startYear % 400 == 0))
		 {
		   for (i = 0;i < startMonth - 1;i++)
		   {
			   days1 = days1 + month[12 + i];
		   }
		   days1 = days1 + startDay;
		 }
		 else
		 {
		  for (i = 0;i < startMonth - 1;i++)
		  {
			   days1 = days1 + month[i];
		  }
		   days1 = days1 + startDay;
		 }
		   days = days - days1;
		  if ((endYear % 4 == 0 && endYear % 100 != 0) || (endYear % 400 == 0))
		  {
		   for (i = 0;i < endMonth - 1;i++)
		   {
			   days2 = days2 + month[12 + i];
		   }
		   days2 = days2 + endDay;
		  }
		  else
		  {
		   for (i = 0;i < endMonth - 1;i++)
		   {
			   days2 = days2 + month[i];
		   }
			days2 = days2 + endDay;
		  }
		   days = days + days2;
		   System.out.print(days);
		   System.out.print("\n");
	   }

		return 0;
	}

}

