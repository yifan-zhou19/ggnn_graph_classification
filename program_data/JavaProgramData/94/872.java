package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[500];
		int[] js = new int[500];
		int n;
		int i;
		int k;
		int x = 0;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i = i + 1)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i = i + 1)
		{
			if (sz[i] % 2 == 1)
			{
				js[x] = sz[i];
				x = x + 1;
			}
		}
		for (k = 1;k <= x;k = k + 1)
		{
			for (i = 0;i < x - k;i = i + 1)
			{
				if (js[i] > js[i + 1])
				{
					e = js[i];
					js[i] = js[i + 1];
					js[i + 1] = e;
				}
			}
		}
		for (i = 0;i < x;i = i + 1)
		{
			if (i < x - 1)
			{
				System.out.printf("%d,",js[i]);
			}
			else if (i = x - 1)
			{
				System.out.printf("%d",js[i]);
			}
		}

		return 0;
	}
}

