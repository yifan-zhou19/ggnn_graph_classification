package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int y;
		int m1;
		int m2;
		int d;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int i;
		int t;
		int j;
		for (i = 0;i < n;i++)
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
			d = 0;
			if (m1 < m2)
			{
				t = m1;
				m1 = m2;
				m2 = t;
			}
			for (j = m2;j < m1;j++)
			{
				if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10)
				{
					d += 31;
				}
				else if (j == 4 || j == 6 || j == 9 || j == 11)
				{
					d += 30;
				}
				else
				{
					if (y % 4 == 0 && y % 100 != 0 || y % 400 == 0)
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

