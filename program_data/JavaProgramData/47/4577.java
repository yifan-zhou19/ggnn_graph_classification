package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int[] sz = new int[100];
		int t;
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
		for (i = 0;i < n / 2;i++)
		{
			t = sz[i];
			sz[i] = sz[n - i - 1];
			sz[n - i - 1] = t;
		}
		for (i = 0;i < n;i++)
		{
			if (i <= n - 2)
			{
			System.out.printf("%d ",sz[i]);
			}
			else
			{
			System.out.printf("%d",sz[i]);
			}
		}
		return 0;
	}
}

