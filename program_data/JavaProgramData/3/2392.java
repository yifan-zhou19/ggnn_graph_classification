package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int t;
		int j;
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
		for (t = 0;t < n - 1;t++)
		{
			for (j = t + 1;j < n;j++)
			{
				if (sz[t] + sz[j] == k)
				{
					System.out.print("yes");
					break;
				}
			}
			if (j < n)
			{
				break;
			}
		}
		if (t == n - 1)
		{
			System.out.print("no");
		}
		return 0;
	}

}

