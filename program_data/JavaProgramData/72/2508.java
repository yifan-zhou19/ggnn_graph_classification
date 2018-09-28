package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int m;
		int n;
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
		int[][] h = new int[21][21];
		for (int i = 0;i < m;i++)
		{
			for (int j = 0;j < n;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					h[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (int k = 0;k < m;k++)
		{
			for (int l = 0;l < n;l++)
			{
				if ((k == 0 && l == 0) && (h[0][0] >= h[1][0] != 0 && h[0][0] >= h[0][1]))
				{
					System.out.printf("%d %d\n",k,l);
				}
				else if ((k == 0 && l == n - 1) && (h[0][n - 1] >= h[0][n - 2] != 0 && h[0][n - 1] >= h[1][n - 1]))
				{
					System.out.printf("%d %d\n",k,l);
				}
				else if ((k == m - 1 && l == 0) && (h[m - 1][0] >= h[m - 2][0] != 0 && h[m - 1][0] >= h[m - 1][1]))
				{
					System.out.printf("%d %d\n",k,l);
				}
				else if ((k == m - 1 && l == n - 1) && (h[m - 1][n - 1] >= h[m - 1][n - 2] != 0 && h[m - 1][n - 1] >= h[m - 2][n - 1]))
				{
					System.out.printf("%d %d\n",k,l);
				}
				else if ((k == 0 && (l > 0 && l < n - 1)) && (h[k][l] >= h[k][l - 1] != 0 && h[k][l] >= h[k][l + 1] != 0 && h[k][l] >= h[k + 1][l]))
				{
					System.out.printf("%d %d\n",k,l);
				}
				else if ((k == m - 1 && (l > 0 && l < n - 1)) && (h[k][l] >= h[k][l - 1] != 0 && h[k][l] >= h[k][l + 1] != 0 && h[k][l] >= h[k - 1][l]))
				{
					System.out.printf("%d %d\n",k,l);
				}
				else if ((l == 0 && (k > 0 && k < m - 1)) && (h[k][l] >= h[k][l + 1] != 0 && h[k][l] >= h[k + 1][l] != 0 && h[k][l] >= h[k - 1][l]))
				{
					System.out.printf("%d %d\n",k,l);
				}
				else if ((l == n - 1 && (k > 0 && k < m - 1)) && (h[k][l] >= h[k][l - 1] != 0 && h[k][l] >= h[k + 1][l] != 0 && h[k][l] >= h[k - 1][l]))
				{
					System.out.printf("%d %d\n",k,l);
				}
				else if (h[k][l] >= h[k][l - 1] != 0 && h[k][l] >= h[k][l + 1] != 0 && h[k][l] >= h[k - 1][l] != 0 && h[k][l] >= h[k + 1][l])
				{
					System.out.printf("%d %d\n",k,l);
				}
			}
		}
	}


}

