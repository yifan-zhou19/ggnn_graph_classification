package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int a;
	int b;
	int e;
	int[] sz = new int[100];
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
			sz[i] = Integer.parseInt(tempVar2);
		}
	}
	if (n % 2 == 1)
	{
	a = (n - 1) / 2;
	for (i = 0;i < a;i++)
	{
	e = sz[n - 1 - i];
	sz[n - 1 - i] = sz[i];
	sz[i] = e;
	}
	}
	else
	{
	b = n / 2;
	for (i = 0;i < b;i++)
	{
	e = sz[n - 1 - i];
	sz[n - 1 - i] = sz[i];
	sz[i] = e;
	}
	}
	for (i = 0;i < n - 1;i++)
	{
		System.out.printf("%d ",sz[i]);
	}
	System.out.printf("%d",sz[n - 1]);
	return 0;
	}

}

