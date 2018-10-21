package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int a;
	int n;
	int i;
	int e;
	int j = 0;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	j = n;
	int[] sz = new int[500];
	for (i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		sz[i] = Integer.parseInt(tempVar2);
	}
	}
	for (i = 0;i < n;i++)
	{
	if (sz[i] % 2 == 0)
	{
	sz[i] = 0;
	j = j - 1;
	}
	}
	for (a = 1;a <= n;a++)
	{
	for (i = 0;i < n - a;i++)
	{
	if (sz[i] > sz[i + 1])
	{
	e = sz[i + 1];
	sz[i + 1] = sz[i];
	sz[i] = e;
	}
	}
	}
	for (i = n - j;i < n - 1;i++)
	{

	System.out.printf("%d,",sz[i]);
	}
	System.out.printf("%d",sz[n - 1]);
	return 0;
	}
}

