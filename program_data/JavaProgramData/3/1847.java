package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int i;
		int m;
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
		int[] sz = new int[1000];
		for (i = 0;i < n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			sz[n - 1] = Integer.parseInt(tempVar4);
		}
		int a = 0;
		for (a = 0;a < n;a++)
		{
			m = 0;
			for (i = a + 1;i < n;i++)
			{
				if (sz[a] + sz[i] == k)
				{
					m = 1;
				System.out.print("yes");
				break;
				}
			}
			if (m == 1)
			{
				break;
			}
		}
		if (m == 0)
		{
			System.out.print("no");
		}
		return 0;
	}
}

