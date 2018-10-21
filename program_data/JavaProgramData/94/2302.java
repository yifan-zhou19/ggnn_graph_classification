package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int[] num = new int[500];
	int n;
	int k = 0;
	int t = 0;
	int e;
	int[] sz = new int[500];
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	for (int i = 0;i < n;i++)
	{
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		num[i] = Integer.parseInt(tempVar2);
	}

	if ((num[i]) % 2 != 0)
	{
	sz[t] = num[i];
	k++;
	t = k;
	}
	}

	for (int m = 1;m <= k;m++)
	{
	for (int a = 0;a < k - m;a++)
	{
	if (sz[a] > sz[a + 1])
	{
	e = sz[a + 1];
	sz[a + 1] = sz[a];
	sz[a] = e;
	}
	}
	}

	for (int b = 0;b < k;b++)
	{
	if (b == k - 1)
	{
	System.out.printf("%d",sz[b]);
	}
	else
	{
	System.out.printf("%d,",sz[b]);
	}

	}
	return 0;
	}



}

