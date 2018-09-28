package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		for (i = 0;i < n;i++)
		{
			int y;
			int m1;
			int m2;
			int cha = 0;
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
			if ((y % 4 == 0 && y % 100 != 0) || (y % 400 == 0))
			{
				if ((m1 < 3) && (m2 >= 3))
				{
					for (j = m1;j < m2;j++)
					{
						cha += days[j];
					}
					cha++;
				}
				else if ((m2 < 3) && (m1 >= 3))
				{
					for (j = m2;j < m1;j++)
					{
						cha += days[j];
					}
					cha++;
				}
				else if (m2 > m1)
				{
					for (j = m1;j < m2;j++)
					{
						cha += days[j];
					}
				}
				else if (m1 > m2)
				{
					for (j = m2;j < m1;j++)
					{
						cha += days[j];
					}
				}
			}
			else
			{
				if (m2 > m1)
				{
					for (j = m1;j < m2;j++)
					{
						cha += days[j];
					}
				}
				else
				{
					for (j = m2;j < m1;j++)
					{
						cha += days[j];
					}
				}
			}
			if (cha % 7 == 0)
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

