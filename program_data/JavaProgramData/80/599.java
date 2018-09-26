package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int y2;
		int m2;
		int d2;
		int max;
		int t = 0;
		int[] day = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			d = Integer.parseInt(tempVar3);
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
		max = day[m];
		if (m == 2 && ((y % 4 == 0 && y % 100 != 0) || (y % 100 == 0 && y % 400 == 0)))
		{
			max++;
		}
		while (y < y2 || m < m2 || d < d2)
		{
			t++;
			d++;
			if (d > max)
			{
				d = 1;
				m++;
			}
			if (m > 12)
			{
				m = 1;
				y++;
			}
			max = day[m];
			if (m == 2 && ((y % 4 == 0 && y % 100 != 0) || (y % 100 == 0 && y % 400 == 0)))
			{
				max++;
			}
		}
		System.out.printf("%d",t);
		return 0;
	}

}

