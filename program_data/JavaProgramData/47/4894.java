package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int e;
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
				sz[i] = Integer.parseInt(tempVar2);
			}
		}

		for (int k = 0;k < n / 2;k++)
		{
				e = sz[k];
				sz[k] = sz[n - 1 - k];
				sz[n - 1 - k] = e;
		}
			 System.out.printf("%d",sz[0]);
		for (int j = 1;j < n;j++)
		{
			System.out.printf(" %d",sz[j]);
		}

		return 0;
	}
}

