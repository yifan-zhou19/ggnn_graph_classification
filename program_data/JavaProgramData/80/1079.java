package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int f = int y;
		int g = new int(int y,int m,int d);
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int x = 0;
		int i;
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
		x = g(y2, m2, d2) - g(y1, m1, d1);
		if (y1 != y2)
		{
			for (i = y1;i <= y2 - 1;i++)
			{
			 x += (365 + f(i));
			}
		}
		System.out.printf("%d",x);
	}
	public static int f(int y)
	{
		int x;
	x = ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0) == 1) ? 1:0;
	if (x == 1)
	{
		return 1;
	}
	if (x == 0)
	{
		return 0;
	}
	}
	public static int g(int y,int m,int d)
	{
		int t = 0;
		int j;
		int[] mon = new int[13];
		mon[0] = 0;
		mon[1] = mon[3] = mon[5] = mon[7] = mon[8] = mon[10] = mon[12] = 31;
		mon[4] = mon[6] = mon[9] = mon[11] = 30;
		mon[2] = 28 + f(y);
		for (j = 1;j <= m;j++)
		{
			t += mon[j - 1];
		}
		t += d;
		return t;
	}

}

