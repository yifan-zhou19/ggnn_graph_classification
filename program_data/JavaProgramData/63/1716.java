package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] matrix1 = new int[100][100];
		int[][] matrix2 = new int[100][100];
		int[][] matrix = new int[100][100];
		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int k;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(matrix, 0, (Integer.SIZE / Byte.SIZE));

		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y1; j++)
			{
			matrix1[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < x2; i++)
		{
			for (j = 0; j < y2; j++)
			{
			matrix2[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y2; j++)
			{
				for (k = 0; k < y1; k++)
				{
					matrix[i][j] += matrix1[i][k] * matrix2[k][j];
				}
			}
		}

		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y2 - 1; j++)
			{
				System.out.print(matrix[i][j]);
				System.out.print(" ");
			}
			System.out.print(matrix[i][j]);
			System.out.print("\n");
		}

		return 0;
	}

}

