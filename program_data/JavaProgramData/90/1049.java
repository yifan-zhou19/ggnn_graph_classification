package <missing>;

public class GlobalMembers
{
	public static int apple(int N,int M)
	{
		int K;
		if (N == 1)
		{
			K = 1;
		}
		else if (M == 1)
		{
			K = 1;
		}
		else if (M == 0)
		{
			K = 1;
		}
		else if (M >= N)
		{
			K = apple(N, M - N) + apple(N - 1, M);
		}
		else if (M < N)
		{
			K = apple(N - 1, M);
		}
		return K;
	}
	public static int Main()
	{
		int t;
		int M;
		int N;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		for (i = 1;i <= t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				M = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead(" ");
			if (tempVar3 != null)
			{
				N = Integer.parseInt(tempVar3);
			}
			System.out.printf("%d\n",apple(N, M));
		}
	}
}

