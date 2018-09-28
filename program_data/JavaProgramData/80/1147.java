package <missing>;

public class GlobalMembers
{
	public static int[] r = new int[13];
	public static int[] p = new int[13];
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int g = 0;
		int i;
		r[1] = 31;
		r[2] = 29;
		r[3] = 31;
		r[4] = 30;
		r[5] = 31;
		r[6] = 30;
		r[7] = 31;
		r[8] = 31;
		r[9] = 30;
		r[10] = 31;
		r[11] = 30;
		r[12] = 31;
		p[1] = 31;
		p[2] = 28;
		p[3] = 31;
		p[4] = 30;
		p[5] = 31;
		p[6] = 30;
		p[7] = 31;
		p[8] = 31;
		p[9] = 30;
		p[10] = 31;
		p[11] = 30;
		p[12] = 31;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			b = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			c = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			d = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			e = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			f = Integer.parseInt(tempVar6);
		}
		if (a == d)
		{
			if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
			{
				if (b == e)
				{
					g = f - c;
				}
				else if (b != e)
				{
					if (e = 2)
					{
						g = 31 - c + f;
					}
					else if (e > 2)
					{
						for (i = b;i < e;i++)
						{
							g = g + r[i];
						}
						g = g - c + f;
					}
				}
			}
			else
			{
				if (b == e)
				{
					g = f - c;
				}
				else if (b != e)
				{
					if (e = 2)
					{
						g = 31 - c + f;
					}
					else
					{
						for (i = b;i < e;i++)
						{
							g = g + p[i];
						}
						g = g - c + f;
					}
				}
			}
		}
		else if (a != d)
		{
			for (i = a + 1;i < d;i++)
			{
				if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
				{
					g = g + 366;
				}
				else
				{
					g = g + 365;
				}
			}
			if ((a % 4 == 0 && a % 100 != 0) || (a % 400 == 0))
			{
				for (i = b + 1;i <= 12;i++)
				{
					g = g + r[i];
				}
				g = g + r[b] - c;
			}
			else
			{
				for (i = b + 1;i <= 12;i++)
				{
					g = g + p[i];
				}
				g = g + p[b] - c;
			}
			if ((d % 4 == 0 && d % 100 != 0) || (d % 400 == 0))
			{
				for (i = 1;i < e;i++)
				{
					g = g + r[i];
				}
				g = g + f;
			}
			else
			{
				for (i = 1;i < e;i++)
				{
					g = g + p[i];
				}
				g = g + f;
			}
		}
		System.out.printf("%d",g);
		return 0;
	}
}

