package <missing>;

public class GlobalMembers
{
	public static int day(int year,int month,int day)
	{
		int i;
		int k = day;
		for (i = 1;i < month;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10)
			{
				k = k + 31;
			}
			if (i == 2)
			{
				if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
				{
					k = k + 29;
				}
				else
				{
					k = k + 28;
				}
			}
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				k = k + 30;
			}
		}
		return k;
	}
	public static void Main()
	{
		int Y;
		int M;
		int D;
		int y;
		int m;
		int d;
		int a;
		int b;
		int c;
		int x = 0;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			Y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			M = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			D = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			y = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			m = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			d = Integer.parseInt(tempVar6);
		}
		if (Y > y || Y == y && M > m || Y == y && M == m && D > d)
		{
			a = Y;
			b = M;
			c = D;
			Y = y;
			M = m;
			D = d;
			y = a;
			m = b;
			d = c;
		}
		for (j = Y;j < y;j++)
		{
			if (j % 4 == 0 && j % 100 != 0 || j % 400 == 0)
			{
				x = x + 366;
			}
			else
			{
				x = x + 365;
			}
		}
		x = x + day(y, m, d) - day(Y, M, D);
		System.out.printf("%d\n",x);
	}





}

