package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1100];
	public static int[] b = new int[1100];
	public static int[][] f = new int[1100][1100];
	public static int n;
	public static int ans;
	public static int max(int a,int b)
	{
		if (a > b)
		{
			return a;
		}
		return b;
	}
	public static int Main()
	{
		int i;
		int j;
		int k;
		while (scanf("%d",n) && n != 0)
		{
			for (i = 1;i <= n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					b[i] = Integer.parseInt(tempVar);
				}
			}
			for (i = 1;i <= n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					a[i] = Integer.parseInt(tempVar2);
				}
			}
			sort(a + 1,a + n + 1);
			sort(b + 1,b + n + 1);
			for (i = 1;i <= n;i++)
			{
				if (b[i] > a[1])
				{
					f[i][i] = 1;
				}
				else if (b[i] < a[1])
				{
					f[i][i] = -1;
				}
				else
				{
					f[i][i] = 0;
				}
			}
			for (k = 2;k <= n;k++)
			{
				for (i = 1;i <= n;i++)
				{
					j = i + k - 1;
					if (j > n)
					{
						break;
					}
					if (b[j] > a[k])
					{
						f[i][j] = f[i][j - 1] + 1;
					}
					else if (b[j] < a[k])
					{
						f[i][j] = f[i + 1][j] - 1;
					}
					else
					{
						f[i][j] = max(f[i][j - 1], f[i + 1][j] - 1);
					}
				}
			}
			System.out.printf("%d\n",f[1][n] * 200);

		}
		return 0;
	}


}

