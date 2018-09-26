package <missing>;

public class GlobalMembers
{
	public static void Find(int[][] matrix, int n)
	{
		int i;
		int j;
		int[][] temp = new int[9][9];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(temp,0,(Integer.SIZE / Byte.SIZE));
		if (n == 0)
		{
			return;
		}
		for (i = 1; i < 8; i++)
		{
			for (j = 1; j < 8; j++)
			{
			if (matrix[i][j] != 0)
			{
				temp[i][j] = 2 * matrix[i][j] + temp[i][j];

				temp[i + 1][j] = matrix[i][j] + temp[i + 1][j];

				temp[i - 1][j] = matrix[i][j] + temp[i - 1][j];

				temp[i][j + 1] = matrix[i][j] + temp[i][j + 1];

				temp[i][j - 1] = matrix[i][j] + temp[i][j - 1];
				temp[i + 1][j - 1] = matrix[i][j] + temp[i + 1][j - 1];
				temp[i + 1][j + 1] = matrix[i][j] + temp[i + 1][j + 1];
				temp[i - 1][j - 1] = matrix[i][j] + temp[i - 1][j - 1];
				temp[i - 1][j + 1] = matrix[i][j] + temp[i - 1][j + 1];
			}
			}
		}

		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				matrix[i][j] = temp[i][j];
			}
		}
		Find(matrix, n - 1);
	}
	public static int Main()
	{

		int[][] matrix = new int[9][9];
		int i;
		int j;
		int m;
		int n;
		for (i = 0; i < 9; i++)
		{
			for (j = 0; j < 9; j++)
			{
				matrix[i][j] = 0;
			}
		}


		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		matrix[4][4] = m;
		Find(matrix, n);


		for (i = 0; i < 9; i++)
		{
			System.out.print(matrix[i][0]);
			for (j = 1; j < 9; j++)
			{
				System.out.print(" ");
				System.out.print(matrix[i][j]);
			}
			System.out.print("\n");
		}
	}

}

