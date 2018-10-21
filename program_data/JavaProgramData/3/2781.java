package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int j;
		int[] sz = new int[1001];
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
				(sz[i]) = Integer.parseInt(tempVar3);
			}
		}
		int l = 0;
		while (l < n - 1)
		{
			j = l + 1;
		while (j < n)
		{
		if (sz[l] + sz[j] == k)
		{
			System.out.print("yes");
		return 0;
		}
		j++;
		}
		l++;
		}
		System.out.print("no");
		return 0;
	}

}

