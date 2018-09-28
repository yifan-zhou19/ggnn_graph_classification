package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int k;
	int q;
	int p;
	int e;
	int w;
	j = -1;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	int[] sz = new int[500];
	int[] zs = new int[500];
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		(sz[i]) = Integer.parseInt(tempVar2);
	}
	if (sz[i] % 2 != 0)
	{
	j = j + 1;
	zs[j] = sz[i];
	}
	}
	for (k = 1;k <= j + 1;k++)
	{
	q = 0;
	for (int p = 0;p <= j + 1 - k;p++)
	{
	if (zs[p] > zs[q])
	{
	q = p;
	}
	if (q != j - k + 1)
	{
	e = zs[q];
	zs[q] = zs[j - k + 1];
	zs[j - k + 1] = e;
	}
	}
	}
	for (w = 0;w <= j;w++)
	{
	if (w != j)
	{
	System.out.printf("%d,",zs[w]);
	}
	else
	{
	System.out.printf("%d",zs[w]);
	}
	}
	return 0;
	}


}

