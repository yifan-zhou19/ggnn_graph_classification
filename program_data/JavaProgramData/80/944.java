package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int a;
		int b;
		int c;
		int d;
		int e;
		int f;
		int days;
		int i;
		days = 0;
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
		for (i = a;i < d;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				days = days + 366;
			}
			else
			{
				days = days + 365;
			}
		}
		if (b < e)
		{
			for (i = b;i < e;i++)
			{
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
				{
					days = days + 31;
				}
				else if (i == 4 || i == 6 || i == 9 || i == 11)
				{
					days = days + 30;
				}
				else if ((d % 4 == 0 && d % 100 != 0) || (d % 400 == 0))
				{
					days = days + 29;
				}
				else
				{
					days = days + 28;
				}
			}
		}
		if (b > e)
		{
			for (i = e;i < b;i++)
			{
				if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
				{
					days = days - 31;
				}
				else if (i == 4 || i == 6 || i == 9 || i == 11)
				{
					days = days - 30;
				}
				else if ((d % 4 == 0 && d % 100 != 0) || (d % 400 == 0))
				{
					days = days - 29;
				}
				else
				{
					days = days - 28;
				}
			}
		}
		days = days + f - c;
		System.out.printf("%d",days);
		return 0;
	}
}

