package <missing>;

public class GlobalMembers
{
	//****************************
	//*@file:4.cpp               *
	//*@author:??? 1200012894 *
	//*@date:2012.11.7           *
	//*@function:??????    *
	//****************************

	public static int Main()
	{
		int x1; // x1, y1???1???????x2, y2???2??????
		int y1;
		int x2;
		int y2;
		int[][] matrix1 = new int[100][100]; //matrix1, matrix2???matrix3
		int[][] matrix2 = new int[100][100];
		int[][] matrix3 = new int[100][100];
		int i; // number???????i, j, k, l, r, t, p?????
		int j;
		int k;
		int l;
		int r;
		int t;
		int p;
		int number;
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
		memset(matrix3, 0, (Integer.SIZE / Byte.SIZE));
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < x1; i++) // ?????i?x1
		{
			for (j = 0; j < y1; j++) // ?????j?y1
			{
				number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				matrix1[i][j] = number;
			} // end for
		} // end for
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0; k < x2; k++) // ??????k?x2
		{
			for (l = 0; l < y2; l++) // ??????l?y2
			{
				number = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				matrix2[k][l] = number;
			}
		}
		for (r = 0; r < x1; r++) // ??????????matrix3???x1 * y2???
		{
			for (t = 0; t < y2; t++)
			{
				for (p = 0; p < y1; p++) // y1 = x2,????p????
				{
					matrix3[r][t] = matrix1[r][p] * matrix2[p][t] + matrix3[r][t];
				}
			}
		}
		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y2; j++)
			{
				if (j != y2 - 1)
				{
					System.out.print(matrix3[i][j]);
					System.out.print(" ");
				}
				else
				{
					System.out.print(matrix3[i][j]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}

}

