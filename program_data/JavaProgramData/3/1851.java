package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int a;
		int b;
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
		for (i = 1;i <= n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		for (a = 1;a < n;a++)
		{
			for (b = a + 1;b <= n;b++)
			{
				if (sz[a] + sz[b] == k)
				{
					System.out.print("yes");
					break;
				}
			}
			if (sz[a] + sz[b] == k)
			{
				break;
			}
			if (a == n - 1)
			{
				System.out.print("no");
			}
		}

		return 0;
	}

}

