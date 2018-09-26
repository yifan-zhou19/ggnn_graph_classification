package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a1 = new int[9][9];
		int[][] a2 = new int[9][9];
		int m;
		int n;
		int i;
		int j;
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				a1[i][j] = 0;
				a2[i][j] = 0;
			}
		}
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		a1[4][4] = m;
		a2[4][4] = m;
		for (;n > 0;n--)
		{
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					if (a1[i][j] != 0)
					{
						a2[i][j] = a2[i][j] + a1[i][j];
						a2[i - 1][j - 1] = a2[i - 1][j - 1] + a1[i][j];
						a2[i - 1][j] = a2[i - 1][j] + a1[i][j];
						a2[i - 1][j + 1] = a2[i - 1][j + 1] + a1[i][j];
						a2[i][j - 1] = a2[i][j - 1] + a1[i][j];
						a2[i][j + 1] = a2[i][j + 1] + a1[i][j];
						a2[i + 1][j - 1] = a2[i + 1][j - 1] + a1[i][j];
						a2[i + 1][j] = a2[i + 1][j] + a1[i][j];
						a2[i + 1][j + 1] = a2[i + 1][j + 1] + a1[i][j];
					}
				}
			}
			for (i = 0;i < 9;i++)
			{
				for (j = 0;j < 9;j++)
				{
					a1[i][j] = a2[i][j];
				}
			}
		}
		for (i = 0;i < 9;i++)
		{
			for (j = 0;j < 9;j++)
			{
				if (j == 0)
				{
				System.out.printf("%d",a2[i][j]);
				}
				else if (j == 8)
				{
				System.out.printf(" %d\n",a2[i][j]);
				}
				else
				{
				System.out.printf(" %d",a2[i][j]);
				}
			}
		}
	}
}

