package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int k;
		int c = -1;
		int[][] sz = new int[N + 2][N + 2];
		int[] Hi = new int[N * N];
		int[] Hj = new int[N * N];
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
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
			 String tempVar3 = ConsoleInput.scanfRead();
			 if (tempVar3 != null)
			 {
				 sz[i][j] = Integer.parseInt(tempVar3);
			 }
			}
		}
		for (i = 1;i <= m;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (sz[i][j] >= sz[i + 1][j] != 0 && sz[i][j] >= sz[i - 1][j] != 0 && sz[i][j] >= sz[i][j + 1] != 0 && sz[i][j] >= sz[i][j - 1])
				{
					c++;
					Hi[c] = i - 1;
					Hj[c] = j - 1;
				}
			}
		}
		for (k = 0;k < c;k++)
		{
		   System.out.printf("%d %d\n",Hi[k],Hj[k]);
		}
		System.out.printf("%d %d",Hi[c],Hj[c]);
		return 0;
	}
}

