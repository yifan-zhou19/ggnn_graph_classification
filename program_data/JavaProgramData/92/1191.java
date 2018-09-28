package <missing>;

public class GlobalMembers
{
	public static final int MAX_N = 1000;
	public static int n;
	public static int[] w = new int[MAX_N];
	public static int[] t = new int[MAX_N];

	public static int cmpInt(Object a, Object b)
	{
		return ((int)a - (int)b);
	}

	public static int Main()
	{
		while (scanf("%d", n), n)
		{
			for (int i = 0; i < n; ++i)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					t + i = tempVar;
				}
			}
			for (int i = 0; i < n; ++i)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					w + i = tempVar2;
				}
			}
			qsort(t, n, (Integer.SIZE / Byte.SIZE), cmpInt);
			qsort(w, n, (Integer.SIZE / Byte.SIZE), cmpInt);

			int win = INT_MIN;
			for (int i = 0; i < n; ++i)
			{
				int twin = 0;
				for (int j = 0; j < n; ++j)
				{
					if (t[j] > w[(i + j) % n])
					{
						twin += 200;
					}
					else if (t[j] < w[(i + j) % n])
					{
						twin -= 200;
					}
				}
				if (twin > win)
				{
					win = twin;
				}
			}
			System.out.printf("%d\n", win);
		}
		return 0;
	}
}

