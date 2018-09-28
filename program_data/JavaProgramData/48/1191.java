package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[M][M];
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		a[M / 2][M / 2] = m;
		for (int k = 0;k < n;k++)
		{
			int[][] b = new int[M][M];
			for (int i = 1;i < M - 1;i++)
			{
			for (int j = 1;j < M - 1;j++)
			{
				b[i][j] += a[i][j];
				for (int I = -1;I <= 1;I++)
				{
					for (int J = -1;J <= 1;J++)
					{
					   b[i + I][j + J] += a[i][j];
					}
				}
			}
			}
			  for (int q = 0;q < M;q++)
			  {
				for (int p = 0;p < M;p++)
				{
		   a[q][p] = b[q][p];
				}
			  }
		}
		for (int i = 0;i < M;i++)
		{
			for (int j = 0;j < M - 1;j++)
			{
				System.out.printf("%d ",a[i][j]);
			}
			System.out.printf("%d\n",a[i][M - 1]);
		}
	}
}

