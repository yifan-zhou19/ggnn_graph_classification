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
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			sy = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sm = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sd = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			ey = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			em = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			ed = Integer.parseInt(tempVar6);
		}
		d = 0;
		for (;;)
		{
				if (sy == ey && sm == em && sd == ed)
				{
				break;
				}
			if (sm == 1 || sm == 3 || sm == 5 || sm == 7 || sm == 8 || sm == 10 || sm == 12)
			{
				if (sm == 12 && sd == 31)
				{
					sy++;
					sm = 1;
					sd = 1;
					d++;
					continue;
				}
				if (sd == 31)
				{
					sm++;
					sd = 1;
					d++;
					continue;
				}
				else
				{
					sd++;
					d++;
					continue;
				}

			}
			if (sm == 4 || sm == 6 || sm == 9 || sm == 11)
			{
				if (sd == 30)
				{
					sm++;
					sd = 1;
					d++;
					continue;
				}
				else
				{
					sd++;
					d++;
					continue;
				}
			}
			if (sm == 2)
			{
				if ((sy % 4 == 0 && sy % 100 != 0) || (sy % 400 == 0))
				{
					if (sd == 29)
					{
						sm++;
						sd = 1;
						d++;
						continue;
					}
					else
					{
						sd++;
						d++;
						 continue;
					}
				}
				else
				{
					if (sd == 28)
					{
						sm++;
						sd = 1;
						d++;
						continue;
					}
					else
					{
						sd++;
						d++;
						continue;
					}
				}
			}

		}
		System.out.printf("%d",d);
	}
}

