package <missing>;

public class GlobalMembers
{
	public static int s(int m)
	{
		int[] a = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[m] = Integer.parseInt(tempVar);
		}
		return a[m];
	}
	public static int p(int m, int i, int[] a)
	{
		int p;
		int q;
		int n;
		for (p = 0;p < m;p++)
		{
			for (q = 0;q < m - 1;q++)
			{
				if (a[q] > a[q + 1])
				{
					n = a[q];
					a[q] = a[q + 1];
					a[q + 1] = n;
				}
			}
		}
		return a[i];
	}
	public static void e(int i, int[] c, int[] d, int m, int n)
	{
		if (i == 0)
		{
			System.out.printf("%d",c[0]);
		}
		if (i > 0 && i < m)
		{
			System.out.printf(" %d",c[i]);
		}
		if (i >= m)
		{
			System.out.printf(" %d",d[i - m]);
		}
	}
	public static int Main()
	{
		int i;
		int m;
		int n;
		int[] a = new int[100];
		int[] b = new int[100];
		int[] c = new int[100];
		int[] d = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			m = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < m;i++)
		{
			a[i] = s(i);
		}
		for (i = 0;i < n;i++)
		{
			b[i] = s(i);
		}
		for (i = 0;i < m;i++)
		{
			c[i] = p(m, i, a);
		}
		for (i = 0;i < n;i++)
		{
			d[i] = p(n, i, b);
		}
		for (i = 0;i < m + n;i++)
		{
			e(i, c, d, m, n);
		}
		return 0;
	}
}

