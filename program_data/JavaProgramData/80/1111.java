package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int j;
		int k;
		int sum;
		int startyear;
		int startmonth;
		int startday;
		int endyear;
		int endmonth;
		int endday;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			startyear = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			startmonth = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			startday = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			endyear = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			endmonth = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			endday = Integer.parseInt(tempVar6);
		}
		sum = 0;
		if ((startyear % 4 == 0 && startyear % 100 != 0) || (startyear % 400 == 0))
		{
			 month[1] = 29;
		}
		for (i = startyear + 1;i < endyear;i++)
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
		if (startyear == endyear)
		{
			 if (startmonth == endmonth)
			 {
				  sum = endday - startday;
			 }
			 else
			 {
				  for (i = startday + 1;i <= month[startmonth - 1];i++)
				  {
					  sum = sum + 1;
				  }
				  for (i = startmonth + 1;i < endmonth;i++)
				  {
					  sum = sum + month[i - 1];
				  }
				  for (i = 1;i <= endday;i++)
				  {
					  sum = sum + 1;
				  }
			 }
		}
		else
		{
			 for (i = startday + 1;i <= month[startmonth - 1];i++)
			 {
					  sum = sum + 1;
			 }
			 for (i = startmonth + 1;i <= 12;i++)
			 {
					  sum = sum + month[i - 1];
			 }
			 if ((endyear % 4 == 0 && endyear % 100 != 0) || (endyear % 400 == 0))
			 {
				 month[1] = 29;
			 }
			 else
			 {
				 month[i] = 28;
			 }
			 for (i = 1;i < endmonth;i++)
			 {
				 sum = sum + month[i - 1];
			 }
			 for (i = 1;i <= endday;i++)
			 {
				 sum = sum + 1;
			 }
		}
		System.out.printf("%d",sum);
		return 0;
	}

}

