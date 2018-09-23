package <missing>;

public class GlobalMembers
{
	public static int[][] matrixHor = new int[103][103];
	public static int[][] matrixVer = new int[103][103];

	public static int min(int[] line, int n)
	{
		int mini = 100000;
		for (int i = 1; i <= n; i++)
		{
			if (line[i] < mini)
			{
				mini = line[i];
			}
		}
		return mini;

	}
	public static int Main()
	{
		int n;
		int N;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 1; i <= n; i++)
		{
			int sum = 0;
			N = n;
			for (int j = 1; j <= N; j++)
			{
				for (int k = 1; k <= N; k++)
				{
					matrixVer[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
					matrixHor[k][j] = matrixVer[j][k];
				}
			}
			for (int h = 1; h < n; h++)
			{

				for (int j = 1; j <= N; j++)
				{
					int minim = min(matrixVer[j], N);
					for (int k = 1; k <= N; k++)
					{
						matrixVer[j][k] = matrixVer[j][k] - minim;
						matrixHor[k][j] = matrixVer[j][k];
					}
				}


				for (int j = 1; j <= N; j++)
				{
					int minim = min(matrixHor[j], N);
					for (int k = 1; k <= N; k++)
					{
						matrixHor[j][k] = matrixHor[j][k] - minim;
						matrixVer[k][j] = matrixHor[j][k];
					}
				}
				sum = sum + matrixVer[2][2];
				N = N - 1;
				for (int j = 2; j <= N; j++)
				{
					for (int k = 2; k <= N; k++)
					{
						matrixVer[j][k] = matrixVer[j + 1][k + 1];
						matrixHor[j][k] = matrixHor[j + 1][k + 1];

					}
				}
				for (int j = 2; j <= N; j++)
				{
					matrixHor[1][j] = matrixHor[1][j + 1];
					matrixVer[j][1] = matrixHor[1][j];
					matrixVer[1][j] = matrixVer[1][j + 1];
					matrixHor[j][1] = matrixVer[1][j];
				}
			}
			System.out.print(sum);
			System.out.print("\n");


		}
	}

}

