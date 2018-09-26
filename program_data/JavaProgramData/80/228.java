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
		int[] d = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int i;
		int m;
		int n = 0;
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

		for (i = sy;i <= ey;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				d[1] = 29;
			}
			else
			{
				d[1] = 28;
			}
			if (sy != ey)
			{
				if (i == sy)
				{
					for (m = sm;m <= 12;m++)
					{
						if (m == sm)
						{
							n = n + d[m - 1] - sd;
						}
						else
						{
							n = n + d[m - 1];
						}
					}
				}
				else if (i == ey)
				{
					for (m = 1;m <= em;m++)
					{
						if (m == em)
						{
							n = n + ed;
						}
						else
						{
							n = n + d[m - 1];
						}
					}
				}
				else
				{
					if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
					{
						n = n + 366;
					}
					else
					{
						n = n + 365;
					}
				}
			}
			else if (sy == ey)
			{
				if (sm == em)
				{
					n = ed - sd;
				}
				else if (sm != em)
				{
					for (m = sm;m <= em;m++)
					{
						if (m == sm)
						{
							n = n + d[m - 1] - sd;
						}
						else if (m == em)
						{
							n = n + ed;
						}
						else
						{
							n = n + d[m - 1];
						}
					}
				}
			}
		}
		System.out.printf("%d\n",n);
	}
}

