package <missing>;

public class GlobalMembers
{
	public static void Matrix(int[][] a, int srow, int scol, int erow, int ecol)
	{
		int i;
		int j;
		for (i = scol;i <= ecol;i++)
		{
			System.out.printf("%d\n",a[srow][i]);
		}
		for (i = srow + 1;i <= erow;i++)
		{
			System.out.printf("%d\n",a[i][ecol]);
		}
		if (erow > srow)
		{
			for (i = ecol - 1;i >= scol;i--)
			{
				System.out.printf("%d\n",a[erow][i]);
			}
		}
		if (ecol > scol)
		{
			for (i = erow - 1;i >= srow + 1;i--)
			{
				System.out.printf("%d\n",a[i][scol]);
			}
		}
		if (erow - srow >= 2 && ecol - scol >= 2)
		{
			Matrix(a, srow + 1, scol + 1, erow - 1, ecol - 1);
		}
	}
	public static int Main()
	{
		int[][] a = new int[100][100];
		int i;
		int j;
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
		Matrix(a, 0, 0, m - 1, n - 1);
	}
}

