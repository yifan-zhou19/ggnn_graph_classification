package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int y;
		int m1;
		int m2;
		int i;
		int a;
		int j;
		int b = 0;
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
			if (m1 > m2)
			{
				a = m1;
				m1 = m2;
				m2 = a;
			}
			for (j = m1;j < m2;j++)
			{
				if (j == 1 || j == 3 || j == 5 || j == 7 || j == 8 || j == 10)
				{
					b += 31;
				}
				else if (j == 4 || j == 6 || j == 9 || j == 11)
				{
					b += 30;
				}
				else if (j == 2 && (y % 4 == 0 && y % 100 != 0 || y % 400 == 0))
				{
					b += 29;
				}
				else if (j == 2 && (y % 4 != 0 || y % 400 != 0))
				{
					b += 28;
				}
			}
			if (b % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
			b = 0;
		}
		return 0;
	}
}

