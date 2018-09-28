package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int e;
		int h;
		int j;
		int k;
		int m;
		h = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int[] sz = new int[501];
		int[] js = new int[501];
		for (i = 0;i < N;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			if (sz[i] % 2 == 1)
			{
				js[h] = sz[i];
				h++;
			};
		}
	//printf("%d",h);
		for (e = 1;e <= h;e++)
		{
			for (m = 0;m < h - 1;m++)
			{
				if (js[m] > js[m + 1])
				{
					j = js[m + 1];
					js[m + 1] = js[m];
					js[m] = j;
				};
			};
		};
		for (k = 0;k < h - 1;k++)
		{
			System.out.printf("%d,",js[k]);
		};
		System.out.printf("%d",js[k]);
		return 0;
	}

}

