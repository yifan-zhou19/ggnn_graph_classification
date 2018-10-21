package <missing>;

public class GlobalMembers
{
	public static int[] NO = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	public static int[] SP = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

	public static int boolean_Renamed(int year)
	{
		if ((year % 4 == 0) || (year % 400 == 0))
		{
			return 1;
		}
		   else
		   {
			   return 0;
		   }
	}
	public static void Main()
	{
		int i;
		int sum;
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			d2 = Integer.parseInt(tempVar6);
		}
		sum = 0;
		for (i = 1;i <= m1 - 1;i++)
		{
			if (boolean_Renamed(y1) == 1)
			{
			  sum = sum - NO[i];
			}
			else
			{
				sum = sum - SP[i];
			}
		}
		sum = sum - d1;
		for (i = 1;i <= m2 - 1;i++)
		{
		  if (boolean_Renamed(y1) == 1)
		  {
			  sum = sum + NO[i];
		  }
			else
			{
				sum = sum + SP[i];
			}
		}
		sum = sum + d2;
		for (i = y1;i <= y2 - 1;i++)
		{
			if (boolean_Renamed(i) == 1)
			{
				sum = sum + 366;
			}
			else
			{
				sum = sum + 365;
			}
		}
		System.out.printf("%ld\n",sum);
	}
}

