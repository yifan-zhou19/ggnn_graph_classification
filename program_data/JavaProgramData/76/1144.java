package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int k;
	int i;
	int m;
	int l;
	int p = 0;
	int q;
	int x;
	int e;
	int n;
	int d;
	int s;
	int[] a = new int[50000];
	int[] b = new int[50000];
	int[] c = new int[50000];
	int[] g = new int[50000];
	int[] r = new int[50000];
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
		a[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead(" ");
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	}
	for (i = 0;i < n;i++)
	{
	g[i] = a[i];
	r[i] = b[i];
	}
	for (k = 1;k <= n;k++)
	{
		for (i = 0;i < n - k;i++)
		{
			if (g[i] > g[i + 1])
			{
			e = g[i + 1];
			g[i + 1] = g[i];
			g[i] = e;
			}
		}
	}
	d = g[0];
	for (k = 1;k <= n;k++)
	{
		for (i = 0;i < n - k;i++)
		{
			if (r[i] < r[i + 1])
			{
			m = r[i + 1];
			r[i + 1] = r[i];
			 r[i] = m;
			}
		}
	}
	x = r[0];
	for (i = g[0];i <= r[0];i++)
	{
		c[i] = 1;
	}
	for (i = 0;i < n;i++)
	{
		for (q = a[i];q <= b[i];q++)
		{
			c[q] = c[q] - 1;
		}
	}
	for (i = 1;i < n;i++)
	{
		if (c[g[i]] >= 0 || c[r[i]] >= 0)
		{
		p = p + 1;
		}
	}
	if (p > 0)
	{
	System.out.print("no");
	}
	else
	{

		System.out.printf("%d %d",d,x);
	}
	return 0;
	}
}

