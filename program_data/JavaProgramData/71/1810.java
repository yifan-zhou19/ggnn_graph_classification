package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int e;
		int i;
		int j;
		int y;
		int m1;
		int m2;
		int rlt;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			int d1 = 0;
			int d2 = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				y = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				m1 = Integer.parseInt(tempVar3);
			}
			String tempVar4 = ConsoleInput.scanfRead(" ");
			if (tempVar4 != null)
			{
				m2 = Integer.parseInt(tempVar4);
			}

			if (m1 < m2)
			{
				e = m1;
				m1 = m2;
				m2 = e;
			}

			if (m1 > 1)
			{
				for (j = 1;j < m1;j++)
				{
					if (j == 4 || j == 6 || j == 9 || j == 11)
					{
						d1 += 30;
					}
					else if (j == 2)
					{
						if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
						{
							d1 += 29;
						}
						else
						{
							d1 += 28;
						}
					}
					else
					{
						d1 += 31;
					}
				}
			}

			if (m2 > 1)
			{
				for (j = 1;j < m2;j++)
				{
					if (j == 4 || j == 6 || j == 9 || j == 11)
					{
						d2 += 30;
					}
					else if (j == 2)
					{
						if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
						{
							d2 += 29;
						}
						else
						{
							d2 += 28;
						}
					}
					else
					{
						d2 += 31;
					}
				}
			}

			rlt = (d1 - d2) % 7;
			if (rlt == 0)
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

