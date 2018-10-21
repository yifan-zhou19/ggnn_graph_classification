package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int k;
		int a;
		int time;
		k = 1;
		time = 0;
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
		for (i = 0;i < n - 1;i++)
		{
						for (k = i + 1;k < n;k++)
						{
								  if (sz[i] == sz[k])
								  {
												  for (a = k;a < n - 1;a++)
												  {
												  sz[a] = sz[a + 1];
												  }
												  n--;
												  k--;
								  }
						}
		}
		for (i = 0;i < n;i++)
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

