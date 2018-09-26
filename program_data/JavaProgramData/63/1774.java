package <missing>;

public class GlobalMembers
{
		public static int ilong1;
		public static int ilong2;
		public static int iwide1;
		public static int iwide2;
		public static int buffer;
		public static int[][] mat1 = new int[100][100];
		public static int[][] mat2 = new int[100][100];
		public static int[][] mat3 = new int[100][100];

	public static int Main()
	{

		ilong1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		iwide1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0; i < ilong1; i++)
		{
			for (int j = 0; j < iwide1; j++)
			{
				mat1[j][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		ilong2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		iwide2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0; i < ilong2; i++)
		{
			for (int j = 0; j < iwide2; j++)
			{
				mat2[j][i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				//cout << mat2[j][i];
			}
		}

		for (int i = 0; i < ilong1; i++)
		{
			for (int j = 0; j < iwide2; j++)
			{
				buffer = 0;
				for (int k = 0; k < iwide1; k++)
				{
					buffer = buffer + mat1[k][i] * mat2[j][k];
				}
				mat3[i][j] = buffer;
			}
		}

		for (int i = 0; i < ilong1 - 1; i++)
		{
			for (int j = 0; j < iwide2 - 1; j++)
			{
				System.out.print(mat3[i][j]);
				System.out.print(' ');
			}
			System.out.print(mat3[i][iwide2 - 1]);
			System.out.print("\n");
		}
		for (int j = 0; j < iwide2 - 1; j++)
		{
			System.out.print(mat3[ilong1 - 1][j]);
			System.out.print(' ');
		}
			System.out.print(mat3[ilong1 - 1][iwide2 - 1]);
		return 0;
	}


}

