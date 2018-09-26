package <missing>;

public class GlobalMembers
{
	/*
	 * ??????????
	 * ??          ???
	 * ????: 2011-11-28
	 * ??????M????????N?????????????????????????????????
	 *
	 */



	public static int Calc(int M,int N)
	{
	int sum = 0;

	if (M == 0)
	{
		sum = 1;
		return sum;
	}
	if (N == 1)
	{
		sum = 1;
		return sum;
	}
	if (M < N)
	{
		sum = Calc(M, N - 1);
	}
	else
	{
		sum = Calc(M - N, N) + Calc(M, N - 1);
	}
	return sum;
	}

	public static int Main()
	{
		int t;
		int i;
		int M;
		int N;

		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= t;i++)
		{
			M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(Calc(M, N));
			System.out.print("\n");
		}
		return 0;
	}


}

