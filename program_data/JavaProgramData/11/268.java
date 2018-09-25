package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int i;
		int j;
		int sum;
		int[] a = {0, 31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		int[] b = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30};
		for (j = 0;j < 5;j++)
		{
		sum = 0;
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
		if (year % 4 == 0)
		{
			if (year % 100 == 0)
			{
				if (year % 400 == 0)
				{
					for (i = 0;i < month;i++)
					{
					   sum = sum + a[i];
					}
					sum = sum + day;
				}
				else
				{
					for (i = 0;i < month;i++)
					{
					   sum = sum + b[i];
					}
					sum = sum + day;
				}
			}
			else
			{
			   for (i = 0;i < month;i++)
			   {
					   sum = sum + a[i];
			   }
					sum = sum + day;
			}
		}
		else
		{
				for (i = 0;i < month;i++)
				{
					sum = sum + b[i];
				}
				sum = sum + day;
		}
		System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

