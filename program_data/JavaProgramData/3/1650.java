package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
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
		int i;
		for (i = 0;i < n;i += 1)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar3);
			}
		}
	for (int l = 0;l <= n - 1;l += 1)
	{
		for (i = 1;i < n;i += 1)
		{
			if (sz[l] + sz[i] == k)
			{
		System.out.print("yes");
		return 0;
			}
		}
	if (l == n - 1)
	{
		System.out.print("no");
	}
	}






		return 0;
	}
}

