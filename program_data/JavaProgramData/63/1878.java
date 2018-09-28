package <missing>;

public class GlobalMembers
{
	//*****************************************
	//* ??????? **
	//* ?????? 1300012741 **
	//* ???2013.10.30 **
	//*****************************************


	public static int Main()
	{
		int[][] matrix_A =
		{
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		}; // ????A
		int[][] matrix_B =
		{
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0},
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		}; // ????B
		int row_A; // ????AB????
		int col_A;
		int row_B;
		int col_B;
		int i; // ??????
		int j;
		int k;
		int temp; // ????????

		row_A = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col_A = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < row_A; i++)
		{
			for (j = 0; j < col_A; j++)
			{
				matrix_A[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		row_B = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col_B = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < row_B; i++)
		{
			for (j = 0; j < col_B; j++)
			{
				matrix_B[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (i = 0; i < row_A; i++) // ?????A?????
		{
			for (j = 0; j < col_B; j++) // ?????B?????
			{
				temp = 0; // ?????????
				for (k = 0; k < col_A; k++) // ????????i,j?
				{
					temp += matrix_A[i][k] * matrix_B[k][j];
				}
				System.out.print(temp);
				if (j == col_B - 1) // ???????
				{
					System.out.print("\n");
				}
				else
				{
					System.out.print(" ");
				}
			}
		}

		return 0;
	}
}

