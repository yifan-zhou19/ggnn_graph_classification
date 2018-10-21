package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int t;
		int m;
		int[] sz = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz[i] = Integer.parseInt(tempVar2);
		}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		t = 0;
		for (i = 0;i < n;i++)
		{
			if (sz[i] == k)
			{
			t = t + 1;
			}
		}
			for (m = 0;m < 100;m++)
			{
				for (i = 0;i < n;i++)
				{
					if (sz[i] == k)
					{
						sz[i] = sz[i + 1];
						sz[i + 1] = k;
					}
				}
			}
			for (i = 0;i < n - t;i++)
			{
				if (i == 0)
				{
					System.out.printf("%d",sz[i]);
				}
				else
				{
					System.out.printf(" %d",sz[i]);
				}
			}
				return 0;
	}
}

