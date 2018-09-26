package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] sz = new int[500];
		int n;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int a = 0;
		for (int i = 0;i < n;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				sz[i] = Integer.parseInt(tempVar2);
			}
			if (sz[i] % 2 != 0)
			{
				a++;
			}
		}
		int e;
		for (int k = 1;k <= n;k++)
		{
		   for (int i = 0;i < n - k;i++)
		   {
			  if (sz[i] > sz[i + 1])
			  {
						e = sz[i + 1];
						sz[i + 1] = sz[i];
						sz[i] = e;
			  }
		   }
		}

		for (int m = 0,b = 0;m < n;m++)
		{
			if (sz[m] % 2 != 0)
			{
				b++;
				if (b == a)
				{
					System.out.printf("%d",sz[m]);
				}
				else
				{
					System.out.printf("%d,",sz[m]);
				}
			}
		}
		return 0;
	}


}

