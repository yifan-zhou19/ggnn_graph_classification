package <missing>;

public class GlobalMembers
{
	public static int year(int y)
	{
		int r;
		if ((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
		{
			r = 1;
		}
		else
		{
			r = 0;
		}
		return (r);
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int day;
		int t;
		int ye;
		int m1;
		int m2;
		int[][] days =
		{
			{31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31},
			{31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}
		};
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			day = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				ye = Integer.parseInt(tempVar2);
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
				t = m1;
				m1 = m2;
				m2 = t;
			}
			if (year(ye) == 1)
			{
				for (j = m1 - 1;j < m2 - 1;j++)
				{
					day = day + days[1][j];
				}
			}
			else
			{
				for (j = m1 - 1;j < m2 - 1;j++)
				{
					day = day + days[0][j];
				}
			}
			if (day % 7 == 0)
			{
				System.out.print("YES\n");
			}
			else
			{
				System.out.print("NO\n");
			}
		}
	}

}

