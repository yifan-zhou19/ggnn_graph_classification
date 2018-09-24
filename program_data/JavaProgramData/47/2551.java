package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int e;
		int[] sz = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		for (int k = 1;k <= n;k++)
		{
		for (int i = 0;i < n - k;i++)
		{
			e = sz[i];
			sz[i] = sz[i + 1];
			sz[i + 1] = e;
		}
		}
		for (int j = 0;j < n;j++)
		{
			if (j < n - 1)
			{
				System.out.printf("%d ",sz[j]);
			}
			else
			{
				System.out.printf("%d",sz[j]);
			}
		}
		return 0;
	}

}

