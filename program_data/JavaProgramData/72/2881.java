package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
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
		int[][] l = new int[m][n];
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					l[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (l[0][0] >= l[0][1] != 0 && l[0][0] >= l[1][0])
		{
			System.out.print("0 0\n");
		}
		for (j = 1;j < n - 1;j++)
		{
			if (l[0][j] >= l[0][j - 1] != 0 && l[0][j] >= l[0][j + 1] != 0 && l[0][j] >= l[1][j])
			{
				System.out.printf("0 %d\n",j);
			}
		}
		if (l[0][n - 1] >= l[0][n - 2] != 0 && l[0][n - 1] >= l[1][n - 1])
		{
			System.out.printf("0 %d\n",n - 1);
		}
		for (i = 1;i < m - 1;i++)
		{
			if (l[i][0] >= l[i - 1][0] != 0 && l[i][0] >= l[i + 1][0] != 0 && l[i][0] >= l[i][1])
			{
					System.out.printf("%d 0\n",i);
			}
			for (j = 1;j < n - 1;j++)
			{
				if ((l[i][j] >= l[i - 1][j]) && (l[i][j] >= l[i + 1][j]) && (l[i][j] >= l[i][j - 1]) && (l[i][j] >= l[i][j + 1]))
				{
					System.out.printf("%d %d\n",i,j);
				}
			}
			if (l[i][n - 1] >= l[i - 1][n - 1] != 0 && l[i][n - 1] >= l[i + 1][n - 1] != 0 && l[i][n - 1] >= l[i][n - 2])
			{
					System.out.printf("%d %d\n",i,n - 1);
			}
		}
		if (l[m - 1][0] >= l[m - 1][1] != 0 && l[m - 1][0] >= l[m - 2][0])
		{
			System.out.printf("%d 0\n",m - 1);
		}
		for (j = 1;j < n - 1;j++)
		{
			if (l[m - 1][j] >= l[m - 1][j - 1] != 0 && l[m - 1][j] >= l[m - 1][j + 1] != 0 && l[m - 1][j] >= l[m - 2][j])
			{
					System.out.printf("%d %d\n",m - 1,j);
			}
		}
		if (l[m - 1][n - 1] >= l[m - 1][n - 2] != 0 && l[m - 1][n - 1] >= l[m - 2][n - 1])
		{
			System.out.printf("%d %d\n",m - 1,n - 1);
		}
		return 0;
	}
}

