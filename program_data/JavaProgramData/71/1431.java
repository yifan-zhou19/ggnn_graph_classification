package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int y;
		int m1;
		int m2;
		int e;
			 int d;
		int j;
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead();
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}
			if (m1 > m2)
			{
				e = m1;
				m1 = m2;
				m2 = e;
			}
			d = 0;
			for (j = m1;j < m2;j++)
			{
				if ((j == 1) || (j == 3) || (j == 5) || (j == 7) || (j == 8) || (j == 10) || (j == 12))
				{
					d += 31;
				}
				if ((j == 4) || (j == 6) || (j == 9) || (j == 11))
				{
					d += 30;
				}
				if (j == 2)
				{
					if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
					{
						d += 29;
					}
					else
					{
						d += 28;
					}
				}
			}
			if (d % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
					  System.out.print("NO\n");
			}
		}
		return 0;
	}

}

