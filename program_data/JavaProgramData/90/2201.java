package <missing>;

public class GlobalMembers
{
	public static int num = 0; //????????
	public static int p = 0; //?????????????
	public static int Main()
	{
		void putApple(int M,int N); //????
		int t;
		t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < t;i++)
		{
			num = 0;
			p = 0;
			int M;
			int N;
			M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			putApple(M, N);
			System.out.print(num);
			System.out.print("\n");
		}
		return 0;
	}

	public static void putApple(int M,int N)
	{
		if (N == 1 || M == 0)
		{
			num++;
		}
		else
		{
			if (M >= N)
			{
				putApple(M - N, N);
				putApple(M, N - 1);
			}
			else
			{
				putApple(M, M);
			}
		}
	}
}

