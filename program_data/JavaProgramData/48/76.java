package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int i;
		int j;
		int n;
		int k;
		int[][][] a = new int[5][9][9];

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (t = 0;t < k + 1;t++)
		{
			 for (i = 0;i < 9;i++)
			 {
					for (j = 0;j < 9;j++)
					{
							a[t][i][j] = 0;
					}
			 }
		}
		a[0][4][4] = n;

		for (t = 0;t < k;t++)
		{
			  for (i = 1;i < 8;i++)
			  {
					for (j = 1;j < 8;j++)
					{
							a[t + 1][i][j] += a[t][i][j] * 2;
							a[t + 1][i + 1][j] += a[t][i][j];
							a[t + 1][i - 1][j] += a[t][i][j];
							a[t + 1][i + 1][j + 1] += a[t][i][j];
							a[t + 1][i - 1][j - 1] += a[t][i][j];
							a[t + 1][i][j + 1] += a[t][i][j];
							a[t + 1][i][j - 1] += a[t][i][j];
							a[t + 1][i + 1][j - 1] += a[t][i][j];
							a[t + 1][i - 1][j + 1] += a[t][i][j];
					}
			  }
		}

		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				System.out.printf("%d",a[k][i][j]);
				if (j != 8)
				{
					System.out.print(" ");
				}
			}
			if (i != 8)
			{
				System.out.print("\n");
			}
		}

		return 0;
	}

}

