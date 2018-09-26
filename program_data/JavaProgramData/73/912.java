package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[][] b = new int[5][5];
		int[][] e = new int[5][5];
		int[] c = new int[5];
		int[] d = new int[5];
		int i;
		int j;
		int k;
		int f;
		int n = 0;
		int s = 0;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				a[i][j] = Integer.parseInt(tempVar);
			}
			b[i][j] = a[i][j];
			e[i][j] = a[i][j];
			}
		}

		for (k = 0;k < 5;k++)
		{
		for (j = 0;j < 4;j++)
		{
		  if (b[k][j] >= b[k][j + 1])
		  {
				f = b[k][j];
				b[k][j] = b[k][j + 1];
				b[k][j + 1] = f;
		  }
		}
			c[k] = b[k][4];
		}

		for (k = 0;k < 5;k++)
		{
		for (j = 0;j < 4;j++)
		{
		  if (e[j][k] <= e[j + 1][k])
		  {
				f = e[j][k];
				e[j][k] = e[j + 1][k];
				e[j + 1][k] = f;
		  }
		}
			d[k] = e[4][k];
		}

		for (i = 0;i < 5;i++)
		{
		for (j = 0;j < 5;j++)
		{
			if (a[i][j] == c[i] && a[i][j] == d[j])
			{
				System.out.printf("%d %d %d",i + 1,j + 1,a[i][j]);
				n = n + 1;
			}
		}
		}
		if (n == 0)
		{
		System.out.print("not found");
		}
	}

}

