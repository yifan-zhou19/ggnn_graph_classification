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
		int c1;
		int c2;
		int c;
		int i1;
		int i2;
		int y;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			y1 = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			d1 = Integer.parseInt(tempVar3);
		}
		String tempVar4 = ConsoleInput.scanfRead("\n");
		if (tempVar4 != null)
		{
			y2 = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead(" ");
		if (tempVar5 != null)
		{
			m2 = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead(" ");
		if (tempVar6 != null)
		{
			d2 = Integer.parseInt(tempVar6);
		}
		int[] days1 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int[] days2 = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		if ((y1 % 4 == 0) && (y1 % 100 != 0) || (y1 % 400 == 0))
		{
			days1[2]++;
		}
		c1 = d1;
		for (i1 = 1;i1 < m1;i1++)
		{
			c1 += days1[i1];
		}
		if ((y2 % 4 == 0) && (y2 % 100 != 0) || (y2 % 400 == 0))
		{
			days2[2]++;
		}
		c2 = d2;
		for (i2 = 1;i2 < m2;i2++)
		{
			c2 += days2[i2];
		}
		y = y1;
		c = 0;
		while (y < y2)
		{
			if ((y % 4 == 0) && (y % 100 != 0) || (y % 400 == 0))
			{
				c = c + 366;
			}
			else
			{
				c = c + 365;
			}
			y++;
		}
		c = c - c1 + c2;
		System.out.printf("%d",c);
		return 0;
	}

}

