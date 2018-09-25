package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int sum = 0;
		int m;
		int n;
		int y1;
		int m1;
		int d1;
		int y2;
		int m2;
		int d2;
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
		if (y1 != y2)
		{
			if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
			{
				a[2] = 29;
				m = d1;
				for (int i = 1;i < m1;i++)
				{
					m += a[i];
				}
				sum += 366 - m;
			}
			else
			{
				a[2] = 28;
				m = d1;
				for (int i = 1;i < m1;i++)
				{
					m += a[i];
				}
				sum += 365 - m;
			}
			y1++;
			if ((y2 % 4 == 0 && y2 % 100 != 0) || (y2 % 400 == 0))
			{
				a[2] = 29;
				m = d2;
				for (int i = 1;i < m2;i++)
				{
					m += a[i];
				}
				sum += m;
			}
			else
			{
				a[2] = 28;
				m = d2;
				for (int i = 1;i < m2;i++)
				{
					m += a[i];
				}
				sum += m;
			}
		}
		else
		{
			if ((y1 % 4 == 0 && y1 % 100 != 0) || (y1 % 400 == 0))
			{
				a[2] = 29;
				m = d1;
				for (int i = 1;i < m1;i++)
				{
					m += a[i];
				}
				n = d2;
				for (int i = 1;i < m2;i++)
				{
					n += a[i];
				}
				sum = n - m;
			}
			else
			{
				a[2] = 28;
				m = d1;
				for (int i = 1;i < m1;i++)
				{
					m += a[i];
				}
				n = d2;
				for (int i = 1;i < m2;i++)
				{
					n += a[i];
				}
				sum = n - m;
			}
		}
		for (;y1 < y2;y1++)
		{
			if (((y1 % 4) == 0 && (y1 % 100) != 0) || ((y1 % 400) == 0))
			{
				sum += 366;
			}
			else
			{
				sum += 365;
			}
		}
		System.out.printf("%d\n",sum);
	}
}

