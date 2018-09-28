package <missing>;

public class GlobalMembers
{
	public static int classify(int M, int N)
	{
		if (M == 1 || M == 0 || N == 1)
		{
			return 1; //??????????????????????????
		}
		else if (M < 0)
		{
			return 0; //????????0 ????
		}
		else
		{
			return classify(M, N - 1) + classify(M - N, N); //??M,N???????M,N-1????M-N,N???
		}
	}
	public static int Main()
	{
		int t;
		int i = 0;
		int M;
		int N;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[] p = new int[t];
		while (i < t)
		{
			M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			p[i] = classify(M, N); //?????????
			i++;
		}
		for (i = 0;i < t;i++) //????????
		{
		System.out.print(p[i]);
		System.out.print("\n");
		}
		return 0;
	}
}

