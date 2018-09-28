package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[1000];
		int[] ss = new int[1000];
		int m;
		int n;
		int i;
		int e;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n - 1;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar3);
			}
		}
		String tempVar4 = ConsoleInput.scanfRead();
		if (tempVar4 != null)
		{
			(sz[n - 1]) = Integer.parseInt(tempVar4);
		}
		for (i = 0;i < n;i++)
		{
			ss[m + i] = sz[i];
		}
		for (i >= n;i < m + n;i++)
		{
			ss[i - n] = ss[i];
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",ss[i]);
		}
		System.out.printf("%d",ss[n - 1]);
		return 0;
	}
}

