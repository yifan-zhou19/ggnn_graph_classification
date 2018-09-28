package <missing>;

public class GlobalMembers
{
	public static int judge(int[][] a, int m, int n, int i, int j)
	{
		if (i == 0 && j < n - 1)
		{
			return 2;
		}
		if (j == n - 1 && i < m - 1)
		{
			return 3;
		}
		if (i == m - 1 && j > 0)
		{
			return 4;
		}
		if (j == 0 && i > 1)
		{
			return 1;
		}
		if (a[i - 1][j] != -1 && a[i][j - 1] == -1)
		{
			return 1;
		}
		if (a[i][j + 1] != -1)
		{
			return 2;
		}
		if (a[i + 1][j] != -1)
		{
			return 3;
		}
		if (a[i][j - 1] != -1)
		{
			return 4;
		}
		return 0;
	}
	public static void Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] a = new int[101][101];
		int judge = new int(int a[101][101],int n,int m,int i,int j);
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
		i = j = 0;
		if (m == 1 && n == 1)
		{
			System.out.printf("%d\n",a[0][0]);
		}
		else
		{
		while (judge(a, m, n, i, j) != 0)
		{
			if (a[i][j] > 0)
			{
				System.out.printf("%d\n",a[i][j]);
			}
			else
			{
				break;
			}
			a[i][j] = -1;
			switch (judge(a, m, n, i, j))
			{
			case 1:
				i--;
				break;
			case 2:
				j++;
				break;
			case 3:
				i++;
				break;
			case 4:
				j--;
				break;
			}
		};
		if (a[i][j] > 0)
		{
			System.out.printf("%d\n",a[i][j]);
		}
		}
	}

}

