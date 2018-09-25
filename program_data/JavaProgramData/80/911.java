package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int ans = 0;
		int p;
		int i;
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
		if (y2 - y1 == 0)
		{
			if (m2 - m1 == 0)
			{
				ans = d2 - d1;
			}
			else
			{
				if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
				{
					m[1] = 29;
				}
				for (i = m1;i < m2;i++)
				{
					ans += m[i - 1];
				}
				ans = ans = d1 + d2;
			}
		}
		else
		{
			for (i = y1;i < y2;i++)
			{
				if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
				{
					ans += 366;
				}
				else
				{
					ans += 365;
				}
			}
				if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
				{
					m[1] = 29;
				}
				for (p = 1;p < m1;p++)
				{
					ans -= m[p - 1];
				}
				ans -= d1;
				if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
				{
					m[1] = 29;
				}
				else
				{
					m[1] = 28;
				}
				for (p = 1;p < m2;p++)
				{
					ans += m[p - 1];
				}
				ans += d2;
		}
		System.out.printf("%d\n",ans);
		return 0;
	}



}

