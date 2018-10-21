package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int startYear;
	 int startMonth;
	 int stratDay;
	 int endYear;
	 int endMonth;
	 int endDay;
	 int i;
	 int sum = 0;
	 int num1 = 0;
	 int num2 = 0;
	 int total;
	 int[] g = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	 int[] s = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  startYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  startMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  stratDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  endYear = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  endMonth = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  endDay = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = startYear;i < endYear;i++)
	  {
		  if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
		  {
			  sum = sum + 366;
		  }
		  else
		  {
			  sum = sum + 365;
		  }
	  }
	  for (i = 0;i < startMonth;i++)
	  {
		  if ((startYear % 4 == 0 && startYear % 100 != 0) || (startYear % 400 == 0))
		  {
			  num1 = num1 + s[i];
		  }
		  else
		  {
			  num1 = num1 + g[i];
		  }

	  }
	  num1 = num1 + stratDay;
	  for (i = 0;i < endMonth;i++)
	  {
		   if ((endYear % 4 == 0 && endYear % 100 != 0) || (endYear % 400 == 0))
		   {
			  num2 = num2 + s[i];
		   }
		   else
		   {
			   num2 = num2 + g[i];
		   }

	  }
	  num2 = num2 + endDay;
	  total = sum - num1 + num2;
	  System.out.print(total);
	  System.out.print("\n");
	  return 0;
	}



}

