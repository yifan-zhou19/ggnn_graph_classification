package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j = 0;
		int c = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[n];
		int[] js = new int[501];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < 501;i++)
		{
			js[i] = 0;
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] % 2 == 1)
			{
				js[j] = sz[i];
				j++;
				c++;
			}
		}
		int e;
		int k;
		for (k = 1;k <= c;k++)
		{
			for (i = 0;i < c - k;i++)
			{
				if (js[i] > js[i + 1])
				{
					e = js[i + 1];
					js[i + 1] = js[i];
					js[i] = e;
				}
			}
		}
		for (i = 0;i < c - 1;i++)
		{
			System.out.printf("%d,",js[i]);
		}
		System.out.printf("%d",js[c - 1]);
		return 0;
	}

}

