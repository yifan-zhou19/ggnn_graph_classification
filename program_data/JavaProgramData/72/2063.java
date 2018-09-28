package <missing>;

public class GlobalMembers
{
	public static int read()
	{
		int i;
		int j;
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
				b[i][j] = 0;
			}
		}
			return 0;
	}
	public static void tj()
	{
		int i;
		int j;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				 if (i == 0)
				 {
					 if (j == 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1])
					 {
						 b[i][j] = 1;
					 }
					else if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i][j - 1])
					{
						b[i][j] = 1;
					}
				 }
				 if (j == 0)
				 {
					 if (i == 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1])
					 {
						 b[i][j] = 1;
					 }
					else if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j])
					{
						b[i][j] = 1;
					}
				 }
				 if (i == m - 1)
				 {
						if (j == n - 1 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1])
						{
							b[i][j] = 1;
						}
					else if (a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1])
					{
						b[i][j] = 1;
					}
				 }
				 if (j == n - 1)
				 {
					 if (i == m - 1 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1])
					 {
						 b[i][j] = 1;
					 }
					else if (a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i - 1][j] != 0 && a[i][j] >= a[i][j - 1])
					{
						b[i][j] = 1;
					}
				 }
				 if (i != 0 && j != 0 && i != m - 1 && j != n - 1 && a[i][j] >= a[i][j - 1] != 0 && a[i][j] >= a[i + 1][j] != 0 && a[i][j] >= a[i][j + 1] != 0 && a[i][j] >= a[i - 1][j])
				 {
					 b[i][j] = 1;
				 }
			}
		}
			return;
	}
	public static void print()
	{
		int i;
		int j;
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					if (b[i][j] == 1)
					{
				 System.out.printf("%d %d\n",i,j);
					}
				}
			}
				return;
	}
	public static int[][] a = new int[20][20];
	public static int[][] b = new int[20][20];
	public static int m;
	public static int n;
	public static int Main()
	{
		read();
		tj();
		print();
		return 0;
	}
}

