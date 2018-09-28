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
		int[] sz = new int[98];
		int i = 0;
		while (i < n)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				(sz[i]) = Integer.parseInt(tempVar2);
			}
			i++;
		}

			int a;
			int j = 0;
			while (j <= (n / 2) - 1)
			{
				a = sz[n - j - 1];
				sz[n - j - 1] = sz[j];
				sz[j] = a;
				j++;
			}


		int l = 0;
		while (l < n - 1)
		{
			System.out.printf("%d ",sz[l]);
			l++;
		}
		System.out.printf("%d",sz[n - 1]);
		return 0;

	}
}

