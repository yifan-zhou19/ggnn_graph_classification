package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1005];
	public static int[] b = new int[1005];
	public static int[][] w = new int[1005][1005];

	public static int Main()
	{
		int i;
		int j;
		int n;
		//freopen("input.txt", "r", stdin);
		while (scanf("%d", n) == 1)
		{
			if (n <= 0)
			{
				return 0;
			}
			for (i = 1 ; i <= n ; i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					b[i] = Integer.parseInt(tempVar);
				}
			}
			for (i = 1 ; i <= n ; i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			sort(a + 1, a + n + 1);
			sort(b + 1, b + n + 1);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
			memset(w, -100, (Integer.SIZE / Byte.SIZE));
			for (i = 0 ; i <= n + 1 ; i++)
			{
				w[n + 1][i] = 0;
			}
			for (i = n; i >= 1 ; i--)
			{
				w[i][n + 1] = w[i + 1][n + 1] - 1;
				for (j = n ; j >= i ; j--)
				{
					if (a[i] < b[j])
					{
						w[i][j] = w[i + 1][j + 1] + 1;
					}
					else if (a[i] == b[j])
					{
						w[i][j] = Math.max(w[i + 1][j + 1], w[i + 1][j] - 1);
					}
					else
					{
						w[i][j] = w[i + 1][j] - 1;
					}
					w[i][j] = Math.max(w[i][j], w[i][j + 1]);
				}
			}

			//for( i=1 ; i<=n+1 ; i++ )
			//{
			//	for( j=1 ; j<=n+1 ;j ++ )
			//		printf("%3d ", w[i][j]);
			//	puts("");
			//}
		/*	for( i=0, result=-20060311 ; i<=n ; i++ )
				result=max(result, w[1][i]);*/
			System.out.printf("%d\n", w[1][1] * 200);
		}
	}
}

