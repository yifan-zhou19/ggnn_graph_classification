package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] sz = new int[50000][2];
		int n;
		int row;
		int col;
		int i;
		int e;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (row = 0;row < n;row++)
		{
			for (col = 0;col < 2;col++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					sz[row][col] = Integer.parseInt(tempVar2);
				}
			}
		}
		for (i = 0;i < n;i++)
		{
			for (row = 0;row < n - 1;row++)
			{
				if (sz[row][0] > sz[row + 1][0])
				{
					e = sz[row][0];
					sz[row][0] = sz[row + 1][0];
					sz[row + 1][0] = e;
					e = sz[row][1];
					sz[row][1] = sz[row + 1][1];
					sz[row + 1][1] = e;
				}
			}
		}
		k = 0;
		for (row = 0;row < n - 1;row++)
		{
			if (sz[row][1] < sz[row + 1][0])
			{
				System.out.print("no");
				k = 1;
				break;
			}
			if (sz[row][1] > sz[row + 1][1])
			{
				e = sz[row][1];
				sz[row + 1][1] = sz[row][1];
				sz[row][1] = e;
			}
		}
		if (k == 0)
		{
			System.out.printf("%d %d",sz[0][0],sz[n - 1][1]);
		}
		return 0;
	}
}

