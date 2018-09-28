package <missing>;

public class GlobalMembers
{
	public static int put(int M, int N) //???M?????N???????
	{
		if (N == 1) //??????????1
		{
			return 1;
		}
		if (M < N) //M<N, ????????N-1?????
		{
			return put(M, N - 1);
		}
		if (M >= N)
		{
			return put(M, N - 1) + put(M - N, N); //M>=N,???????????????
		}
	}

	public static int Main() //???
	{
		int t;
		int M;
		int N;
		int i;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < t; i++)
		{
			M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			System.out.print(put(M, N));
			System.out.print("\n");
		}
		return 0;
	} //?????

}

