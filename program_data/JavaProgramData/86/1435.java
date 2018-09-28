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
		int[] sz = new int[n];
		int i;
		int m;
		int j;
		int k;
		int[] save;
		for (i = 0;i < n;i++)
		{
			sz[i] = 0;
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				m = Integer.parseInt(tempVar2);
			}
			if (m == 0)
			{
				sz[i] = 60;
				continue;
			}
			save = new int[m];
			for (j = 0;j < m;j++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					save[j] = Integer.parseInt(tempVar3);
				}
			}
			for (j = 0;j < m;j++)
			{
				k = save[j] + 3 * j;
				if (k >= 60)
				{
					sz[i] = 60 - 3 * j;
					break;
				}
				if (k < 60 && k >= 57)
				{
					sz[i] = k - 3 * j;
					break;
				}
			}
			if (sz[i] == 0)
			{
				sz[i] = 60 - 3 * m;
			}
		}
		for (i = 0;i < n;i++)
		{
			System.out.printf("%d\n",sz[i]);
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(sz);
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(save);
		return 0;
	}

}

