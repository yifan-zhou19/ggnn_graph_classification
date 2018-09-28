package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[LEN];
		for (int t = 0;t < n;t++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[t] = Integer.parseInt(tempVar2);
			}
		}
		for (int m = 0;m < n;m++)
		{
			int e;
			for (int i = 0;i < n - m;i++)
			{
				if (sz[i] > sz[i + 1])
				{
					e = sz[i + 1];
					sz[i + 1] = sz[i];
					sz[i] = e;
				}
			}
		}
		int[] xsz = new int[LEN];
		int p = 0;
		for (int q = 0;q < n;q++)
		{
			int s;
			s = (sz[q]) % 2;
			if (s == 1)
			{
				xsz[p] = sz[q];
				p++;
			}
		}
		for (int r = 0;r < p - 1;r++)
		{
			System.out.printf("%d,",xsz[r]);
		}
		System.out.printf("%d",xsz[p - 1]);
		return 0;
	}
}

