package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] sz = new int[8][8];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		int i;
		int j;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		int a = 0;
		int n;
		int k;
		int m;
		for (i = 0;i < row;i++)
		{
			for (j = 0;j < col;j++)
			{
				if (sz[i][j] > a)
				{
					a = sz[i][j];
					n = i;
					k = j;
				}
			}
		int f;
		for (m = 1;m <= row;m++)
		{
			for (int p = 0;p < row - m;p++)
			{
				if (sz[p][k] > sz[p + 1][k])
				{
						f = sz[p + 1][k];
						sz[p + 1][k] = sz[p][k];
						sz[p][k] = f;
				}
			}
		}
		if (sz[0][k] == a)
		{
			System.out.printf("%d+%d\n",n,k);
		return 0;
		}
		}
		System.out.print("No\n");
		return 0;
	}
}

