package <missing>;

public class GlobalMembers
{
	public static int hangzuida(int sz, int hmax)
	{
				if (sz == hmax)
				{
					return 1;
				}
				else
				{
					return 0;
				}
	}
	public static int liezuixiao(int sz, int lmin)
	{
				if (sz == lmin)
				{
					return 1;
				}
				else
				{
					return 0;
				}
	}
	public static int Main()
	{
		int[][] sz = new int[10][10];
		int H;
		int L;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			H = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(",");
		if (tempVar2 != null)
		{
			L = Integer.parseInt(tempVar2);
		}
		int h;
		int l;
		for (h = 0;h < H;h++)
		{
			for (l = 0;l < L;l++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					sz[h][l] = Integer.parseInt(tempVar3);
				}
			}
		}

		int[] hmax = new int[10];
		int[] lmin = new int[10];
		for (l = 0;l < L;l++)
		{
			lmin[l] = 200;
		}
		for (h = 0;h < H;h++)
		{
			for (l = 0;l < L;l++)
			{
				if (sz[h][l] > hmax[h])
				{
					hmax[h] = sz[h][l];
				}
			}
		}
		for (l = 0;l < L;l++)
		{
			for (h = 0;h < H;h++)
			{
				if (sz[h][l] < lmin[l])
				{
					lmin[l] = sz[h][l];
				}
			}
		}

		int c = 0;
		for (h = 0;h < H;h++)
		{
			for (l = 0;l < L;l++)
			{
				if (hangzuida(sz[h][l], hmax[h]) != 0 && liezuixiao(sz[h][l], lmin[l]) != 0)
				{
					System.out.printf("%d+%d",h,l);
					c = 1;
				}
			}
		}
		if (c == 0)
		{
			System.out.print("No");
		}
		return 0;
	}


}

