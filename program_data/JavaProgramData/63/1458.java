package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int a = 0;
		int t = 1;
		int[][] matrix1 = new int[101][101];
		int[][] matrix2 = new int[101][101];
		int[][] matrix3 = new int[101][101];
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(matrix3, 0, (Integer.SIZE / Byte.SIZE));
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= x1; i++)
		{
			for (j = 1; j <= y1; j++)
			{
				matrix1[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= x2; i++)
		{
			for (j = 1; j <= y2; j++)
			{
				matrix2[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1; i <= x1; i++)
		{
			for (j = 1; j <= y2; j++)
			{
				for (a = 1; a <= y1; a++)
				{
					matrix3[i][j] = matrix3[i][j] + matrix1[i][t] * matrix2[t][j];
					t = t + 1;
				}
				if (j != y2)
				{
					System.out.print(matrix3[i][j]);
					System.out.print(" ");
				}
				else
				{
					System.out.print(matrix3[i][j]);
					System.out.print("\n");
				}
				t = 1;
			}
		}
		return 0;
	}
}

