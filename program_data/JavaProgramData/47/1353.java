package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[100];
		for (int a = 0;a <= n - 1;a++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[a]) = Integer.parseInt(tempVar2);
			}
		}
		for (int b = n - 1;b >= 1;b = b - 1)
		{
			System.out.printf("%d ",sz[b]);
		}
		System.out.printf("%d",sz[0]);
		return 0;
	}
}

