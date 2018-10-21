package <missing>;

public class GlobalMembers
{
	public static final int N = 110;

	public static int[][] a = new int[N][N];

	public static int Main()
	{
		int i;
		int j;
		int k;
		int x;
		int m;
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			x = Integer.parseInt(tempVar);
		}
		while (x-- != 0)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				n = Integer.parseInt(tempVar3);
			}
			for (i = 0;i < m;i++)
			{
				for (j = 0;j < n;j++)
				{
					String tempVar4 = ConsoleInput.scanfRead();
					if (tempVar4 != null)
					{
						a[i][j] = Integer.parseInt(tempVar4);
					}
				}
			}
			int sum = 0;
			if (m == 1)
			{
				for (i = 0;i < n;i++)
				{
					sum += a[0][i];
				}
			}
			else if (n == 1)
			{
				for (i = 0;i < m;i++)
				{
					sum += a[i][0];
				}
			}
			else
			{
				for (i = 0;i < n;i++)
				{
				sum += a[0][i];
				sum += a[m - 1][i];
				}
				for (i = 1;i < m - 1;i++)
				{
				sum += a[i][0];
				sum += a[i][n - 1];
				}
			}
			System.out.printf("%d\n",sum);
		}
		return 0;
	}
}

