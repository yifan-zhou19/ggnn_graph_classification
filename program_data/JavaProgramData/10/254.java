package <missing>;

public class GlobalMembers
{
	public static int max(int[] p, int n)
	{
		int t;
		int m = 0;
		m = p[0];
		p[0] = 0;
		for (t = 0;t < n;t++)
		{
			if (m < p[t])
			{
				m = p[t];
			}
			p[t] = 0;
		}
		return m;
	}
	public static int Main()
	{
		int m;
		int t;
		int p = 0;
		int k;
		int n;
		int[] c = new int[25];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		int[] a = new int[m];
		int[] b = new int[m];
		for (t = 0;t < m;t++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			a[t] = Integer.parseInt(tempVar2);
		}
		}
		b[m - 1] = 1;
		for (t = (m - 2);t > (-1);t--)
		{
			for (n = (t + 1);n < m;n++)
			{
				if (a[t] >= a[n])
				{
					c[p] = b[n];
					p++;
				}
			}
			b[t] = max(c, p) + 1;
			p = 0;
		}
		k = max(b, m);
		System.out.printf("%d",k);

	}
}

