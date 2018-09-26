package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[100][100];
		int col;
		int row;
		int i;
		int k;
		int count = 0;
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
		for (i = 0;i < row;i++)
		{
			for (k = 0;k < col;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][k] = Integer.parseInt(tempVar3);
				}
			}
		}
		i = 0;
		k = 0;
		for (1;1;1)
		{
			for (k = k;k < col;k++)
			{
				System.out.printf("%d\n",sz[i][k]);
				sz[i][k] = 0;
				count++;
				if (sz[i][k + 1] == 0 || k + 1 == col)
				{
					i = i + 1;
					break;
				}
			}
			if (count >= col * row)
			{
				break;
			}
			for (i = i;i < row;i++)
			{
				System.out.printf("%d\n",sz[i][k]);
				sz[i][k] = 0;
				count++;
				if (sz[i + 1][k] == 0 || i + 1 == row)
				{
					k = k - 1;
					break;
				}
			}
			if (count >= col * row)
			{
				break;
			}
			for (k = k;k >= 0;k--)
			{
				System.out.printf("%d\n",sz[i][k]);
				sz[i][k] = 0;
				count++;
				if (sz[i][k - 1] == 0 || k == 0)
				{
					i = i - 1;
					break;
				}
			}
			if (count >= col * row)
			{
				break;
			}
			for (i = i;i >= 0;i--)
			{
				System.out.printf("%d\n",sz[i][k]);
				sz[i][k] = 0;
				count++;
				if (sz[i - 1][k] == 0 || i == 0)
				{
					k = k + 1;
					break;
				}
			}
			if (count >= col * row)
			{
				break;
			}
		}
		return 0;
	}
}

