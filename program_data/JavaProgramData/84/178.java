package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[] A = new int[100 + 10];
		int N;
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < N; i++)
		{
			A[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		sort(A, A + N);
		System.out.print(A[N - 1]);
		System.out.print("\n");
		System.out.print(A[N - 2]);
		System.out.print("\n");
		return 0;
	}


}

