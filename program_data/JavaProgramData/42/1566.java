package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int k;
		int s;
		int i;
		int a;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		s = 0;
		int[] sz = new int[n];
		for (i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			k = Integer.parseInt(tempVar3);
		}
		for (i = 0;i < n;i++)
		{
			while (sz[i] == k)
			{
				for (a = i;a < n;a++)
				{
					sz[a] = sz[a + 1];
				}
				s++;
			}
		}
		for (i = 0;i < n - s;i++)
		{
			if (i == 0)
			{
			System.out.printf("%d",sz[i]);
			}
			else if (i != 0)
			{
				System.out.printf(" %d",sz[i]);
			}
		}
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'free' has no equivalent in Java:
		free(sz);
	return 0;
	}


}

