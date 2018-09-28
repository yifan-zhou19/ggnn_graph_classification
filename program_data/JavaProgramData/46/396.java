package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int ROW;
		int COL;
		int a;
		int b;
		int[][] sz = new int[100][100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			ROW = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			COL = Integer.parseInt(tempVar2);
		}
		for (a = 0;a < ROW;a++)
		{
			for (b = 0;b < COL;b++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[a][b] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (ROW > COL)
		{
			n = COL;
		}
		else
		{
			n = ROW;
		}
		int i;
		int s;
		int t;
		int p;
		int q;
		if (n % 2 == 0)
		{
		for (i = 0;i < (n + 1) / 2;i++)
		{
			for (s = i;s < COL - i;s++)
			{
				System.out.printf("%d\n",sz[i][s]);
			}
			for (t = i + 1;t < ROW - i;t++)
			{
				System.out.printf("%d\n",sz[t][COL - i - 1]);
			}
			for (p = COL - i - 2;p >= i;p--)
			{
				System.out.printf("%d\n",sz[ROW - i - 1][p]);
			}
			for (q = ROW - i - 2;q > i;q--)
			{
				System.out.printf("%d\n",sz[q][i]);
			}
		}
		}
		else if (n % 2 == 1)
		{
			for (i = 0;i < (n - 1) / 2;i++)
			{
			for (s = i;s < COL - i;s++)
			{
				System.out.printf("%d\n",sz[i][s]);
			}
			for (t = i + 1;t < ROW - i;t++)
			{
				System.out.printf("%d\n",sz[t][COL - i - 1]);
			}
			for (p = COL - i - 2;p >= i;p--)
			{
				System.out.printf("%d\n",sz[ROW - i - 1][p]);
			}
			for (q = ROW - i - 2;q > i;q--)
			{
				System.out.printf("%d\n",sz[q][i]);
			}
			}
			for (i = (n - 1) / 2;i <= (n - 1) / 2;i++)
			{
				for (s = i;s < COL - i;s++)
				{
				System.out.printf("%d\n",sz[i][s]);
				}
			for (t = i + 1;t < ROW - i;t++)
			{
				System.out.printf("%d\n",sz[t][COL - i - 1]);
			}
			}
		}
		return 0;
	}

}

