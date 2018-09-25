package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int f = new int(int y,int m,int d);
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int s1;
		int s2;
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
		s1 = f(y1, m1, d1);
		s2 = f(y2, m2, d2);
		System.out.printf("%d",s2 - s1);
	}
	public static int f(int y,int m,int d)
	{
		int i;
		int s = 0;
		for (i = 1;i < y;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
		s = s + 366;
			}
		else
		{
			s = s + 365;
		}
		}
		for (i = 1;i < m;i++)
		{
			if (i == 1 || i == 3 || i == 5 || i == 7 || i == 8 || i == 10 || i == 12)
			{
		s = s + 31;
			}
		else
		{
			if (i == 2)
			{
			if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
			{
		s = s + 29;
			}
		else
		{
			s = s + 28;
		}
			}
		else
		{
			s = s + 30;
		}
		}
		}
		s = s + d;
		return (s);
	}
}

