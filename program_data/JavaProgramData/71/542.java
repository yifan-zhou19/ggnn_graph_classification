package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		void xiangguan(int y,int m1,int m2);
		int n;
		int i;
		int year;
		int m1;
		int m2;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				year = Integer.parseInt(tempVar2);
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
			xiangguan(year, m1, m2);
		}
	}

	public static void xiangguan(int y,int m1,int m2)
	{
		int runnian = int y;
		int x1 = 0;
		int x2 = 0;
		int i;
		int j;
		for (i = 1;i < m1;i++)
		{
			x1 = x1 + 31;
			if (i == 4 || i == 6 || i == 9 || i == 11)
			{
				x1--;
			}
			if (i == 2)
			{
				if (runnian(y) != 0)
				{
				x1 = x1 - 2;
				}
				else
				{
					x1 = x1 - 3;
				}
			}
		}
		for (j = 1;j < m2;j++)
		{
			x2 = x2 + 31;
			if (j == 4 || j == 6 || j == 9 || j == 11)
			{
				x2--;
			}
			if (j == 2)
			{
				if (runnian(y) != 0)
				{
				x2 = x2 - 2;
				}
				else
				{
					x2 = x2 - 3;
				}
			}
		}
		if ((x1 - x2) % 7 == 0)
		{
			System.out.print("YES\n");
		}
		else
		{
			System.out.print("NO\n");
		}
	}

	public static int runnian(int y)
	{
		if (((y % 4 == 0) && (y % 100 != 0)) || (y % 400 == 0))
		{
			return (1);
		}
		else
		{
			return (0);
		}
	}
}

