package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		int i;
		int j;
		int[][] ar = new int[8][8];
		int[][] a = new int[8][8];
		int[][] b = new int[8][8];
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					ar[i][j] = Integer.parseInt(tempVar3);
				}
				a[i][j] = ar[i][j];
				b[i][j] = ar[i][j];
			}
		}
		int k;
		int x;
		for (i = 0;i < n;i++)
		{
			for (k = 1;k < m;k++)
			{
				for (j = 0;j < m - k;j++)
				{
					if (b[i][j] < b[i][j + 1])
					{
						x = b[i][j];
						b[i][j] = b[i][j + 1];
						b[i][j + 1] = x;
					}
				}
			}
		}
		for (j = 0;j < m;j++)
		{
			for (k = 1;k < n;k++)
			{
				for (i = 0;i < n - k;i++)
				{
					if (a[i][j] > a[i + 1][j])
					{
						x = a[i][j];
						a[i][j] = a[i + 1][j];
						a[i + 1][j] = x;
					}
				}
			}
		}
		int tag = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < m;j++)
			{
				if ((ar[i][j] == a[0][j]) && (ar[i][j] == b[i][0]))
				{
					System.out.printf("%d+%d",i,j);
					tag = 1;
				}
			}
		}
		if (tag == 0)
		{
			System.out.print("No");
		}
		return 0;
	}
}

