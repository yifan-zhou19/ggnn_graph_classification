package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] M = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
		int r1;
		int r2;
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
		r1 = 0;
		for (int year = 1; year < y1; year++)
		{
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400) == 0)
			{
				r1 += 366;
			}
			else
			{
				r1 += 365;
			}
		}
		for (int month = 1; month < m1; month++)
		{
			r1 += M[month];
		}
		r1 += d1 - 1;
		if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400) == 0)
		{
			if (m1 > 2)
			{
				r1++;
			}
		}
		r2 = 0;
		for (int year = 1; year < y2; year++)
		{
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400) == 0)
			{
				r2 += 366;
			}
			else
			{
				r2 += 365;
			}
		}
		for (int month = 1; month < m2; month++)
		{
			r2 += M[month];
		}
		r2 += d2 - 1;
		if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400) == 0)
		{
			if (m2 > 2)
			{
				r2++;
			}
		}
		System.out.printf("%d", r2 - r1);
		return 0;
	}

	// 1 1 1??0?
}

