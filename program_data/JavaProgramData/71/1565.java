package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int y;
		int m1;
		int m2;
		int a;
		int b;
		int c;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			a = 0;
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
				c = m2;
				m2 = m1;
				m1 = c;
			}
			if (y % 4 != 0 || (y % 100 == 0 && y % 400 != 0))
			{
				for (b = m1;b < m2;b++)
				{
					if (b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10 || b == 12)
					{
						a = a + 31;
					}
					else if (b == 2)
					{
						a = a + 28;
					}
					else
					{
						a = a + 30;
					}
				}
			}
			else
			{
				for (b = m1;b < m2;b++)
				{
					if (b == 1 || b == 3 || b == 5 || b == 7 || b == 8 || b == 10 || b == 12)
					{
						a = a + 31;
					}
					else if (b == 2)
					{
						a = a + 29;
					}
					else
					{
						a = a + 30;
					}
				}
			}
			if (a % 7 == 0)
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

