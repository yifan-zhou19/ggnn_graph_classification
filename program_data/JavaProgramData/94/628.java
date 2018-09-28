package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int e;
		int j = 0;
		int q = 0;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int[] sz = new int[n];

		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}

		}
		;
		for (i = 0;i < n;i++)
		{
			if (sz[i] % 2 != 0)
			{

				j++;
			}
		}
	int[] sz2 = new int[j];
		for (i = 0;i < n;i++)
		{
			if (sz[i] % 2 != 0)
			{
				sz2[q] = sz[i];
				q++;
			}
		}
		for (k = 1;k <= j;k++)
		{
			for (i = 0;i < j - k;i++)
			{
				if (sz2[i] < sz2[i + 1])
				{
					e = sz2[i];
					sz2[i] = sz2[i + 1];
					sz2[i + 1] = e;
				}
			}


		}
	for (i = j - 1;i > 0;i--)
	{
	System.out.printf("%d,",sz2[i]);
	}
	System.out.printf("%d\n",sz2[0]);
		return 0;
	}

}

