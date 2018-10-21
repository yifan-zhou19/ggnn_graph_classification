package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] total1 = new int[200];
		int[] total2 = new int[200];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] year = new int[200];
		int[] mon1 = new int[200];
		int[] mon2 = new int[200];
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			(year[i]) = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			(mon1[i]) = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead(" ");
		if (tempVar4 != null)
		{
			(mon2[i]) = Integer.parseInt(tempVar4);
		}
		}
		for (i = 0;i < n;i++)
		{
	 total1[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
						 total2[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
		for (j = 1; j < mon1[i]; j++)
		{
			if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
			{
				total1[i] += 31;
			}
			else if (j == 4 || j == 6 || j == 9 || j == 11)
			{
				total1[i] += 30;
			}
			else if (j == 2)
			{
				if (year[i] % 400 == 0 || (year[i] % 4 == 0 && year[i] % 100 != 0))
				{
					total1[i] += 29;
				}
				else
				{
					total1[i] += 28;
				}
			}
		}
		total1[i] += 1;
		}

		for (i = 0;i < n;i++)
		{
		for (j = 1; j < mon2[i]; j++)
		{
			if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12)
			{
				total2[i] += 31;
			}
			else if (j == 4 || j == 6 || j == 9 || j == 11)
			{
				total2[i] += 30;
			}
			else if (j == 2)
			{
				if (year[i] % 400 == 0 || (year[i] % 4 == 0 && year[i] % 100 != 0))
				{
					total2[i] += 29;
				}
				else
				{
					total2[i] += 28;
				}
			}
		}
		total2[i] += 1;
		}
		for (i = 0;i < n;i++)
		{
		if ((total1[i] - total2[i]) % 7 == 0)
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

