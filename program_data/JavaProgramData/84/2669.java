package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int e;
	int i;
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
			(sz[i]) = Integer.parseInt(tempVar2);
		}
	}
	if (n == 2)
	{
		if (sz[0] < sz[1])
		{
			e = sz[1];
			sz[1] = sz[0];
			sz[0] = e;
		}
	}
		for (i = 2;i < n;i++)
		{
			if (sz[0] < sz[1])
			{
			e = sz[1];
			sz[1] = sz[0];
			sz[0] = e;
			}
			if (sz[i] > sz[0])
			{
				e = sz[0];
				sz[0] = sz[i];
				sz[1] = e;
			}
			else if ((sz[0] > sz[i]) && (sz[i] > sz[1]))
			{
				sz[1] = sz[i];
			}
		}
	System.out.printf("%d\n%d\n",sz[0],sz[1]);
	return 0;
	}

}

