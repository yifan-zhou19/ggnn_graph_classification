package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int i;
		int k;
		int e;
		int[] sz = new int[500];
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
							 sz[i] = Integer.parseInt(tempVar2);
						 }
		}
		int s = 0;
		for (i = 0;i < N;i++)
		{
						 if (sz[i] % 2 == 0)
						 {
										sz[i] = 0;
										s++;
						 }
		}
		for (k = 1;k <= N;k++)
		{
						  int maxlndex = 0;
						  for (i = 0;i <= N - k;i++)
						  {
							  if (sz[maxlndex] < sz[i])
							  {
												e = sz[maxlndex];
												sz[maxlndex] = sz[i];
												sz[i] = e;
							  }
												if (maxlndex != N - k)
												{
																  e = sz[maxlndex];
																  sz[maxlndex] = sz[N - k];
																  sz[N - k] = e;
												}
						  }
		}
		for (i = s;i < N - 1;i++)
		{
						   System.out.printf("%d,",sz[i]);
		}
						   System.out.printf("%d",sz[N - 1]);
						   return 0;
	}


}

