package <missing>;

public class GlobalMembers
{
	public static void Main(String[] args)
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		int[][] a = new int[20][20];
		for (int i = 0;i < n;i++)
		{
			for (int j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					a[i][j] = Integer.parseInt(tempVar3);
				}
			}
		}
		for (int k = 0;k < n;k++)
		{
			for (int l = 0;l < m;l++)
			{
				if ((k == 0 && l == 0) && a[k][l] >= a[k][l + 1] != 0 && a[k][l] >= a[k + 1][l])
				{
					System.out.printf("%d %d\n",k,l);
				}
				else if ((k == 0 && l != m - 1 && l != 0) && a[k][l] >= a[k][l - 1] != 0 && a[k][l] >= a[k + 1][l] != 0 && a[k][l] >= a[k][l + 1])
				{
					System.out.printf("%d %d\n",k,l);
				}
				else if ((k == 0 && l == m - 1) && a[k][l] >= a[k][l - 1] != 0 && a[k][l] >= a[k + 1][l])
				{
					System.out.printf("%d %d\n",k,l);
				}
				else if ((k != n - 1 && k != 0 && l == 0) && a[k][l] >= a[k][l + 1] != 0 && a[k][l] >= a[k + 1][l] != 0 && a[k][l] >= a[k - 1][l])
				{
					System.out.printf("%d %d\n",k,l);
				}
				else if ((k != n - 1 && l != m - 1 && k != 0 && l != 0) && a[k][l] >= a[k][l + 1] != 0 && a[k][l] >= a[k - 1][l] != 0 && a[k][l] >= a[k + 1][l] != 0 && a[k][l] >= a[k][l - 1])
				{
					System.out.printf("%d %d\n",k,l);
				}
				else if ((k != n - 1 && k != 0 && l == m - 1) && a[k][l] >= a[k][l - 1] != 0 && a[k][l] >= a[k + 1][l] != 0 && a[k][l] >= a[k - 1][l])
				{
					System.out.printf("%d %d\n",k,l);
				}
				else if ((k == n - 1 && l == 0) && a[k][l] >= a[k][l + 1] != 0 && a[k][l] >= a[k - 1][l])
				{
					System.out.printf("%d %d\n",k,l);
				}
				else if ((k == n - 1 && l != m - 1 && l != 0) && a[k][l] >= a[k][l - 1] != 0 && a[k][l] >= a[k][l + 1] != 0 && a[k][l] >= a[k - 1][l])
				{
					System.out.printf("%d %d\n",k,l);
				}
				else if ((k == n - 1 && l == m - 1) && a[k][l] >= a[k - 1][l] != 0 && a[k][l] >= a[k][l - 1])
				{
					System.out.printf("%d %d\n",k,l);
				}
			}
		}
	}
}

