package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[n];
		int[] sf = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			sf[n - 1 - i] = sz[i];
		}
		for (i = 0;i < n;i++)
		{
			if (i < n - 1)
			{
				System.out.printf("%d ",sf[i]);
			}
			if (i == n - 1)
			{
				System.out.printf("%d",sf[i]);
			}
		}
		return 0;
	}
}

