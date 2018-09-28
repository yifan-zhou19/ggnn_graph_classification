package <missing>;

public class GlobalMembers
{
	public static int sum(int m,int n)
	{
		int i;
		int j;
		int[][] sz = new int[100][100];
		int num = 0;
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					sz[i][j] = Integer.parseInt(tempVar);
				}
			}
		}
		for (i = 0,j = 0;j < n;j++)
		{
			num += sz[i][j];
		}
		for (i = m - 1,j = 0;j < n;j++)
		{
			num += sz[i][j];
		}
		for (i = 1,j = 0;i < m - 1;i++)
		{
			num += sz[i][j];
		}
		for (i = 1,j = n - 1;i < m - 1;i++)
		{
			num += sz[i][j];
		}
		return num;
	}

	public static void Main()
	{
		int k;
		int i;
		int num;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			k = Integer.parseInt(tempVar);
		}
		for (i = 0;i < k;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			num = sum(m, n);
			System.out.printf("%d\n",num);
		}
	}
}

