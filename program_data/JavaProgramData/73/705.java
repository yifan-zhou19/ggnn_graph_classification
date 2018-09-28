package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6];
		int i;
		int j;
		int k;
		int l;
		int m = 5;
		int n = 5;
		int c = 0;
		int g = 0;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (l = 0,i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] > l)
				{
					l = a[i][j];
					c = j;
				}
			}
			for (k = 0;k < m;k++)
			{
				if (a[k][c] < l)
				{
					l = a[k][c];
					break;
				}
			}
			if (l == a[i][c])
			{
				System.out.printf("%d %d %d\n",i + 1,c + 1,a[i][c]);
				g = -1;
			}
			l = a[i + 1][0];
			c = 0;
		}
		if (g == 0)
		{
		System.out.print("not found\n");
		}
	}

}

