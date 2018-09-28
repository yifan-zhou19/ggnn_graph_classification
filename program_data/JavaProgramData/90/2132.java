package <missing>;

public class GlobalMembers
{
	public static int means(int M,int N)
	{
		int k;
	if (M == 0)
	{
	return 1;
	}
	else
	{
		if (N == 1)
		{
		return 1;
		}
				 else
				 {
					 if (N <= M)
					 {
					  k = means(M, N - 1) + means(M - N, N);
					  return k;
					 }
					 else
					 {
						  k = means(M, N - 1);
						  return k;
					 }
				 }
	}
	}
	public static int Main()
	{
		  int x;
		  int m;
		  int n;
		  int i;
		  int k;
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  x = Integer.parseInt(tempVar);
		  }
		  for (i = 0;i < x;i++)
		  {
					String tempVar2 = ConsoleInput.scanfRead();
					if (tempVar2 != null)
					{
						m = Integer.parseInt(tempVar2);
					}
					String tempVar3 = ConsoleInput.scanfRead(" ");
					if (tempVar3 != null)
					{
						n = Integer.parseInt(tempVar3);
					}
					k = means(m, n);
					System.out.printf("%d\n",k);
		  }
	}
}

