package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int[] sz = new int[N];
	int[] an = new int[X];
	int j = 0;
	int i = 0;
	int m = 0;
	int a = 0;
	int b = 0;
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
		(sz[i]) = Integer.parseInt(tempVar2);
	}
	}
	for (m = 0;m < n;m++)
	{
	if (sz[m] % 2 == 0)
	{
	continue;
	}
	else
	{
	an[j] = sz[m];
	j = j + 1;
	}
	}
	for (int k = 1;k <= j;k++)
	{
	int e;
	for (int a = 0;a < j - k;a++)
	{
	if (an[a] > an[a + 1])
	{
	e = an[a + 1];
	an[a + 1] = an[a];
	an[a] = e;
	}
	}
	}
	for (b = 0;b < j - 1;b++)
	{
	System.out.printf("%d,",an[b]);
	}
	System.out.printf("%d",an[j - 1]);
	return 0;
	}

}

