package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[1000];
		int m;
		int n;
		int i;
		int j;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			m = Integer.parseInt(tempVar2);
		}
		for (i = 0;i < n;i++)
		{
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			sz[i] = Integer.parseInt(tempVar3);
		}
		}
		m %= n;
		for (j = 0;j < m;j++)
		{
		   for (i = n - 1;i >= 0;i--)
		   {
			 sz[i + 1] = sz[i];
		   }
		   sz[0] = sz[n];
		}
		System.out.printf("%d",sz[0]);
		for (i = 1;i < n;i++)
		{
		System.out.printf(" %d",sz[i]);
		}
		return 0;
	}
}

