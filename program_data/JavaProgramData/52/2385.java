package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int i;
		int k;
		int[] sz = new int[101];
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

		for (i = m;i < n + m;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		i = n;
		k = 0;
		while (i < n + m)
		{
			sz[k] = sz[i];
			k++;
			i++;
		}
		for (i = 0;i < n - 1;i++)
		{
			System.out.printf("%d ",sz[i]);
		}
			 System.out.printf("%d",sz[n - 1]);
	return 0;
	}

}

