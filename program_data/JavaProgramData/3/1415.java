package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[1000];
		int i;
		int r;
		int s;
		int sh = 0;
		int n;
		int k;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		for (r = 1;r <= n;r++)
		{
			int e;
			for (s = 0;s < n - r;s++)
			{
				if (sz[s] > sz[s + 1])
				{
					e = sz[s + 1];
					sz[s + 1] = sz[s];
					sz[s] = e;
				}
			}
		}
		for (int y = 0;y < n;y++)
		{
			if (sz[y] + sz[y] == k)
			{
				 sh = 0;
			}
			else if (sz[y] + sz[y] > k)
			{
				for (int w = 0;w < y;w++)
				{
					if (sz[y] + sz[w] == k)
					{
						sh = 1;
						break;
					}
				}
			}
			else if (sz[y] + sz[y] < k)
			{
				for (int w = y + 1;w <= n;w++)
				{
					if (sz[y] + sz[w] == k)
					{
						sh = 1;
						break;
					}
				}
			}
		}
			if (sh == 0)
			{
				System.out.print("no");
			}
			else
			{
				System.out.print("yes");
			}
			return 0;
	}

}

