package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int e;
		int i;
		int n;
		int[] sz = new int[100];
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
		for (int k = 1;k < n;k++)
		{
			for (int i = 0;i < n - k;i++)
			{
				if (sz[i] > sz[i + 1])
				{
					e = sz[i + 1];
					sz[i + 1] = sz[i];
					sz[i] = e;
				}
			}
		}
		System.out.printf("%d\n%d",sz[n - 1],sz[n - 2]);
		return 0;
	}

}

