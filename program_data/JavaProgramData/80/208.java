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
		int days;
		int x;
		int y;
		int[] a = new int[13];
		days = x = y = 0;
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
		a[1] = a[3] = a[5] = a[7] = a[8] = a[10] = a[12] = 31;
		a[4] = a[6] = a[9] = a[11] = 30;
		if ((sy % 4 == 0 && sy % 100 != 0) || (sy % 400 == 0))
		{
			a[2] = 29;
		}
		else
		{
			a[2] = 28;
		}
		for (i = 1;i < sm;i++)
		{
			   x += a[i];
		}
		x += sd;
		if ((ey % 4 == 0 && ey % 100 != 0) || (ey % 400 == 0))
		{
			a[2] = 29;
		}
		else
		{
			a[2] = 28;
		}
		for (i = 1;i < em;i++)
		{
			   y += a[i];
		}
		y += ed;
		for (i = sy;i < ey;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
					days += 366;
			}
			else
			{
				days += 365;
			}
		}
		days = days + y - x;
		System.out.printf("%d",days);
	}
}

