package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int Year;
		int Month;
		int Date;
		int month;
		int i;
		int sum1 = 0;
		int sum2 = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			Year = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			Month = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			Date = Integer.parseInt(tempVar3);
		}
		month = Month - 1;
		if (Year % 4 == 0 && Year % 400 == 0)
		{
		   int[] mday = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		   for (i = 0;i < month;i++)
		   {
			   sum1 = sum1 + mday[i];
		   }
		}
		else
		{
			int[] mday = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
			for (i = 0;i < month;i++)
			{
			   sum1 = sum1 + mday[i];
			}
		}
		sum2 = sum1 + Date;
		System.out.printf("\n%d",sum2);
		return 0;
	}


}

