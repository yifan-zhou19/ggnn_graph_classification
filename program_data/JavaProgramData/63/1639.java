package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int T;
		int N;
		int M;
		int NN;
		int MM;
		int[][] A = new int[113][113];
		int[][] B = new int[113][113];
		int[][] C = new int[113][113];
		N = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		M = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int I = 1; I <= N; I++)
		{
			for (int J = 1; J <= M; J++)
			{
				A[I][J] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		NN = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		MM = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int I = 1; I <= NN; I++)
		{
			for (int J = 1; J <= MM; J++)
			{
				B[I][J] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int I = 1; I <= N; I++)
		{
			for (int J = 1; J <= MM; J++)
			{
				for (int K = 1; K <= M; K++)
				{
					C[I][J] += A[I][K] * B[K][J];
				}
			}
		}
		for (int I = 1; I <= N; I++)
		{
			for (int J = 1; J < MM; J++)
			{
				System.out.printf("%d ",C[I][J]);
			}
			System.out.print(C[I][MM]);
			System.out.print("\n");
		}
		return 0;
	}

}

