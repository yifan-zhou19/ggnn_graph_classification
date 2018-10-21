package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int e;
		int[] sz = new int[100];
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		for (i = 0;i < N;i++)
		{
						 String tempVar2 = ConsoleInput.scanfRead();
						 if (tempVar2 != null)
						 {
							 (sz[i]) = Integer.parseInt(tempVar2);
						 }
		}
		if (N % 2 == 0)
		{
				   for (i = 0;i < N / 2;i++)
				   {
									   e = sz[N - 1 - i];
									   sz[N - 1 - i] = sz[i];
									   sz[i] = e;
				   }
		}
		else
		{
			  for (i = 0;i < (N - 1) / 2;i++)
			  {
									 e = sz[N - 1 - i];
									   sz[N - 1 - i] = sz[i];
									   sz[i] = e;
			  }
		}
		for (i = 0;i < N - 1;i++)
		{
						 System.out.printf("%d ",sz[i]);
		}
						 System.out.printf("%d",sz[N - 1]);
		return 0;
	}



}

