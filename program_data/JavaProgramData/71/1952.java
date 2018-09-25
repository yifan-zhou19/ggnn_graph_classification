package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int[] year = new int[200];
		int[] month1 = new int[200];
		int[] month2 = new int[200];
		int result1;
		int result2;
		int day;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year[k] = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				month1[k] = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				month2[k] = Integer.parseInt(tempVar4);
			}
		}
		for (k = 0;k < n;k++)
		{
			result1 = 0;
			result2 = 0;
		for (i = 1; i < month1[k]; i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				result1 += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				result1 += 30;
			}
			else if (i == 2)
			{
				if (year[k] % 400 == 0 || (year[k] % 4 == 0 && year[k] % 100 != 0))
				{
					result1 += 29;
				}
				else
				{
					result1 += 28;
				}
			}
		}
		for (i = 1; i < month2[k]; i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				result2 += 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				result2 += 30;
			}
			else if (i == 2)
			{
				if (year[k] % 400 == 0 || (year[k] % 4 == 0 && year[k] % 100 != 0))
				{
					result2 += 29;
				}
				else
				{
					result2 += 28;
				}
			}
		}
		day = result1 - result2;
	if (day < 0)
	{
			day = 0 - day;
	}
	if (day % 7 == 0)
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

