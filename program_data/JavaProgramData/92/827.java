package <missing>;

public class GlobalMembers
{
	public static int[] tianji = new int[1010];
	public static int[] qiwang = new int[1010];

	public static int mycomp(Object elem1, Object elem2)
	{
		return *((int)elem2) - (int)elem1;
	}

	public static int Main()
	{
		int n;
		while (scanf("%d", n))
		{
			if (n == 0)
			{
				break;
			}
			for (int i = 0;i < n;i++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					tianji[i] = Integer.parseInt(tempVar);
				}
			}
			for (int i = 0;i < n;i++)
			{
				String tempVar2 = ConsoleInput.scanfRead();
				if (tempVar2 != null)
				{
					qiwang[i] = Integer.parseInt(tempVar2);
				}
			}
			qsort(tianji, n, (Integer.SIZE / Byte.SIZE), mycomp);
			qsort(qiwang, n, (Integer.SIZE / Byte.SIZE), mycomp);
			int ts = 0;
			int te = n - 1;
			int qs = 0;
			int qe = n - 1;
			int win = 0;
			while (ts <= te)
			{
				if (tianji[ts] > qiwang[qs])
				{
					win++;
					ts++;
					qs++;
				}
				else if (tianji[ts] < qiwang[qs])
				{
					win--;
					te--;
					qs++;
				}
				else if (tianji[te] > qiwang[qe])
				{
					win++;
					te--;
					qe--;
				}
				else if (tianji[te] < qiwang[qe])
				{
					win--;
					te--;
					qs++;
				}
				else
				{
					if (tianji[te] < qiwang[qs])
					{
						win--;
					}
					te--;
					qs++;
				}
			}
			System.out.printf("%d\n", win * 200);
		}
		return 0;
	}
}

