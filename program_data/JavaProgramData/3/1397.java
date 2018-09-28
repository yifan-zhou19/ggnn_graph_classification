package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int k;
	int i;
	int t;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	String tempVar2 = ConsoleInput.scanfRead();
	if (tempVar2 != null)
	{
		k = Integer.parseInt(tempVar2);
	}
	int[] sz = new int[1000];
	for (i = 0;i < n;i++)
	{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz[i] = Integer.parseInt(tempVar3);
		}
	}

	for (i = 0;i < n;i++)
	{
		for (t = 0;t < n;t++)
		{
			if (sz[i] + sz[t] == k)
			{
			System.out.print("yes");
			break;
			}
		}
		if (sz[i] + sz[t] == k)
		{
			break;
		}
	}
	if (i == n && t == n)
	{
		System.out.print("no");
	}

	return 0;
	}
}

