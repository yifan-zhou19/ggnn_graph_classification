package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int a;
		int b;
		int k;
		int s;
		int m;
		int[] sz = new int[100000];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (i = 0;i < n * 2;)
		{
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			sz[i] = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz[i + 1] = Integer.parseInt(tempVar3);
		}
		i = i + 2;
		}
		int[] sz2 = new int[100000];
		for (i = 0;i < n * 2;i++)
		{
		sz2[i] = sz[i];
		}
		for (i = 0;i < 2 * n;i++)
		{
			for (k = 0;k < 2 * n - 1 - i;k++)
			{
				if (sz[k] > sz[k + 1])
				{
					m = sz[k],sz[k] = sz[k + 1],sz[k + 1] = m;
				}
			}
		}
		a = sz[0],b = sz[2 * n - 1];
		for (k = 0;k < n;k++)
		{
			for (i = 0;i < 2 * n;)
			{
				if (sz2[i] <= a != 0 && sz2[i + 1] >= a)
				{
					a = sz2[i + 1];
				}
				i = i + 2;
			}
		}
		if (a == b)
		{
			System.out.printf("%d %d",sz[0],sz[2 * n - 1]);
		}
		else
		{
			System.out.print("no");
		}
		return 0;
	}


}

