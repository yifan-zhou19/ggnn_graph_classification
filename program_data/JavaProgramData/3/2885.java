package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int y;
		int[] sz = new int[1000];
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
		for (int i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		for (int t = 0;t < (n - 1);t++)
		{
			for (int x = t + 1;x < n;x++)
			{
				y = (sz[t]) + (sz[x]);
				if (y == k)
				{
					System.out.print("yes");
					break;
				}
				if (y != k && t != (n - 2))
				{
					continue;
				}
				if (y != k && t == (n - 2))
				{
					System.out.print("no");
				}
			}
			if (y == k || y != k && t == (n - 2))
			{
				break;
			}
		}
		return 0;
	}

}

