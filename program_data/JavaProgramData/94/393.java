package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int m;
		int k;
		int c;
		m = 0;
		int[] sz = new int[LEN];
		int[] p = new int[LEN];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0; i < n; i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		m = 0;
		for (i = 0; i < n; i++)
		{
			if (sz[i] % 2 != 0)
			{
			p[m] = sz[i];
			m++;
			}
		}
		c = m;
		int maxIndex;
		int e;
		for (k = 1;k <= c; k++)
		{
		maxIndex = 0;
		for (m = 0; m <= c - k; m++)
		{
				if (p[m] > p[maxIndex])
				{
						maxIndex = m;
				}
		}
		if (maxIndex != c - k)
		{
			e = p[maxIndex];
			p[maxIndex] = p[c - k];
			p[c - k] = e;
		}
		}

		for (m = 0; m < c - 1; m++)
		{
			System.out.printf("%d,",p[m]);
		}
	   System.out.printf("%d",p[m]);
		return 0;
	}
}

