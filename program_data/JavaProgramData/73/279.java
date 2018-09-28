package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int k;
		int[][] b = new int[5][5];
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				b[i][j] = 1;
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				for (k = 0;k < 5;k++)
				{
					b[i][j] *= (a[i][j] >= a[i][k]);
					if (b[i][j] == 0)
					{
						break;
					}
				}
				if (b[i][j] == 0)
				{
					continue;
				}
			}
		}
		for (j = 0;j < 5;j++)
		{
			for (i = 0;i < 5;i++)
			{
				for (k = 0;k < 5;k++)
				{
					b[i][j] *= (a[i][j] <= a[k][j]);
					if (b[i][j] == 0)
					{
						break;
					}
				}
				if (b[i][j] == 0)
				{
					continue;
				}
			}
		}
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				if (b[i][j] == 1)
				{
					System.out.printf("%d %d %d\n",i + 1,j + 1,a[i][j]);
					return;
				}
			}
		}
		System.out.print("not found\n");
	}


}

