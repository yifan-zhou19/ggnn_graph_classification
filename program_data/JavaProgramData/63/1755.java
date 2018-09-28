package <missing>;

public class GlobalMembers
{
	//******************
	//???3         **
	//??????    **
	//???2013.11.1 **
	//******************
	public static int Main()
	{
		int x1;
		int x2;
		int y1;
		int y2;
		int[][] A = new int[105][105];
		int[][] B = new int[105][105];
		int[][] c = new int[105][105];
		int num = 0;

//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(c, 0, (Integer.SIZE / Byte.SIZE));

		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0; i < x1; i++)
		{

			for (int j = 0; j < y1; j++)
			{

				A[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0; i < x2; i++)
		{

			for (int j = 0; j < y2; j++)
			{

				B[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (int a = 0; a < x1; a++)
		{

			for (int b = 0; b < y2; b++)
			{

					for (int j = 0; j < y1; j++)
					{

						c[a][b] = c[a][b] + A[a][j] * B[j][b];
					}
			}
		}

		for (int i = 0; i < x1; i++)
		{
			for (int j = 0; j < y2 - 1; j++)
			{

				System.out.print(c[i][j]);
				System.out.print(" ");
			}

			System.out.print(c[i][y2 - 1]);
			System.out.print("\n");
		}
		return 0;
	}
}

