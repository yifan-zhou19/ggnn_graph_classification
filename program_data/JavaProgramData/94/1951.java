package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int a;
		int b;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		int[] sz = new int[N];
		for (i = 0;i < N;i++)
		{
		   String tempVar2 = ConsoleInput.scanfRead();
		   if (tempVar2 != null)
		   {
			   sz[i] = Integer.parseInt(tempVar2);
		   }
		}
		for (i = 0;i < N;i++)
		{
			for (a = 1;a < N - i;a++)
			{
				if (sz[a - 1] > sz[a])
				{
					 b = sz[a - 1];
					 sz[a - 1] = sz[a];
					 sz[a] = b;
				}
			}
		}
		System.out.printf("%d",sz[0]);
		for (i = 1;i < N;i++)
		{
			   if (sz[i] % 2 == 1)
			   {
				   System.out.printf(",%d",sz[i]);
			   }
		}

		return 0;
	}

}

