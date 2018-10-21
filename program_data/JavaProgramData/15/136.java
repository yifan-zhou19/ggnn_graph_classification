package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a =
		{
			{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		int i;
		int j;
		int x1;
		int x2;
		int y1;
		int y2;
		int n;
		int s;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i][j] = Integer.parseInt(tempVar2);
				}
			}
			System.out.print("\n");
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == 0)
				{
					x1 = i;
					y1 = j;
					break;
				}
			}
			if (j != n + 1)
			{
				break;
			}

		}
		for (i = n;i >= 1;i--)
		{
			for (j = n;j >= 1;j--)
			{
				if (a[i][j] == 0)
				{
					x2 = i;
					y2 = j;
					break;
				}
			}
			if (j != 0)
			{
				break;
			}
		}
		s = (y2 - y1 - 1) * (x2 - x1 - 1);
		System.out.printf("%d\n",s);
		return 0;
	}

}

