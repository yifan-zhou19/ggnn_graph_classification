package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[101];
		i = 0;
		e = n - 1;
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			i++;
		}
		while (e > 0 && e < n)
		{
			System.out.printf("%d ",sz[e]);
			e--;
		}
	System.out.printf("%d",sz[e]);

		return 0;
	}

}

