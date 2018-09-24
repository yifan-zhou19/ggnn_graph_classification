package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[100];
		int n;
		int m;
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
		for (int i = 0;i < n;i++)
		{
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				sz[i] = Integer.parseInt(tempVar3);
			}
		}
		int e;
		for (int k = n - m;k < n;k++)
		{
			for (int j = k;j > k - n + m;j--)
			{
				e = sz[j];
				sz[j] = sz[j - 1];
				sz[j - 1] = e;
			}
		}
		for (int c = 0;c < n - 1;c++)
		{
			System.out.printf("%d ",sz[c]);
		}
		System.out.printf("%d",sz[n - 1]);
		return 0;
	}


}

