package <missing>;

public class GlobalMembers
{
	public static int exc(int x, int y)
	{
		int z;
		int j;
		int e;
		int[][] s = new int[5][5];
		if (x > 4 || y > 4)
		{
			z = 0;
		}
		else
		{
			z = 1;
			for (j = 0;j < 5;j++)
			{
				e = s[x][j];
				s[x][j] = s[y][j];
				s[y][j] = e;
			}
		}
		return z;
	}


	public static int Main()
	{
		int[][] sz = new int[5][5];
		int n;
		int m;
		int j;
		int e;
		int row;
		int col;

		for (row = 0;row < 5;row++)
		{
			for (col = 0;col < 5;col++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[row][col] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}

		exc(n, m);
		if (exc(n, m) == 0)
		{
			System.out.print("error");
		}
		else
		{
			for (j = 0;j < 5;j++)
			{
				e = sz[n][j];
				sz[n][j] = sz[m][j];
				sz[m][j] = e;
			}
			for (row = 0;row < 5;row++)
			{
				for (col = 0;col < 4;col++)
				{
					System.out.printf("%d ",sz[row][col]);
				}
				System.out.printf("%d\n",sz[row][4]);
			}
		}

		return 0;

	}

}

