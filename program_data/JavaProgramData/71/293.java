package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int y;
		int m1;
		int m2;
		int i;
		int j;
		int n;
		int e;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
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
			c = 0;
			if (m1 > m2)
			{
				e = m1;
				m1 = m2;
				m2 = e;
			}
			for (j = 1;j <= 12;j++)
			{
				if (j >= m1 != 0 && j < m2 && (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10 || j == 12))
				{
					c = c + 31;
				}
				if (j >= m1 != 0 && j < m2 && (j == 4 || j == 6 || j == 9 || j == 11))
				{
					c = c + 30;
				}
				if (j >= m1 != 0 && j < m2 && j == 2)
				{
					c = c + 28;
					if (y % 400 == 0 || (y % 100 != 0 && y % 4 == 0))
					{
						c = c + 1;
					}
				}


			}
			if (c % 7 == 0)
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

