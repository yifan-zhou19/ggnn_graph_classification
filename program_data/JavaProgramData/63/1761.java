package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int I = 0;
		int J = 0;
		int P = 0;
		int Q = 0;
		I = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		J = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < I; i++)
		{
			for (int j = 0; j < J; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		P = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		Q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < P; i++)
		{
			for (int j = 0; j < Q; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0; i < I; i++)
		{
			for (int j = 0; j < Q; j++)
			{
				for (int q = 0; q < J; q++)
				{
					c[i][j] += a[i][q] * b[q][j];
				}
			}
		}
		for (int i = 0; i < I; i++)
		{
			for (int q = 0; q < Q; q++)
			{
					if (q < Q - 1)
					{
						System.out.print(c[i][q]);
						System.out.print(" ");
					}
					if (q == Q - 1)
					{
						System.out.print(c[i][q]);
						System.out.print("\n");
					}
			}
		}
			return 0;
	}
}

