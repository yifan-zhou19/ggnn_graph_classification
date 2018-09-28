package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int year;
	 int month;
	 int day;
	 int a = 0;
	 int days = 0;
	 int i;
	 int j;
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
		if (year > 2800)
		{
			year = year - (year / 2800) * 2800;
		}
	 for (j = 1;j < year;j++)
	 {
	  if ((j % 4 == 0 && j % 100 != 0) || j % 400 == 0)
	  {
	   a++;
	  }
	 }
		days = a * 366 + (year - a - 1) * 365;
		for (i = 1;i < month;i++)
		{
		   if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
		   {
			days += 31;
		   }
		   if (i == 4 || i == 6 || i == 9 || i == 11)
		   {
			days += 30;
		   }
		   if (i == 2)
		   {
			  if (year % 400 == 0 || (year % 100 != 0 && year % 4 == 0))
			  {
			   days += 29;
			  }
			  else
			  {
			   days += 28;
			  }
		   }
		}
		days += day;
		//printf("%d\n",days);
		if (days % 7 == 1)
		{
		 System.out.print("Mon.");
		}
		if (days % 7 == 2)
		{
		 System.out.print("Tue.");
		}
		if (days % 7 == 3)
		{
		 System.out.print("Wed.");
		}
		   if (days % 7 == 4)
		   {
		 System.out.print("Thu.");
		   }
		   if (days % 7 == 5)
		   {
		 System.out.print("Fri.");
		   }
		   if (days % 7 == 6)
		   {
		 System.out.print("Sat.");
		   }
		if (days % 7 == 0)
		{
		 System.out.print("Sun.");
		}
	 return 0;
	}

}

