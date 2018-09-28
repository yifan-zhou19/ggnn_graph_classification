package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int m;
		int n;
		int row;
		int col;
		int e;
		int p;
		int k;
		int q;

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}

		for (p = 0;p < row;p++)
		{
			for (q = 0;q < col;q++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[p][q] = Integer.parseInt(tempVar3);
				}
			}
		}

		if (col < row)
		{
			e = col / 2 + 1;
		}
		else
		{
			e = row / 2 + 1;
		}

		for (k = 0;k < e;k++)
		{
			if (k == (col - k))
			{
				break;
			}
			for (m = k,n = k;n < col - k;n++)
			{
				System.out.printf("%d\n",sz[m][n]);
			}
			if ((1 + k) == (row - k))
			{
				break;
			}
			for (n = col - 1 - k,m = 1 + k;m < row - k;m++)
			{
				System.out.printf("%d\n",sz[m][n]);
			}

			if ((col - 2 - k) == (k - 1))
			{
				break;
			}
			for (m = row - 1 - k,n = col - 2 - k;n >= k;n--)
			{
				System.out.printf("%d\n",sz[m][n]);
			}
			if ((row - 2 - k) == k)
			{
				break;
			}
			for (n = k,m = row - 2 - k;m >= 1 + k;m--)
			{
				if (m < 0)
				{
					break;
				}
				System.out.printf("%d\n",sz[m][n]);
			}
		}

		return 0;
	}
}

