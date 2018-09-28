package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int d = 0;
		int m = 0;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead("\n");
		if (tempVar4 != null)
		{
			y2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			d2 = Integer.parseInt(tempVar6);
		}
		if (y1 == y2)
		{
			if (m1 == m2)
			{
			d = d2 - d1;
			}
			else
			{
			for (i = m1;i < m2;i++)
			{
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
				{
				d += 31;
				}
				else
				{
				if (i == 4 || i == 6 || i == 9 || i == 11)
				{
				d += 30;
				}
				else
				{
				if (((y1 % 4 == 0 && y1 % 100 != 0) || y1 % 400 == 0) && i == 2)
				{
				d += 29;
				}
				else
				{
				d += 28;
				}
				}
				}
			}
			d += d2 - d1;
			}
		}
		else
		{
			for (i = m1;i < m2 + 12;i++)
			{
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12 || i == 13 || i == 15 || i == 17 || i == 19 || i == 20 || i == 22)
				{
				d += 31;
				}
				else
				{
				if (i == 4 || i == 6 || i == 9 || i == 11 || i == 16 || i == 18 || i == 21 || i == 23)
				{
				d += 30;
				}
				else
				{
				if (((y1 % 4 == 0 && y1 % 100 != 0) || y1 % 400 == 0) && (i == 2 || i == 14))
				{
				d += 29;
				}
				else
				{
				d += 28;
				}
				}
				}
			}
			d += d2 - d1;
			if (y2 - y1 >= 2)
			{
				for (i = y1;i < y2 - 1;i++)
				{
					if ((i % 4 == 0 && i % 100 != 0) || i % 400 == 0)
					{
					d += 366;
					}
					else
					{
					d += 365;
					}
				}
			}
		}
		if (d > 366)
		{
		d++;
		}
		System.out.printf("%d",d);
		return 0;
	}
}

