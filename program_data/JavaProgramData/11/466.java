package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int year;
		int month;
		int day;
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
	 int sum = 0;
	 if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
	 {
		 int[] mon = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	  if (month == 1)
	  {
		  sum = day;
	  }
	  else if (month == 2)
	  {
		  sum = 31 + day;
	  }
	  else
	  {
		  for (int i = 0;i <= (month - 2);i++)
		  {
		  sum += mon[i];
		  }
	   sum = sum + day;
	  }
	  System.out.printf("%d",sum);
	 }
	 else if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0)
	 {
		  if (month == 1)
		  {
	   sum = day;
		  }
	   else if (month == 2)
	   {
		   sum = 31 + day;
	   }
	   else
	   {
		   int[] mon = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	   for (int i = 0;i <= (month - 2);i++)
	   {
		   sum += mon[i];
	   }
		sum = sum + day;
	   }
	   System.out.printf("%d",sum);
	 }

	}


}

