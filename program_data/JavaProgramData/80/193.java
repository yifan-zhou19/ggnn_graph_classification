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
		int s1 = 0;
		int s2 = 0;
		int i;
		int t;
		int[] m = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
		if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
		{
			m[1] = 29;
		}
		for (i = 1;i < y1;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				s1 = s1 + 366;
			}
			else
			{
				s1 = s1 + 365;
			}
		}
		for (i = 1;i < m1;i++)
		{
			s1 = s1 + m[i - 1];
		}
		s1 = s1 + d1;
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
		if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
		{
			m[1] = 29;
		}
		else
		{
			m[1] = 28;
		}
		for (i = 1;i < y2;i++)
		{
			if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
			{
				s2 = s2 + 366;
			}
			else
			{
				s2 = s2 + 365;
			}
		}
		for (i = 1;i < m2;i++)
		{
			s2 = s2 + m[i - 1];
		}
		s2 = s2 + d2;
		t = s2 - s1;
		System.out.printf("%d",t);
		return 0;
	}
}

