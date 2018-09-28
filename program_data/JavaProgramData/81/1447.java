package <missing>;

public class GlobalMembers
{
	public static int reverse(int[][] sz, int m, int n)
	{
		int e;
		int j;
		if (m >= 0 && m <= 4 && n >= 0 && n <= 4)
		{
			for (j = 0;j < 5;j++)
			{
			e = sz[n][j];
			sz[n][j] = sz[m][j];
			sz[m][j] = e;
			}
		return 1;
		}
		else
		{
		return 0;
		}
	}
	public static int Main()
	{
		int i;
		int j;
		int[][] sz1 = new int[5][5];
		int y;
		int n1;
		int m1;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					(sz1[i][j]) = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n1 = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m1 = Integer.parseInt(tempVar3);
		}
		y = reverse(sz1, m1, n1);
		if (y == 0)
		{
		System.out.print("error");
		}
		else if (y == 1)
		{
			for (i = 0;i < 5;i++)
			{
				for (j = 0;j < 4;j++)
				{
					System.out.printf("%d ",sz1[i][j]);
				}
				System.out.printf("%d",sz1[i][4]);
				System.out.print("\n");
			}
		}
	return 0;
	}
}

