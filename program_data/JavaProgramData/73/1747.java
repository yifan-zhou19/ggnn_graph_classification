package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int m;
		int[][] a = new int[5][5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0,n = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				for (k = 0,m = 0;k < 5;k++)
				{
					if (a[i][j] < a[i][k] || a[i][j]> a[k][j])
					{
						m = 1;
						break;
					}
				}
				if (m == 0)
				{
					n++;
					System.out.printf("%d %d %d\n",i + 1,j + 1,a[i][j]);
				}
			}
		}
		if (n == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}
}

