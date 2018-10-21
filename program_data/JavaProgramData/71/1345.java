package <missing>;

public class GlobalMembers
{
	public static int DiJiTian(int year, int month)
	{
		int result = 0;
		int day = 1;
		for (int i = 1; i < month; i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				result += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				result += 30;
			}
			else if (i == 2)
			{
				if (isRunNian(year) != 0)
				{
					result += 29;
				}
				else
				{
					result += 28;
				}
			}
		}
		result += day;
		return result;
	}
	public static int isRunNian(int year)
	{
		int result;
		if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0))
		{
			result = 1;
		}
		else
		{
			result = 0;
		}
		  return result;
	}

	public static int Main()
	{
		int n;
		int i;
		int[] year = new int[200];
		int[] mon1 = new int[200];
		int[] mon2 = new int[200];
		int[] a = new int[200];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year[i] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				mon1[i] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				mon2[i] = Integer.parseInt(tempVar4);
			}
		}

		for (i = 0;i < n;i++)
		{
			a[i] = DiJiTian(year[i], mon1[i]) - DiJiTian(year[i], mon2[i]);
			a[i] = (a[i] >= 0?a[i]:(0 - a[i]));
		}

		for (i = 0;i < n;i++)
		{
			if (a[i] % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}

		return 0;
	}

}

