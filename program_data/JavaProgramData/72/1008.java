package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n;
		int m;
		int j;
		int k = 0;
		int f;
		int[][] sz = new int[25][25];
		int[][] q = new int[25][25];
		int[] w = new int[25];
		int[] s = new int[25];
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
		for (i = 0;i < m + 2;i++)
		{
		for (j = 0;j < n + 2;j++)
		{
			 q[0][j] = 0,q[m + 1][j] = 0,q[i][0] = 0,q[i][n + 1] = 0;
			q[i + 1][j + 1] = sz[i][j];
		}
		}
		for (i = 1;i < m + 1;i++)
		{
		for (j = 1;j < n + 1;j++)
		{
			if (q[i][j] >= q[i + 1][j] != 0 && q[i][j] >= q[i - 1][j] != 0 && q[i][j] >= q[i][j + 1] != 0 && q[i][j] >= q[i][j - 1])
			{

				System.out.printf("%d %d\n",i - 1,j - 1);
			}
		}
		}

	return 0;
	}


}

