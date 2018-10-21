package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int[] sz1 = new int[10000];
		int k;
		int[] sz2 = new int[10000];
		int e = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		for (k = 0;k < n;k++)
		{
			sz1[k] = 0;
			sz2[k] = 0;
		}

		while ((scanf("%d %d", i, j), i | j) != 0)
		{
			sz1[i]++;
			sz2[j]++;
		}

		for (k = 0;k < n;k++)
		{
			if (sz1[k] == 0 && sz2[k] == n - 1)
			{
				System.out.printf("%d",k);
					e++;
			}
		}
		if (e == 0)
		{
			System.out.print("NOT FOUND");
		}

		return 0;
	}
}

