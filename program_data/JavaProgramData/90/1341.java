package <missing>;

public class GlobalMembers
{
	public static int f(int M,int N)
	{
		int t;
		if (M > N)
		{
			if ((N != 1) && ((M - N) != 1))
			{
			  t = f(M, N - 1) + f(M - N, N);
			}
			if ((N != 1) && ((M - N) == 1))
			{
			t = 1 + f(M, N - 1);
			}
			if (N == 1)
			{
			t = 1;
			}
		}
		if ((M == N) && (M != 1))
		{
		t = 1 + f(M, N - 1);
		}
		if ((M == N) && (M == 1))
		{
		t = 1;
		}
		if (M < N)
		{
		t = f(M, N - 1);
		}
		return (t);
	}
	public static int Main()
	{
		int n;
		int i;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			n = Integer.parseInt(tempVar);
		}
		int f = new int(int M,int N);
		for (i = 0;i < n;i++)
		{
			int M;
			int N;
			int K;
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
			K = f(M, N);
			System.out.printf("%d\n",K);

		}

	}

}

