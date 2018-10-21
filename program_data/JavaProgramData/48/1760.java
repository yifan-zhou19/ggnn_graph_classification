package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int l;
		int m;
		int n;
		int x;
		int[][] b = new int[11][11];
		int[][] c = new int[11][11];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		c[5][5] = x;
		for (n = 1;n <= m;n++)
		{
				for (i = 1;i < 10;i++)
				{
				for (j = 1;j < 10;j++)
				{
				b[i][j] = c[i][j];
				}
				}
			for (i = 5 - n;i <= 5 + n;i++)
			{
				for (j = 5 - n;j <= 5 + n;j++)
				{
					for (k = -1;k <= 1;k++)
					{
						for (l = -1;l <= 1;l++)
						{
							c[i][j] = c[i][j] + b[i - l][j - k];
						}
					}
				}
			}
		}
		 for (i = 1;i < 10;i++)
		 {
			for (j = 1;j < 10;j++)
			{
				if (j == 1)
				{
					System.out.printf("%d",c[i][j]);
				}
				else
				{
					System.out.printf(" %d",c[i][j]);
				}
			}
			System.out.print("\n");
		 }
	}


}

