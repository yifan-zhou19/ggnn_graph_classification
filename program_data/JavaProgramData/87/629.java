package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] a = new int[MAX];
		int[] b = new int[MAX];
		int[] c = new int[MAX];
		int[] d = new int[MAX];
		int[] e = new int[MAX];
		int[] f = new int[MAX];
		int[] g = new int[MAX];
	int n;
	int m;
	int t;
	int k;
	int sum;
	int mus;
	int result;
		for (n = 0;n < MAX;n++)
		{
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		a[n] = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		b[n] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		c[n] = Integer.parseInt(tempVar3);
	}
	String tempVar4 = ConsoleInput.scanfRead();
	if (tempVar4 != null)
	{
		d[n] = Integer.parseInt(tempVar4);
	}
	String tempVar5 = ConsoleInput.scanfRead();
	if (tempVar5 != null)
	{
		e[n] = Integer.parseInt(tempVar5);
	}
	String tempVar6 = ConsoleInput.scanfRead();
	if (tempVar6 != null)
	{
		f[n] = Integer.parseInt(tempVar6);
	}
	if (a[n] == 0 && b[n] == 0 && c[n] == 0 && d[n] == 0 && e[n] == 0 && f[n] == 0)
	{
	break;
	}
		}
		for (k = 0;k < n;k++)
		{
			g[k] = d[k] + 12;
		}
		for (t = 0;t < n;t++)
		{
			sum = a[t] * 3600 + b[t] * 60 + c[t];
			mus = g[t] * 3600 + e[t] * 60 + f[t];
			result = mus - sum;
	System.out.printf("%d\n",result);
		}
	return 0;
	}
}

