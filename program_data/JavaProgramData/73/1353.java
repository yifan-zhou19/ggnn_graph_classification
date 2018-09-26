package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int[][] b = new int[5][5];
		int[][] site = new int[5][5];
		int i;
		int j;
		int s;
		int tmp;
		s = 0;
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
				site[i][j] = 0;
			}
		}
		for (i = 0;i <= 4;i++)
		{
			tmp = 0;
			site[i][tmp] = 1;
			for (j = 0;j <= 4;j++)
			{
				if (a[i][tmp] < a[i][j])
				{
					site[i][tmp] = 0;
					site[i][j] = 1;
					tmp = j;
				}
			}
		}
		for (j = 0;j <= 4;j++)
		{
			tmp = 0;
			site[tmp][j] = site[tmp][j] != 0 && 1;
			for (i = 1;i <= 4;i++)
			{
				if (a[tmp][j] > a[i][j])
				{
					site[tmp][j] = 0;
					site[i][j] = site[i][j] != 0 && 1;
					tmp = i;
				}
				else
				{
					site[i][j] = 0;
				}
			}
		}
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				if (site[i][j] == 1)
				{
					System.out.printf("%d %d %d\n",i + 1,j + 1,a[i][j]);
					s++;
					break;
				}
			}
		}
		if (s == 0)
		{
			System.out.print("not found");
		}

		return 0;
	}

}

