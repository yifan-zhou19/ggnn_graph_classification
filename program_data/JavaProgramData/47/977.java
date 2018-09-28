package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
		int n;
		int i;
		int e;
		e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 2;i <= n + 1;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead(" ");
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			e = sz[i];
			sz[i] = sz[i - 1];
			sz[i - 1] = e;
		}
			for (i = n;i >= 2;i--)
			{
				System.out.printf("%d ",sz[i]);
			}
			if (i = 1)
			{

		System.out.printf("%d",sz[i]);
			}

	return 0;
	}
}

