package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[n];
		int[] js = new int[n];
		int p = 0;
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}

			if ((sz[i] % 2) == 1)
			{
				js[p] = sz[i];

				p++;

			}
		}

		for (int w = 1;w < p;w++)
		{
			for (int h = 0;h < (p - w);h++)
			{
				if (js[h] > js[h + 1])
				{
					e = js[h + 1];
					js[h + 1] = js[h];
					js[h] = e;
				}
			}
		}
		for (int y = 0;y < (p);y++)
		{
			if (y < p - 1)
			{
				System.out.printf("%d,",js[y]);
			}
			else
			{
				System.out.printf("%d",js[y]);
			}
		}

		return 0;
	}
}

