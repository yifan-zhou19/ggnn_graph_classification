package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int N;
		int K;
		int Ans;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.out.printf("%d\n",N / 100);
		N = N - (N / 100) * 100;
		System.out.printf("%d\n",N / 50);
		N = N - (N / 50) * 50;
		System.out.printf("%d\n",N / 20);
		N = N - (N / 20) * 20;
		System.out.printf("%d\n",N / 10);
		N = N - (N / 10) * 10;
		System.out.printf("%d\n",N / 5);
		N = N - (N / 5) * 5;
		System.out.printf("%d\n",N / 1);
		N = N - N / 1;
		return 0;
	}

}

