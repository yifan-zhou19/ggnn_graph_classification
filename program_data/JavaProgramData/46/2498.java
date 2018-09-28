package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int k;
		int j;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		'\n';
		int[][] sz = new int[100][100];
		int[] a = new int[10000];
		for (i = 0;i < row;i++)
		{
			for (k = 0;k < col;k++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[i][k] = Integer.parseInt(tempVar3);
				}
			}
			'\n';
		}
		j = 0;
		for (i = 0;i < col - 1;i = i + 2)
		{
			m = i / 2;
			for (k = m;k < col - m - 1;k++)
			{
				a[j] = sz[m][k];
				j++;
			}
			for (k = m;k < row - m - 1;k++)
			{
				a[j] = sz[k][col - m - 1];
				j++;
			}
			for (k = col - m - 1;k > m;k--)
			{
				a[j] = sz[row - m - 1][k];
				j++;
			}
			for (k = row - m - 1;k > m;k--)
			{
				a[j] = sz[k][m];
				j++;
			}
		}
		if (col % 2 == 1)
		{
			m = i / 2;
			for (k = m;k < row - m;k++)
			{
				a[j] = sz[k][(col - 1) / 2];
				j++;
			}
		}
		for (i = 0;i < row * col - 1;i++)
		{
			System.out.printf("%d\n",a[i]);
		}
		System.out.printf("%d",a[row * col - 1]);
		return 0;
	}
}

