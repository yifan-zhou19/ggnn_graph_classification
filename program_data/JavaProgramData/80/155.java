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
		int x;
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
		x = (ey - sy + 1) * 365 - (sm - 1) * 31 - (12 - em + 1) * 31 + ed - sd;

		for (i = sy;i <= ey;i++)
		{
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
			{
				x = x + 1;
			}
		}

		for (i = 1;i < sm;i++)
		{
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				x = x + 1;
			}
		else if (i == 2)

		{
			if (sy % 4 == 0 && i % 100 != 0 || i % 400 == 0)
			{
				x = x + 2;
			}
		else
		{
			x = x + 3;
		}
		}
		}

		for (i = em;i < 13;i++)
		{
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				x = x + 1;
			}
		else if (i == 2)
		{
			if (ey % 4 == 0 && ey % 100 != 0 || ey % 400 == 0)
			{
				x = x + 2;
			}
		else
		{
			x = x + 3;
		}
		}
		}
		System.out.printf("%d",x);
	}
}

