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
		for (int i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		int p;
		int m;
		for (m = 0;m < n - 1;m++)
		{
			for (p = m + 1;p < n;p++)
			{
				if (k == sz[m] + sz[p])
				{
				break;
				}
			}
			if (p == n)
			{
				continue;
			}
			else if (p < n && k == sz[m] + sz[p])
			{
				System.out.print("yes");
				break;
			}
		}
		if (m == n - 1)
		{
			System.out.print("no");
		}
		return 0;
	}
}

