package <missing>;

public class GlobalMembers
{
	public static int mycomp(Object e1, Object e2)
	{
		int[] p1 = (int)e1;
		int[] p2 = (int)e2;
		return p1[0] - p2[0];
	}

	public static int[] x = new int[1001];
	public static int[] y = new int[1001];

	public static int Main()
	{
		int n;
		while (scanf("%d", n), n)
		{
			for (int i = 0;i < n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					x + i = tempVar;
				}
			}
			qsort(x,n,(Integer.SIZE / Byte.SIZE),mycomp);
			for (int i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					y + i = tempVar2;
				}
			}
			qsort(y,n,(Integer.SIZE / Byte.SIZE),mycomp);
			int ans = 0;
			int hx;
			int hy;
			int tx;
			int ty;
			hx = hy = 0;
			tx = ty = n - 1;
			while (hx <= tx)
			{
				if (x[hx] > y[hy])
				{
					++ans;
					++hx;
					++hy;
					continue;
				}
				if (x[tx] > y[ty])
				{
					++ans;
					--tx;
					--ty;
					continue;
				}
				if (x[hx] < y[ty])
				{
					--ans;
				}
				else
				{
					if (x[hx] > y[ty])
					{
						++ans;
					}
				}
				++hx;
				--ty;
			}
			System.out.printf("%d\n",ans * 200);
		}
		return 0;
	}
}

