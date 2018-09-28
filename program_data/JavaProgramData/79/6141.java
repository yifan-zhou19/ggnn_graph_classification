package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int k;
		int[][] a = new int[300][300];
			for (k = 0;k < 300;k++)
			{
			int n;
			int m;
			int i;
			int j;
			String tempVar = ConsoleInput.scanfRead();
			if (tempVar != null)
			{
				n = Integer.parseInt(tempVar);
			}
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (n == 0 && m == 0)
			{
				break;
			}

			for (i = 0;i < 300;i++)
			{
				for (j = 0;j < 300;j++)
				{
					a[i][j] = 0;
				}
			}
			for (i = 0;i < n;i++)
			{
				a[0][i] = i + 1;
			}
			for (i = 1;i < n;i++)
			{
				for (j = 0;j < n - i;j++)
				{
					if ((m + j) < (n - i + 1))
					{
						a[i][j] = a[i - 1][m + j];
					}
					else
					{
						a[i][j] = a[i - 1][(m + j) % (n - i + 1)];
					}
				}
			}
			System.out.printf("%d\n",a[n - 1][0]);

			}


	}
}

