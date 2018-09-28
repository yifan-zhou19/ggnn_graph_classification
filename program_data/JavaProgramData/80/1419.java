package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sy;
		int sm;
		int sd;
		int ey;
		int em;
		int ed;
		int i;
		int x = 0;
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
		for (i = sy;i < ey;i++)
		{
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
			{
				x = x + 366;
			}
			else
			{
				x = x + 365;
			}
		}
		for (i = 1;i < sm;i++)
		{
			if ((sy % 4 == 0 && sy % 100 != 0 || sy % 400 == 0) && i == 2)
			{
				x = x - 29;
			}
			else if (i == 2)
			{
				x = x - 28;
			}
			else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				x = x - 31;
			}
			else
			{
				x = x - 30;
			}
		}
		for (i = 1;i < em;i++)
		{
			if ((ey % 4 == 0 && ey % 100 != 0 || ey % 400 == 0) && i == 2)
			{
				x = x + 29;
			}
			else if (i == 2)
			{
				x = x + 28;
			}
			else if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
				x = x + 31;
			}
			else
			{
				x = x + 30;
			}
		}
		x = x + ed - sd;
		System.out.printf("%d\n",x);
		return 0;
	}

}

