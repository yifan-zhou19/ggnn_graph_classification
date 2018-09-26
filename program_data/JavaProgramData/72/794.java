package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[22][22];
		int flag;
		int x;
		int y;
		//freopen("5.in","r",stdin);
		//freopen("resullt.out","w",stdout);
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
				flag = 1;

				x = i - 1;
				y = j;
				if (flag == 1 && x >= 0)
				{
					if (a[i][j] < a[x][y])
					{
						flag = 0;
					}
				}
				x = i;
				y = j + 1;
				if (flag == 1 && y < n)
				{
					if (a[i][j] < a[x][y])
					{
						flag = 0;
					}
				}
				x = i;
				y = j - 1;
				if (flag == 1 && y >= 0)
				{
					if (a[i][j] < a[x][y])
					{
						flag = 0;
					}
				}
				x = i + 1;
				y = j;
				if (flag == 1 && x < m)
				{
					if (a[i][j] < a[x][y])
					{
						flag = 0;
					}
				}
				if (flag != 0) //flag==1
				{
					System.out.printf("%d %d\n",i,j);
				}
			}
		}

		return 0;
	}

}

