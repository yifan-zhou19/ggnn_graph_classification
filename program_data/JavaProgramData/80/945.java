package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int startYear;
		int startMonth;
		int startDay;
		int endYear;
		int endMonth;
		int endDay;
		int i;
		int s = 0;
		int a = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		startYear = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead(" ");
	if (tempVar2 != null)
	{
		startMonth = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		startDay = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		endYear = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead(" ");
	if (tempVar5 != null)
	{
		endMonth = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead(" ");
	if (tempVar6 != null)
	{
		endDay = Integer.parseInt(tempVar6);
	}
	for (i = startYear + 1;i < endYear;i++)
	{
	 if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
	 {
	  s = s + 1;
	 }
	 else
	 {
	  s = s + 0;
	 }
	}
	s = s + (endYear - startYear - 1) * 365;
	if (endMonth > 2 && endMonth <= 8)
	{
	 for (i = 1;i < endMonth;i++)
	 {
	  if (i % 2 == 1)
	  {
	   s = s + 31;
	  }
	  else if (i % 2 == 0 && i != 2)
	  {
	   s = s + 30;
	  }
	  else if (i == 2)
	  {
	   if ((endYear % 4 == 0 && endYear % 100 != 0) || (endYear % 400 == 0))
	   {
		 s = s + 29;
	   }
	   else
	   {
		 s = s + 28;
	   }
	  }
	 }
	}
	else if (endMonth > 8)
	{
	 if ((endYear % 4 == 0 && endYear % 100 != 0) || (endYear % 400 == 0))
	 {
		 s = s + 29 + 4 * 31 + 2 * 30;
	 }
	 else
	 {
		 s = s + 28 + 4 * 31 + 2 * 30;
	 }
	 for (i = 8;i < endMonth;i++)
	 {
	  if (i % 2 == 1)
	  {
	   s = s + 30;
	  }
	  else if (i % 2 == 0 && i != 2)
	  {
	   s = s + 31;
	  }
	 }
	}
	else if (endMonth == 1)
	{
	 s = s + 0;
	}
	else if (endMonth == 2)
	{
	 s = s + 31;
	}
	s = s + endDay;
	if (startMonth > 2 && startMonth <= 8)
	{
	 for (i = 1;i < startMonth;i++)
	 {
	  if (i % 2 == 1)
	  {
	   a = a + 31;
	  }
	  else if (i % 2 == 0 && i != 2)
	  {
	   a = a + 30;
	  }
	  else if (i == 2)
	  {
	   if ((startYear % 4 == 0 && startYear % 100 != 0) || (startYear % 400 == 0))
	   {
		 a = a + 29;
	   }
	   else
	   {
		 a = a + 28;
	   }
	  }
	 }
	}
	else if (startMonth > 8)
	{
	 if ((endYear % 4 == 0 && endYear % 100 != 0) || (endYear % 400 == 0))
	 {
		 a = a + 29 + 4 * 31 + 2 * 30;
	 }
	 else
	 {
		 a = a + 28 + 4 * 31 + 2 * 30;
	 }
	 for (i = 8;i < startMonth;i++)
	 {
	  if (i % 2 == 1)
	  {
	   a = a + 30;
	  }
	  else if (i % 2 == 0 && i != 2)
	  {
	   a = a + 31;
	  }
	 }
	}
	else if (startMonth == 1)
	{
	 a = a + 0;
	}
	else if (startMonth == 2)
	{
	 a = a + 31;
	}
	a = a + startDay;
	if ((startYear % 4 == 0 && startYear % 100 != 0) || (startYear % 400 == 0))
	{
	 s = s + 366 - a;
	}
	else
	{
	 s = s + 365 - a;
	}
	System.out.printf("%d",s);
	return 0;
	}


}

