package <missing>;

public class GlobalMembers
{
	public static int fpg(int M, int N, int x)
	{
		int K = 0;
		if (N == 0 && M == 0)
		{
		   return 1;
		}
		if (N == 0)
		{
			return 0;
		}
		if (M < 0)
		{
		   return 0;
		}
		for (int i = x;i <= M;i++)
		{
			K = K + fpg(M - i, N - 1, i);
		}
		return K;
	}
	public static int Main()
	{
		int t;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			t = Integer.parseInt(tempVar);
		}
		int M;
		int N;
		int K;
		for (int i = 0;i < t;i++)
		{
			String tempVar2 = ConsoleInput.scanfRead();
			if (tempVar2 != null)
			{
				M = Integer.parseInt(tempVar2);
			}
			String tempVar3 = ConsoleInput.scanfRead();
			if (tempVar3 != null)
			{
				N = Integer.parseInt(tempVar3);
			}
			K = fpg(M, N, 0);
			System.out.printf("%d\n",K);
		}
		return 0;
	}

}

