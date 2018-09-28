package <missing>;

public class GlobalMembers
{
	public static int[] kh = new int[1000];
	public static int[] th = new int[1000];

	public static int cmp(Object a, Object b)
	{
		return ((int)b - (int)a);
	}
	public static int Main()
	{
		int N;
		int i;
		int j;
		int k;
		int mxt;
		int mxk;
		int w;
		while (scanf("%d", N), N)
		{
			for (i = 0; i < N; ++i)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					th[i] = Integer.parseInt(tempVar);
				}
			}
			qsort(th, i, (Integer.SIZE / Byte.SIZE), cmp);
			for (i = 0; i < N; ++i)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					kh[i] = Integer.parseInt(tempVar2);
				}
			}
			qsort(kh, i, (Integer.SIZE / Byte.SIZE), cmp);

			w = k = j = 0;
			mxk = mxt = N - 1;
			for (i = 0; i < N; ++i)
			{
				if (th[j] > kh[k])
				{
					++w, ++j, ++k;
				}
				else if (th[mxt] > kh[mxk])
				{
					++w, --mxt, --mxk;
				}
				else if (th[mxt] < kh[k])
				{
					--w, --mxt, ++k;
				}
				else
				{
					;
				}
			}
			System.out.printf("%d\n", 200 * w);
		}
		return 0;
	}



}

