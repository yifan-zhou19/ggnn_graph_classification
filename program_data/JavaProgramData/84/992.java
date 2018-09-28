package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[101];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int e;
		for (int m = 0;m < n;m++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[m] = Integer.parseInt(tempVar2);
			}
		}
		for (int k = 0;k < n;k++)
		{
			for (int i = 0;i < n - 1;i++)
			{
				if (sz[i] < sz[i + 1])
				{
					e = sz[i + 1];
					sz[i + 1] = sz[i];
					sz[i] = e;
				}
			}
		}
		System.out.printf("%d\n%d",sz[0],sz[1]);
		return 0;
	}

}

