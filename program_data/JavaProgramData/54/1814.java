package <missing>;

public class GlobalMembers
{
	public static int N;
	public static int K;
	public static int Monkey(int m,int n,int k)
	{
		if (n == 1)
		{
			return (m % N == k && (m - k) / N >= 1)?1:0;
		}
		else
		{
			if (m % N == k)
			{
				return Monkey((m - k) * (N - 1) / N, n - 1, k);
			}
			else
			{
				return 0;
			}
		}
	}

	public static void Main()
	{
		int m;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			N = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			K = Integer.parseInt(tempVar2);
		}
		for (m = (int)(Math.pow(N,K) / Math.pow(N - 1,K - 1));;m++)
		{
			if (Monkey(m, N, K) != 0)
			{
				break;
			}
		}
		System.out.printf("%d\n",m);
	}
}

