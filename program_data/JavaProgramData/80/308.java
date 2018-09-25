package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int startYear;
		int startMonth;
		int startDay;
		int endYear;
		int endMonth;
		int endDay;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			startYear = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			startMonth = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			startDay = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			endYear = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			endMonth = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			endDay = Integer.parseInt(tempVar6);
		}
		int i;
		int sum = 0;
		int sum1 = 0;
		int sum2 = 0;
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
		 if ((startYear % 4 == 0 && startYear % 100 != 0) || (startYear % 400 == 0))
		 {

			 for (i = 0;i < (startMonth - 1);i++)
			 {
				 sum1 = sum1 + b[i];
			 }
		 }
		 else
		 {

					 for (i = 0;i < (startMonth - 1);i++)
					 {
						 sum1 = sum1 + a[i];
					 }
		 }
		 if ((endYear % 4 == 0 && endYear % 100 != 0) || (endYear % 400 == 0))
		 {

				  for (i = 0;i < (endMonth - 1);i++)
				  {
					  sum2 = sum2 + b[i];
				  }
		 }
		 else
		 {

					 for (i = 0;i < (endMonth - 1);i++)
					 {
						 sum2 = sum2 + a[i];
					 }
		 }
		 int m;
		 m = sum - sum1 - startDay + sum2 + endDay;
		 System.out.printf("%d\n",m);
	}

}

