package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int x;
		int t;
		int e;
		int b;
		int[] sz = new int[N];
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		t = 0;
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			if (sz[i] % 2 == 0)
			{
			i = i + 0;
			}
			else
			{
				sz[t] = sz[i];
				t++;
			}
		}
		for (int a = 1;a < t;a++)
		{
			for (b = 0;b < t - a;b++)
			{
				if (sz[b] > sz[b + 1])
				{
					e = sz[b + 1];
					sz[b + 1] = sz[b];
					sz[b] = e;
				}
			}
		}
		for (b = 0;b < t - 1;b++)
		{
		System.out.printf("%d,",sz[b]);
		}
		System.out.printf("%d",sz[t - 1]);
		return 0;
	}

}

