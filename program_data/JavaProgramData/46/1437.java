package <missing>;

public class GlobalMembers
{
	public static int Main()
	{

	int i;
	int j;
	int m;
	int n;
	int[][] a = new int[101][101];
	int k = 0;
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
		for (i = 0;k != m * n;i++)
		{
			for (j = i;j < n - i;j++)
			{
			System.out.printf("%d\n",a[i][j]);
			k++;
			if (k == m * n)
			{
			break;
			}
			}
			if (k == m * n)
			{
			break;
			}

			for (j = i + 1;j < m - i;j++)
			{
			System.out.printf("%d\n",a[j][n - 1 - i]);
			k++;
			if (k == m * n)
			{
			break;
			}
			}
			if (k == m * n)
			{
			break;
			}

			for (j = n - i - 2;j >= i;j--)
			{
			System.out.printf("%d\n",a[m - 1 - i][j]);
			k++;
			if (k == m * n)
			{
			break;
			}
			}
			if (k == m * n)
			{
			break;
			}

			for (j = m - i - 2;j > i;j--)
			{
			System.out.printf("%d\n",a[j][i]);
			k++;
			if (k == m * n)
			{
			break;
			}
			}
			if (k == m * n)
			{
			break;
			}
		}
		return 0;
	}

}

