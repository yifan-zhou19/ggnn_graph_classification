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
		int[] sz = new int[n];
		int i;
		int x;
		int y;
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		x = n - 1;
		y = x / 2;
		for (i = 0;i <= y;i++)
		{
			int e;

			e = sz[i];
			sz[i] = sz[n - i - 1];
			sz[n - i - 1] = e;

		}
		for (i = 0;i < n;i++)
		{
			if (i != n - 1)
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

