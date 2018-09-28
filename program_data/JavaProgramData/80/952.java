package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m;
		int d;
		int c;
		int h;
		int l;
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
			c = Integer.parseInt(tempVar4);
		}
		String tempVar5 = ConsoleInput.scanfRead();
		if (tempVar5 != null)
		{
			h = Integer.parseInt(tempVar5);
		}
		String tempVar6 = ConsoleInput.scanfRead();
		if (tempVar6 != null)
		{
			l = Integer.parseInt(tempVar6);
		}
		int day = 0;
		int[] a = new int[13];
		a[1] = 31;
		a[3] = 31;
		a[5] = 31;
		a[7] = 31;
		a[8] = 31;
		a[10] = 31;
		a[12] = 31;
		a[2] = 29;
		a[4] = 30;
		a[6] = 30;
		a[9] = 30;
		a[11] = 30;
		int[] b = new int[13];
		b[1] = 31;
		b[3] = 31;
		b[5] = 31;
		b[7] = 31;
		b[8] = 31;
		b[10] = 31;
		b[12] = 31;
		b[2] = 28;
		b[4] = 30;
		b[6] = 30;
		b[9] = 30;
		b[11] = 30;
		int i;
		int j;
		for (i = y;i <= c;i++)
		{
			if (i == y)
			{
				j = m;
			}
			else
			{
				j = 1;
			}
			for (j;j <= 12;j++)
			{
				if (i == c && j == h)
				{
					break;
				}
				if ((i % 4 == 0 && i % 100 != 0) || (i % 400 == 0))
				{
					day += a[j];
				}
				else
				{
					day += b[j];
				}
			}
		}
		day = day - d + l;
		System.out.printf("%d",day);
		return 0;
	}

}

