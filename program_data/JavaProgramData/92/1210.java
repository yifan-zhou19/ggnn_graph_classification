package <missing>;

public class GlobalMembers
{
	public static int[] a = new int[1001];
	public static int[] b = new int[1001];
	public static int[][] f = new int[1001][1001];

	public static int cmp(Object x, Object y)
	{
		return *((int)y) - (int)x;
	}
	public static int find(int i,int j)
	{
		if (a[i] > b[j])
		{
			return 200;
		}
		if (a[i] == b[j])
		{
			return 0;
		}
		return -200;
	}
	public static int maxS(int aa,int bb)
	{
		return aa > bb != 0?aa:bb;
	}

	public static int Main()
	{
		int n;
		int i;
		int j;

		while (scanf("%d", n) && n != 0)
		{

			for (i = 0;i < n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					a + i = tempVar;
				}
			}
			for (i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					b + i = tempVar2;
				}
			}

			qsort(a,n,(Integer.SIZE / Byte.SIZE),cmp);
			qsort(b,n,(Integer.SIZE / Byte.SIZE),cmp);

			for (i = 0;i < n;i++)
			{
				f[i][0] = find(0, i);
			}
			for (i = n - 2;i >= 0;i--)
			{
				for (j = 1;j < n - i;j++)
				{
					if (b[i + j] > a[j])
					{
						f[i][j] = f[i + 1][j - 1] - 200;
					}
					else if (b[i + j] < a[j])
					{
						f[i][j] = f[i][j - 1] + 200;
					}
					else if (f[i + 1][j - 1] - 200 > f[i][j - 1])
					{
						f[i][j] = f[i + 1][j - 1] - 200;
					}
					else
					{
						f[i][j] = f[i][j - 1];
					}
				}
			}

			System.out.printf("%d\n",f[0][n - 1]);
		}
		return 0;
	}
}

