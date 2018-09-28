package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int hang = 0;
		int lie = 0;
		int p = -1;
		int i;
		int j;
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
				if (a[i][j] >= a[i][0] != 0 && a[i][j] >= a[i][1] != 0 && a[i][j] >= a[i][2] != 0 && a[i][j] >= a[i][3] != 0 && a[i][j] >= a[i][4] != 0 && a[i][j] <= a[0][j] != 0 && a[i][j] <= a[1][j] != 0 && a[i][j] <= a[2][j] != 0 && a[i][j] <= a[3][j])
				{
					p = a[i][j];
					hang = i + 1;
					lie = j + 1;
					System.out.printf("%d %d %d\n",hang,lie,p);
				}
			}
		}
		if (p == -1)
		{
			System.out.print("not found\n");
		}
		return 0;
	}


}

