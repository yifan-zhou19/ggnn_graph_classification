package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6];
		int i;
		int j;
		int k = 0;
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		int flag = 0;
		int m;
		int p;
		int c;
		for (i = 1;i <= 5;i++)
		{
			for (j = 1;j <= 5;j++)
			{
				flag = 0;
				for (m = 1;m <= 5;m++)
				{
					if (a[i][j] >= a[i][m])
					{
						flag = flag + 1;
					}
				}
				if (flag == 5)
				{
					c = 0;
					for (p = 1;p <= 5;p++)
					{
						if (a[i][j] <= a[p][j])
						{
							c = c + 1;
						}
					}
					if (c == 5)
					{
						System.out.printf("%d %d %d",i,j,a[i][j]);
						k = k + 1;
					}
				}
			}
		}
		if (k == 0)
		{
			System.out.print("not found");
		}

		return 0;
	}

}

