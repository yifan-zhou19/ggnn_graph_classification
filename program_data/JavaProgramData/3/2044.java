package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[1000];
		int n;
		int k;
		int i;
		int r;
		int e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i = i + 1)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		for (i = 0;i < n;i = i + 1)
		{
			for (r = i + 1;r < n;r = r + 1)
			{
				if (sz[i] + sz[r] == k)
				{
					e = 1;
					break;
				}
			}
			if (e == 1)
			{
				break;
			}
		}
		if (e == 1)
		{
			System.out.print("yes");
		}
		if (e == 0)
		{
			System.out.print("no");
		}

		return 0;
	}
}

