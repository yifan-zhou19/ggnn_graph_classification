package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int m;
	int e;
	int f;
	int g;
	double p;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[n];
	int[] b = new int[n];
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		a[i] = Integer.parseInt(tempVar2);
	}
	String tempVar3 = ConsoleInput.scanfRead();
	if (tempVar3 != null)
	{
		b[i] = Integer.parseInt(tempVar3);
	}
	}
	e = b[0];
	for (i = 1;i < n;i++)
	{
	if (b[i] > e)
	{
	e = b[i];
	}
	}
	f = a[0];
	for (i = 1;i < n;i++)
	{
	if (a[i] < f)
	{
	f = a[i];
	}
	}
	int[] sz = new int[e - f + 1];
	int[] tz = new int[e - f + 1];
	for (i = 0;i <= e - f;i++)
	{
	sz[i] = 0;
	tz[i] = 0;
	}
	for (i = f;i <= e;i = i + 1)
	{
	for (m = 0;m < n;m++)
	{
	if (i > b[m] || i < a[m])
	{
	sz[i - f] = sz[i - f] + 1;
	}
	}
	}
	for (i = f;i < e;i++)
	{
	p = i + 0.5;
	for (m = 0;m < n;m++)
	{
	if (p > b[m] || p < a[m])
	{
	tz[i - f] = tz[i - f] + 1;
	}
	}
	}
	for (i = 0;i <= e - f;i++)
	{
	if (sz[i] == n || tz[i] == n)
	{
	System.out.print("no");
	return 0;
	}
	}
	System.out.printf("%d ",f);
	System.out.printf("%d",e);
	return 0;
	}
}

