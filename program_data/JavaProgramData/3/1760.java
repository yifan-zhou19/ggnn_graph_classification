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
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			k = Integer.parseInt(tempVar2);
		}
		int[] sz = new int[1000];
		int i;
		for (i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		int j;
		int e;
		int a;
		for (j = 1;j < n;j++)
		{
			for (i = 0;i < n - j;i++)
			{
				if (sz[i] > sz[i + 1])
				{
					e = sz[i];
					sz[i] = sz[i + 1];
					sz[i + 1] = e;
				}
			}
		}
		a = 0;
		if (sz[n - 1] + sz[n - 2] < k)
		{
			System.out.print("no");
		}
		else
		{
			if (sz[0] + sz[1] > k)
			{
				System.out.print("no");
			}
			else
			{
				for (i = 0;i < n - 1;i++)
				{
					for (j = i + 1;j < n;j++)
					{
						if (sz[i] + sz[j] == k)
						{
							System.out.print("yes");
							a = 1;
							break;
						}
					}
					if (a == 1)
					{
						break;
					}
				}
				if (a == 0)
				{
					System.out.print("no");
				}
			}
		}
		return 0;
	}
}

