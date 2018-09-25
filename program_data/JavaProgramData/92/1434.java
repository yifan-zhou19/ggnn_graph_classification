package <missing>;

public class GlobalMembers
{
	public static int[] src = new int[1000];
	public static int[] tgt = new int[1000];

	public static int Main()
	{
		int n;
		while (scanf("%d", n) == 1 && n > 0)
		{
			for (int i = 0; i < n; ++i)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					src[i] = Integer.parseInt(tempVar);
				}
			}
			for (int i = 0; i < n; ++i)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					tgt[i] = Integer.parseInt(tempVar2);
				}
			}
			sort(src, src + n);
			sort(tgt, tgt + n);
			int si = 0;
			int sj = n - 1;
			int ti = 0;
			int tj = n - 1;
			int gain = 0;
			while (si <= sj)
			{
				int a = src[si];
				int b = src[sj];
				int c = tgt[ti];
				int d = tgt[tj];
				if (a < c)
				{
					--gain;
					++si;
					--tj;
				}
				else if (a > c)
				{
					++gain;
					++si;
					++ti;
				}
				else if (b < d)
				{
					--gain;
					++si;
					--tj;
				}
				else if (b > d)
				{
					++gain;
					--sj;
					--tj;
				}
				else
				{
					if (a < d)
					{
						--gain;
					}
					++si;
					--tj;
				}
			}
			System.out.printf("%d\n", gain * 200);
		}
	}

}

