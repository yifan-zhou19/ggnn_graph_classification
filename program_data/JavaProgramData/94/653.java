package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k = 0;
		int i;
		int j;
		int e;
		int l;
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
			if (sz[i] % 2 != 0)
			{
				k++;
			}
		}
		int[] sz2 = new int[k];
		j = 0;
		for (i = 0;i < n;i++)
		{
			if (sz[i] % 2 != 0)
			{
				sz2[j] = sz[i];
				j++;
			}
		}
		for (i = 0;i < k;i++)
		{
			for (l = 0;l < k - i - 1;l++)
			{
				if (sz2[l] > sz2[l + 1])
				{
					e = sz2[l];
					sz2[l] = sz2[l + 1];
					sz2[l + 1] = e;
				}
			}
		}
		for (i = 0;i < k - 1;i++)
		{
			System.out.printf("%d,",sz2[i]);
		}
		System.out.printf("%d",sz2[k - 1]);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(sz);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(sz2);
		return 0;
	}
}

