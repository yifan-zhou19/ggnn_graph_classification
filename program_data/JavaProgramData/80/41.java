package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		int i;
		int j;
		int k;
		int sum;
		int[] a = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] b = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sy = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			sm = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			sd = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			ey = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			em = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			ed = Integer.parseInt(tempVar6);
		}
		sum = 0;
		if (sy != ey)
		{
			if (sy + 1 <= ey - 1)
			{
				for (i = sy + 1;i <= ey - 1;i++)
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
			}

			if ((sy % 4 == 0 && sy % 100 != 0) || (sy % 400 == 0))
			{
				if (sm < 12)
				{
					for (j = sm + 1;j <= 12;j++)
					{
						sum = sum + a[j - 1];
					}
				}
				sum = sum + a[sm - 1] - sd + 1;
			}
			else
			{
				if (sm < 12)
				{
					for (j = sm + 1;j <= 12;j++)
					{
						sum = sum + b[j - 1];
					}
				}
				sum = sum + b[sm - 1] - sd + 1;
			}

			if ((ey % 4 == 0 && ey % 100 != 0) || (ey % 400 == 0))
			{
				if (em > 1)
				{
					for (j = 1;j <= em - 1;j++)
					{
						sum = sum + a[j - 1];
					}
				}
				sum = sum + ed;
			}
			else
			{
				if (em > 1)
				{
					for (j = 1;j <= em - 1;j++)
					{
						sum = sum + b[j - 1];
					}
				}
				sum = sum + ed;
			}
		}
		else
		{
			if ((sy % 4 == 0 && sy % 100 != 0) || (sy % 400 == 0))
			{
				if (sm != em)
				{
					if (sm + 1 <= em - 1)
					{
						for (k = sm + 1;k <= em - 1;k++)
						{
							sum = sum + a[k - 1];
						}
					}
					sum = sum + a[sm - 1] - sd + 1;
					sum = sum + ed;
				}
				else
				{
					sum = sum + ed - sd + 1;
				}
			}
			else
			{
				if (sm != em)
				{
					if (sm + 1 <= em - 1)
					{
						for (k = sm + 1;k <= em - 1;k++)
						{
							sum = sum + b[k - 1];
						}
					}
					sum = sum + b[sm - 1] - sd + 1;
					sum = sum + ed;
				}
				else
				{
					sum = sum + ed - sd + 1;
				}
			}
		}
		System.out.printf("%d\n",sum - 1);
	}
}

