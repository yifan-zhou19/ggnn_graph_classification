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
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
		}
		int[] xsz = new int[100];
		xsz[0] = sz[0];
		System.out.printf("%d,",xsz[0]);
		int k = 0;
		for (int x = 1;x < n;x++)
		{
			int a = 0;
			for (int y = 0;y <= k;y++)
			{
				if (sz[x] == xsz[y])
				{
					a += 1;
				}
			}
			if (a == 0)
			{
				k += 1;
				xsz[k] = sz[x];
			}
		}
		for (int m = 1;m < k;m++)
		{
			System.out.printf("%d,",xsz[m]);
		}
		System.out.printf("%d",xsz[k]);
		return 0;
	}




}

