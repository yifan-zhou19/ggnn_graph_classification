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
		int d = 0;
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
		if (m1 >= 3)
		{
			y1 = y1 + 1;
		}
		if (m2 >= 3)
		{
			y2 = y2 + 1;
		}
		while (y1 < y2)
		{
			if (y1 % 4 == 0 && y1 % 100 != 0 || y1 % 400 == 0)
			{
				d = d + 366;
				y1++;
			}
			else
			{
				d = d + 365;
				y1++;
			}
		}
		if (m1 == 1)
		{
			m1 = 13;
		}
		if (m1 == 2)
		{
			m1 = 14;
		}
		if (m2 == 1)
		{
			m2 = 13;
		}
		if (m2 == 2)
		{
			m2 = 14;
		}

		while (m1 < m2)
		{
			if (m1 == 3 || m1 == 5 || m1 == 7 || m1 == 8 || m1 == 10 || m1 == 12 || m1 == 13)
			{
				d = d + 31;
				m1++;
			}
			if (m1 == 4 || m1 == 6 || m1 == 9 || m1 == 11)
			{
				d = d + 30;
				m1++;
			}
		}
			while (m1 > m2)
			{
				if (m2 == 3 || m2 == 5 || m2 == 7 || m2 == 8 || m2 == 10 || m2 == 12 || m2 == 13)
				{
				d = d - 31;
				m2++;
				}
			if (m2 == 4 || m2 == 6 || m2 == 9 || m2 == 11)
			{
				d = d - 30;
				m2++;
			}
			}
				d = d + d2 - d1;
				System.out.printf("%d",d);
	}



}

