package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int e;
		int i;
		int m = 0;
		int q;
		int[] sz = new int[500];
		int[] js = new int[500];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < N;i++)
		{
			if (sz[i] % 2 == 1)
			{
				js[m] = sz[i];
				m++;
			}
		}
		for (int k = 1;k <= m;k++)
		{
			for (q = 0;q < m - k;q++)
			{
			if (js[q] > js[q + 1])
			{
				e = js[q + 1];
				js[q + 1] = js[q];
				js[q] = e;
			}
			}
		}
		for (i = 0;i < m;i++)
		{
			if (i < m - 1)
			{
				System.out.printf("%d,",js[i]);
			}
			else
			{
				System.out.printf("%d",js[i]);
			}
		}
		return 0;
	}

}

