package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[M][N];
		int i;
		int j;
		int k;
		int p;
		int count = 0;

		for (i = 0; i < M; i++)
		{
			for (j = 0; j < N; j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0; i < M; i++)
		{
			p = 0;
			for (j = 0; j < N; j++)
			{
				if (a[i][p] < a[i][j])
				{
					p = j;
				}
			}
			for (k = 0; k < M; k++)
			{
				if (a[i][p] > a[k][p])
				{
					break;
				}
			}
			if (k == M)
			{
			  System.out.printf("%d %d %d\n",i + 1,p + 1,a[i][p]);
			count++;
			}
		}
		if (count == 0)
		{
			System.out.print("not found\n");
		}
		return 0;
	}

}

