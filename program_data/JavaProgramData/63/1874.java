package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int I = 0;
	int K = 0;
	int J = 0;

	int[][] a = new int[101][101];
	int[][] b = new int[101][101];
	int[][] c = new int[101][101];

	I = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	K = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 1;i <= I;i++)
	{
		for (int j = 1;j <= K;j++)
		{
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}

	K = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	J = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (int i = 1;i <= K;i++)
	{
		for (int j = 1;j <= J;j++)
		{
			b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
	}

	for (int j = 1;j <= J;j++)
	{
		for (int i = 1;i <= I;i++)
		{
			for (int k = 1;k <= K;k++)
			{
				c[i][j] += a[i][k] * b[k][j];
			}
		}
	}

	for (int a = 1;a <= I;a++)
	{
			for (int b = 1;b <= J - 1;b++)
			{
			System.out.print(c[a][b]);
			System.out.print(" ");
			}
			System.out.print(c[a][J]);
			System.out.print("\n");
	}

	return 0;







	}
}

