package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		int y1;
		int y2;
		int m1;
		int m2;
		int d1;
		int d2;
		int i;
		int m = 0;
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
		if (y1 < y2)
		{
			for (i = m1 + 1;i <= 12;i++)
			{
				m = m + a[i];
			}
			m = m + a[m1] - d1;
			if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
			{
				if (m1 <= 2)
				{
					m = m + 1;
				}
			}

			for (i = 0;i <= m2 - 1;i++)
			{
				m = m + a[i];
			}
			m = m + d2;
			if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
			{
				if (m2 > 2)
				{
					m = m + 1;
				}
			}

			for (i = y1 + 1;i <= y2 - 1;i++)
			{
				if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
				{
					m = m + 366;
				}
				else
				{
					m = m + 365;
				}
			}

		}
		else
		{
			if (m1 < m2)
			{
				for (i = m1 + 1;i <= m2;i++)
				{
					m = m + a[i];
				}
				m = a[m1] - d1 - (a[m2] - d2);
				if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
				{
					if (m1 <= 2)
					{
						m = m + 1;
					}
				}
			}
			else
			{
				m = d2 - d1;
			}
		}


		 System.out.printf("%d",m);




		return 0;
	}
}

