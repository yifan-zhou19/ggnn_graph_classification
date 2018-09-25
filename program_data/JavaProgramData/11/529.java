package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int year;
		int month;
		int day;
		int n;
		int i;
		int t = 0;
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
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = 0;i < month;i++)
		{
			t = t + a[i];
		}
		if (month >= 3)
		{
			if (year % 4 == 0)
			{
				if (year % 100 == 0)
				{
					if (year % 400 == 0)
					{
						n = t + 1 + day;
					}
					else
					{
						n = t + day;
					}
				}
					else
					{
						n = t + 1 + day;
					}
			}
					else
					{
						n = t + day;
					}
		}
					else
					{
						n = t + day;
					}

		System.out.printf("%d",n);
		return 0;

	}
}

