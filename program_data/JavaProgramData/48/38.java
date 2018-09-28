package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
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
		int[][] a = new int[11][11];

		a[5][5] = m;
		int r;
		int i;
		int j;
		int i1;
		int j1;
		for (r = 0;r < n;r++)
		{
			int[][] b = new int[11][11];
			for (i = 1;i <= 9;i++)
			{
				for (j = 1;j <= 9;j++)
				{
					if (a[i][j] != 0)
					{
						for (i1 = i - 1;i1 <= i + 1;i1++)
						{
							for (j1 = j - 1;j1 <= j + 1;j1++)
							{
								b[i1][j1] += a[i][j];
							}
						}
					}
				}
			}
			for (i1 = 1;i1 <= 9;i1++)
			{
				for (j1 = 1;j1 <= 9;j1++)
				{
					a[i1][j1] += b[i1][j1];
				}
			}
		}
		for (i = 1;i <= 9;i++)
		{
			for (j = 1;j <= 9;j++)
			{
				System.out.printf("%d",a[i][j]);
				if (j != 9)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("\n");
				}
			}
		}
	}

}

