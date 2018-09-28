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
		int s;
		int i;
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
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
		String tempVar4 = ConsoleInput.scanfRead();
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
		if ((y1 == y2) && (m1 == m2))
		{
			System.out.printf("%d",d2 - d1);
		}
		else
		{
		s = 0;
		s = s + (y2 - y1 - 1) * 365;
		for (i = m1 + 1;i <= 12;i++)
		{
			s = s + a[i];
		}
		for (i = 1;i < m2;i++)
		{
			s = s + a[i];
		}
		s = s + d2;
		s = s + a[m1] - d1;
		for (i = y1 + 1;i < y2;i++)
		{
			if (((i % 4 == 0) && (i % 100 != 0)) || (i % 400 == 0))
			{
				s = s + 1;
			}
		}
		if (((y1 % 4 == 0) && (y1 % 100 != 0)) || (y1 % 400 == 0))
		{
			if ((m1 <= 2) && (m2>2) || (y2 > y1))
			{
				s = s + 1;
			}
		}
		if (((y2 % 4 == 0) && (y2 % 100 != 0)) || (y2 % 400 == 0))
		{
			if ((m2 > 2) && ((y1 < y2) || (m1 < m2)))
			{
				s = s + 1;
			}
		}
		System.out.printf("%d",s);
		}
		return 0;
	}
}

