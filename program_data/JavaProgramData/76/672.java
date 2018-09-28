package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	int t;
	int s;
	int e;
	int l;
	int m = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] a = new int[50000];
	int[] b = new int[50000];
	int[] c = new int[10000];
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
	for (i = 0;i < n;i++)
	{
	for (j = a[i];j < b[i];j++)
	{
	c[j] = 1;
	}
	}
	for (k = 1;k <= n;k++)
	{
	for (i = 0;i < n - k;i++)
	{
	if (a[i] > a[i + 1])
	{
	t = a[i + 1];
	a[i + 1] = a[i];
	a[i] = t;
	}
	}
	}
	for (k = 1;k <= n;k++)
	{
	for (i = 0;i < n - k;i++)
	{
	if (b[i] > b[i + 1])
	{
	t = b[i + 1];
	b[i + 1] = b[i];
	b[i] = b[i + 1];
	}
	}
	}
	s = a[0];
	e = b[n - 1];
	l = e - s;
	for (i = s;i < e;i++)
	{
	m = m + c[i];
	}
	if (l == m)
	{
	System.out.printf("%d %d",s,e);
	}
	else
	{
	System.out.print("no");
	}

	}
}

