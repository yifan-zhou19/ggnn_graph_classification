package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] A = new int[100][100];
		int[][] B = new int[100][100];
		int[][] C = new int[100][100];
		int m;
		int q;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < 100; i++)
		{
			for (int j = 0; j < 100; j++)
			{
				C[i][j] = 0;
			}
		}
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < q; j++)
			{
				A[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < q; i++)
		{
			for (int j = 0; j < n; j++)
			{
				B[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++)
			{
				for (int t = 0; t < q; t++)
				{
					C[i][j] = C[i][j] + A[i][t] * B[t][j];
				}
			}
		}
		for (int i = 0; i < m; i++)
		{
			System.out.print(C[i][0]);
			for (int j = 1; j < n; j++)
			{
				System.out.print(" ");
				System.out.print(C[i][j]);
			}
			System.out.print("\n");
		}

	}

}

