package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] h = new int[20][20];
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
					h[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		if (h[0][0] >= h[1][0] != 0 && h[0][0] >= h[0][1])
		{
				System.out.print("0 0\n");
		}
		for (j = 1;j < n - 1;j++)
		{
			if (h[0][j] >= h[0][j - 1] != 0 && h[0][j] >= h[1][j] != 0 && h[0][j] >= h[0][j + 1])
			{
					System.out.printf("0 %d\n",j);
			}
		}
		if (h[0][n - 1] >= h[1][n - 1] != 0 && h[0][n - 1] >= h[0][n - 2])
		{
				System.out.printf("0 %d\n",n - 1);
		}
		for (i = 1;i < m - 1;i++)
		{
			if (h[i][0] >= h[i - 1][0] != 0 && h[i][0] >= h[i + 1][0] != 0 && h[i][0] >= h[i][1])
			{
						 System.out.printf("%d 0\n",i);
			}
			for (j = 1;j < n - 1;j++)
			{
				if (i > 0 && j > 0 && i < m - 1)
				{
					if (h[i][j] >= h[i - 1][j] != 0 && h[i][j] >= h[i][j - 1] != 0 && h[i][j] >= h[i + 1][j] != 0 && h[i][j] >= h[i][j + 1])
					{
						 System.out.printf("%d %d\n",i,j);
					}
				}
			}
			if (h[i][n - 1] >= h[i - 1][n - 1] != 0 && h[i][n - 1] >= h[i][n - 2] != 0 && h[i][n - 1] >= h[i + 1][n - 1])
			{
						 System.out.printf("%d %d\n",i,n - 1);
			}
		}
		if (h[m - 1][0] >= h[m - 1][1] != 0 && h[m - 1][0] >= h[m - 2][0])
		{
			System.out.printf("%d 0\n",m - 1);
		}
		for (j = 1;j < n - 1;j++)
		{
			if (h[m - 1][j] >= h[m - 2][j] != 0 && h[m - 1][j] >= h[m - 1][j - 1] != 0 && h[m - 1][j] >= h[m - 1][j + 1])
			{
						 System.out.printf("%d %d\n",m - 1,j);
			}
		}
		if (h[m - 1][n - 1] >= h[m - 1][n - 2] != 0 && h[m - 1][n - 1] >= h[m - 2][n - 1])
		{
			System.out.printf("%d %d\n",m - 1,n - 1);
		}
		return 0;
	}

}

