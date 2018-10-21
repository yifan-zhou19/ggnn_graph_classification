package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int i;
		int a1 = 0;
		int a2 = 0;
		int b1 = 0;
		int b2 = 0;
		int n1;
		int n2;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			d2 = Integer.parseInt(tempVar6);
		}
		for (i = 1;i < y1;i++)
		{
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
			{
				a1 = a1 + 366;
			}
			else
			{
				a1 = a1 + 365;
			}
		}
		for (i = 1;i < m1;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
			{
				b1 = b1 + 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				b1 = b1 + 30;
			}
			else if (y1 % 4 == 0 && y1 % 100 != 0 || y1 % 400 == 0)
			{
				b1 = b1 + 29;
			}
			else
			{
				b1 = b1 + 28;
			}
		}
		for (i = 1;i < y2;i++)
		{
			if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0)
			{
				a2 = a2 + 366;
			}
			else
			{
				a2 = a2 + 365;
			}
		}

		for (i = 1;i < m2;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
			{
				b2 = b2 + 31;
			}
			else if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				b2 = b2 + 30;
			}
			else if (y2 % 4 == 0 && y2 % 100 != 0 || y2 % 400 == 0)
			{
				b2 = b2 + 29;
			}
			else
			{
				b2 = b2 + 28;
			}
		}
		n1 = a1 + b1 + d1;
		n2 = a2 + b2 + d2;
		n = n2 - n1;
		System.out.printf("%ld\n",n);
	}
}

