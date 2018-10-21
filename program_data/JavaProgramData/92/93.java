package <missing>;

public class GlobalMembers
{
	public static final int maxn = 1010;
	public static final int minl = -999999999;
	public static int Max(int a,int b)
	{
		return a > b != 0?a:b;
	}
	public static int[][] f = new int[maxn][maxn];
	public static int[] a = new int[maxn];
	public static int[] b = new int[maxn];
	public static int n;
	public static int cmp(Object a, Object b)
	{
		return *((int)b) - (int)a;
	}
	public static void dp()
	{
		int i;
		int j;
		int k;
		for (i = 0;i <= n;i++)
		{
			for (j = 0;j <= n;j++)
			{
				f[i][j] = minl;
			}
		}
		f[0][0] = 0;
		for (i = 0;i < n;i++)
		{
			for (j = 0;j <= i;j++)
			{
				if (f[i][j] >= -n)
				{
				if (b[i + 1] < a[j + 1])
				{
					f[i + 1][j + 1] = Max(f[i + 1][j + 1], f[i][j] + 1);
				}
				if (b[i + 1] > a[j + 1])
				{
					f[i + 1][j] = Max(f[i + 1][j], f[i][j] - 1);
				}
				if (b[i + 1] == a[j + 1])
				{
					f[i + 1][j + 1] = Max(f[i + 1][j + 1], f[i][j]);
					if (b[i + 1] > a[n - (i - j)])
					{
						f[i + 1][j] = Max(f[i + 1][j], f[i][j] - 1);
					}
					else if (b[i + 1] == a[n - (i - j)])
					{
						f[i + 1][j] = Max(f[i + 1][j], f[i][j]);
					}
				}
				}
			}
		}
		k = -n;
		for (i = 0;i <= n;i++)
		{
			k = Max(k, f[n][i]);
		}
		System.out.printf("%d\n",k * 200);
	}
	public static int Main()
	{
		//freopen("in.in","r",stdin);
		while (scanf("%d",n),n)
		{
			int i;
			for (i = 1;i <= n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a + i = tempVar;
				}
			}
			for (i = 1;i <= n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					b + i = tempVar2;
				}
			}
			qsort(a + 1,n,(Integer.SIZE / Byte.SIZE),cmp);
			qsort(b + 1,n,(Integer.SIZE / Byte.SIZE),cmp);
			dp();
		}
		return 0;
	}
}

