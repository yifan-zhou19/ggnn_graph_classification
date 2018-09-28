package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[501];
		int[] js = new int[501];
		int n;
		int i;
		int k;
		int a;
		int b;
		k = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
		}
		for (i = 0;i < n;i++)
		{
			if (sz[i] % 2 != 0)
			{
				k = k + 1;
				js[k - 1] = sz[i];
			}
		}
		for (i = 1;i < k;i++)
		{
			a = js[i];
			for (b = i - 1;b >= 0;b--)
			{
				if (a < js[b])
				{
					js[b + 1] = js[b];
					js[b] = a;
				}
				else
				{
					js[b + 1] = a;
					break;
				}
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",(js[i]));
		}
			System.out.printf("%d",(js[k - 1]));
		return 0;
	}

}

