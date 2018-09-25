package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
		void toy(int d[1000],int e);
		void tx(int f[1000],int g[1000],int h,int k);
		int n;
		int m;
		int i;
		int[] a = new int[1000];
		int[] b = new int[1000];
		int[] c = new int[1000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			a[i] = Integer.parseInt(tempVar3);
		}
		}
		for (i = 0;i < m;i++)
		{
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			b[i] = Integer.parseInt(tempVar4);
		}
		}
		toy(a, n);
		toy(b, m);
		tx(a, b, n, m);
		System.out.printf("%d",a[0]);
		for (i = 1;i < n + m;i++)
		{
		System.out.printf(" %d",a[i]);
		}
	}
	public static void toy(int[] d, int e)
	{
		int p;
		int q;
		int r;
		for (p = 0;p < e-1;p++)
		{
			for (q = e-2;q >= 0;q--)
			{
				if (d[q] > d[q + 1])
				{
					r = d[q];
					d[q] = d[q + 1];
					d[q + 1] = r;
				}
			}
		}
	}
	public static void tx(int[] f, int[] g, int h, int k)
	{
		int x;
		for (x = h;x < h + k;x++)
		{
		f[x] = g[x - h];
		}
	}
}

