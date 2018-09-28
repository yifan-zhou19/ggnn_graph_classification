package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int w;
		int q;
		int j;
		int i;
		int e;
		int[][] sz = new int[100][100];
		int[] sz1 = new int[100];
		int[] sz2 = new int[100];
		int x = 0;
		int y = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (q = 0;q < m;q++)
		{
			for (w = 0;w < n;w++)
			{
				if (sz[q][w] >= sz[q - 1 > 0?q - 1:0][w] != 0 && sz[q][w] >= sz[q + 1][w] != 0 && sz[q][w] >= sz[q][w - 1 > 0?w - 1:0] != 0 && sz[q][w] >= sz[q][w + 1])
				{
					System.out.printf("%d %d\n",q,w);
				}
			}
		}
		return 0;
	}
}

