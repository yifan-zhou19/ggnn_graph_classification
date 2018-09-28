package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int t;
		int M;
		int N;
		int i;
		int m;
		int n;
		int[][] a = new int[30][30];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= t;i++)
		{
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(a,0,(Integer.SIZE / Byte.SIZE));
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				M = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				N = Integer.parseInt(tempVar3);
			}
			for (m = 0;m <= M;m++)
			{
				for (n = 1;n <= N;n++)
				{
					if (m == 0 || m == 1 || n == 1)
					{
						a[m][n] = 1;
					}
					else
					{
						if (m >= n)
						{
							a[m][n] = a[m - n][n] + a[m][n - 1];
						}
						else
						{
							a[m][n] = a[m][n - 1];
						}
					}
				}
			}
			System.out.printf("%d\n",a[M][N]);
		}
		return 0;
	}
}

