package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

		int startyear;
		int startmonth;
		int startday;
		int endyear;
		int endmonth;
		int endday;
		int i;
		int sum;
		int[] a = new int[13];
		sum = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			startyear = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			startmonth = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			startday = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead("\n");
		if (tempVar4 != null)
		{
			endyear = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			endmonth = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			endday = Integer.parseInt(tempVar6);
		}
		for (i = 1;i <= 12;i++) //??
		{

			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				a[i] = 31;
			}
			else if (i == 2)
			{
				a[i] = 28;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				a[i] = 30;
			}
		}

		 if (startyear == endyear)
		 {
			 while ((startmonth < endmonth) || ((startmonth == endmonth) && (startday < endday)))
			 {
				  if ((startyear % 4 == 0 && startyear % 100 != 0) || (startyear % 400 == 0))
				  {
					   a[2]++;
				  }
				  startday++;
				  sum = sum + 1;
				  if (endday > a[startmonth])
				  {
					  startday = 0; //not 1
					  startmonth = startmonth + 1;
				  }
			 }
		 }
				  else
				  {
					  for (i = startyear + 1;i <= endyear - 1;i++)
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
						   sum = sum + a[startmonth] - startday; //the first month
						   for (i = startmonth + 1;i <= 12;i++)
						   {
							   sum = sum + a[i];
						   }
						   if ((startmonth == 1) && ((startyear % 4 == 0 && startyear % 100 != 0) || (startyear % 400 == 0)))
						   {
								sum++;
						   }
						   for (i = 1;i <= endmonth - 1;i++)
						   {
							   sum = sum + a[i];
						   }
						   if ((endmonth > 2) && ((endyear % 4 == 0 && endyear % 100 != 0) || (endyear % 400 == 0)))
						   {
							   sum++;
						   }
						   sum += endday;
				  }
	   System.out.printf("%d",sum);
	   return 0;
	}

}

