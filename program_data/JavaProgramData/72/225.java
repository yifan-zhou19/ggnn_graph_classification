package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int k;
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
		int[][] a = new int[m][n];
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
				if (i == 0 && j == 0 && a[0][0] >= a[1][0] != 0 && a[0][0] >= a[0][1])
				{
				System.out.print("0 0\n");
				}
				else if (i == 0 && j == (n - 1) && a[0][n - 1] >= a[1][n - 1] != 0 && a[0][n - 1] >= a[0][n - 1])
				{
				System.out.printf("0 %d\n",n - 1);
				}
				else if (i == (m - 1) && j == (n - 1) && a[m - 1][n - 1] >= a[m - 2][n - 1] != 0 && a[m - 1][n - 1] >= a[m - 1][n - 2])
				{
				System.out.printf("%d %d\n",m - 1,n - 1);
				}
				else if (i == (m - 1) && j == 0 && a[m - 1][0] > a[m - 2][0] && a[m - 1][0] >= a[m - 1][1])
				{
				System.out.printf("%d 0\n",m - 1);
				}
				else if (i == 0 && (j != 0 || j != (n - 1)) && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1])
				{
				System.out.printf("%d %d\n",i,j);
				}
				else if (i == (m - 1) && (j != 0 || j != (n - 1)) && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1])
				{
				System.out.printf("%d %d\n",i,j);
				}
				else if (j == 0 && (i != 0 || i != (m - 1)) && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j + 1])
				{
				System.out.printf("%d %d\n",i,j);
				}
				else if (j == (n - 1) && (i != 0 || i != (m - 1)) && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1])
				{
				System.out.printf("%d %d\n",i,j);
				}
				else if ((i > 0 && i < (m - 1)) && (j>0 && j < (n - 1)) && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i + 1][j])
				{
				System.out.printf("%d %d\n",i,j);
				}
			}
		}
		System.in.read();
		System.in.read();
	}
}

