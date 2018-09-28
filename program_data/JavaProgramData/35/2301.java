package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[100][100];
		int[][] flag1 = new int[100][100];
		int[][] flag2 = new int[100][100];
		int p;
		int q;
		int point = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (i = 0;i < m;i++)
		{
				for (j = 0;j < n;j++)
				{
					for (p = 0;p < n;p++)
					{
						if (a[i][j] < a[i][p])
						{
							flag1[i][j] = flag1[i][j] + 1;
						}

					}
					for (q = 0;q < m;q++)
					{
						if (a[i][j] > a[q][j])
						{
						flag2[i][j] = flag2[i][j] + 1;
						}
					}
				}
		}
		for (i = 0;i < m;i++)
		{
				for (j = 0;j < n;j++)
				{
					if (flag1[i][j] == 0 && flag2[i][j] == 0)
					{
						System.out.printf("%d+%d\n",i,j);
						point = point + 1;
					}

				}
		}

			if (point == 0)
			{
				System.out.print("No");
			}
			return 0;
	}

}

