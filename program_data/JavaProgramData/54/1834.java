package <missing>;

public class GlobalMembers
{
	public static int N;
	public static int K;
	public static int Sum;

	//whether it can satisfy the nth monkey's operation//
	public static int Monkey(int n)
	{
		if (n == 0)
		{
			return 1;
		}
		else
		{
			if (Sum % (N - 1) == 0)
			{
				Sum = Sum / (N - 1) * N + K;
				return 1 && Monkey(n - 1) != 0;
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
		for (m = N - 1;;m += N - 1)
		{
			Sum = m;
			if (Monkey(N) != 0)
			{
				break;
			}
		}
		System.out.printf("%d\n",Sum);
	}
}

