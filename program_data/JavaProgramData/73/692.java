package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int[][] a = new int[5][5];
		int p;
		int q;
		int t = 0;
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				p = 0;
				q = 0;
				for (k = 0;k <= 4;k++)
				{
					if (a[i][k] > a[i][j])
					{
						p = 1;
					}
					if (a[k][j] < a[i][j])
					{
						q = 1;
					}
				}
				if (p == 0 && q == 0)
				{
					System.out.printf("%d %d %d\n",i + 1,j + 1,a[i][j]);
					t = 1;
				}
			}
		}
		if (t == 0)
		{
		System.out.print("not found");
		}
	}

}

