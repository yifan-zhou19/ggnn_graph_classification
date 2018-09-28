package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int m;
		int p;
		int[] sz = new int[1000];
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
		p = 0;
		sz[n] = k;
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
			for (m = n - 1;m > i;m--)
			{
				if (sz[i] + sz[m] == sz[n])
				{
				p = 1;
				}
			}
		}
		if (p == 1)
		{
			System.out.print("yes");
		}
		if (p == 0)
		{
			System.out.print("no");
		}
		return 0;
	}
}

