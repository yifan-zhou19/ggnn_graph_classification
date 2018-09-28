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


		public static int DiJiTian(year UnnamedParameter, month UnnamedParameter2, day UnnamedParameter3)
		{
			int result = 0;
			int i;
			for (i = 1;i < month;i++)
			{
					if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
					{
					  result += 31;
					}
					else if (i == 4 || i == 6 || i == 9 || i == 11)
					{
					  result += 30;
					}
					else if (i == 2)
					{
						 if (isRunNian(year) != 0)
						 {
					  result += 29;
						 }
					   else
					   {
					   result += 28;
					   }
					}
			}
			result += day;
			return result;
		}
		 public static int Main()
		 {
		 int i;
		 int year;
		 int month;
		 int day;
		 int year1;
		 int total;
		 int days2 = 0;
		 int days3;
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
		 year1 = (year % 400 == 0?400:year % 400);
		 for (i = 1;i < year1;i++)
		 {
		   if (isRunNian(i) != 0)
		   {
			 days2 += 366;
		   }
			 else
			 {
			  days2 += 365;
			 }
		 }
		   days3 = DiJiTian(year, month, day);
		   total = days2 + days3;
		   if (total % 7 == 0)
		   {
			System.out.print("Sun.");
		   }
		  if (total % 7 == 1)
		  {
			System.out.print("Mon.");
		  }
		  if (total % 7 == 2)
		  {
			System.out.print("Tue.");
		  }
		  if (total % 7 == 3)
		  {
			System.out.print("Wen.");
		  }
		  if (total % 7 == 4)
		  {
			System.out.print("Thu.");
		  }
		  if (total % 7 == 5)
		  {
			System.out.print("Fri.");
		  }
		  if (total % 7 == 6)
		  {
			System.out.print("Sat.");
		  }

		  return 0;
		 }
}

