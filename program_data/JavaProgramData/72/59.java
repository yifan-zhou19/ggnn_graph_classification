package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int[][] a = new int[20][20];
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
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				int t = 1;
				if (i - 1 >= 0)
				{
					if (a[i][j] < a[i - 1][j])
					{
						t = 0;
					}
				}
				if (i + 1 < m)
				{
					if (a[i][j] < a[i + 1][j])
					{
						t = 0;
					}
				}
				if (j - 1 >= 0)
				{
					if (a[i][j] < a[i][j - 1])
					{
						t = 0;
					}
				}
				if (j + 1 < n)
				{
					if (a[i][j] < a[i][j + 1])
					{
						t = 0;
					}
				}
				if (t == 1)
				{
					System.out.printf("%d %d\n",i,j);
				}
			}
		}
		return 0;
	}
}

