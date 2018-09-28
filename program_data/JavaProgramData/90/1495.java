package <missing>;

public class GlobalMembers
{
	public static int n = 0;
	public static int digui(int M, int N)
	{
	  if (N == 1)
	  {
		return n + 1;
	  }
	  else if (M == 1)
	  {
		return n + 1;
	  }
	  else
	  {
		if (M > N)
		{
			return digui(M - 1, N);
		}
		else
		{
			return digui(M - 1, N) + digui(M, N - M);
		}
	  }
	}

	public static int Main()
	{
	  int M;
	  int N;
	  int n;
	  int i;
	  int K;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 1;i <= n;++i)
	  {
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			N = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			M = Integer.parseInt(tempVar3);
		}
		K = digui(M, N);
		System.out.printf("%d\n",K);
	  }
	  return 0;
	}
}

