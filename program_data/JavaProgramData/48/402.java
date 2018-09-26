package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][][] a = new int[11][11][5];
		int i;
		int j;
		int nd;
		int k;
		int ii;
		int jj;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[5][5][0] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			nd = Integer.parseInt(tempVar2);
		}
		for (k = 1;k <= nd;k++)
		{
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					a[i][j][k] += a[i][j][k - 1];
					for (ii = -1;ii <= 1;ii++)
					{
						for (jj = -1;jj <= 1;jj++)
						{
							a[i + ii][j + jj][k] += a[i][j][k - 1];
						}
					}
				}
			}

		}
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 8;j++)
			{
				System.out.printf("%d ",a[i][j][nd]);
			}
			System.out.printf("%d\n",a[i][j][nd]);
		}
	}

}

