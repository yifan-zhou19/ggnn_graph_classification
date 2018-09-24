package <missing>;

public class GlobalMembers
{
	//********************
	//**????********** 
	//**???1300012728**
	//**2013.11.1*********
	//********************
	public static int Main()
	{
		int x1; // ?? x1, y1, x2, y2????????????
		int y1;
		int x2;
		int y2;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		int[][] a = new int[x1][y1]; // ???????????a
		for (int i = 0; i < x1; i++) // ????a
		{
			for (int j = 0; j < y1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] b = new int[x2][y2]; // ??????????b?????c
		int[][] c = new int[x1][y2];
		for (int i = 0; i < x2; i++) // ????b
		{
			for (int j = 0; j < y2; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0; i < x1; i++) // ????b
		{
			for (int j = 0; j < y2; j++)
			{
				c[i][j] = 0; // ???c?????
				for (int k = 0; k < y1; k++) // ????c?i??j?
				{
					c[i][j] += a[i][k] * b[k][j];
				}
				if (j == 0)
				{
				System.out.print(c[i][j]);
				}
				else
				{
				System.out.print(' ');
				System.out.print(c[i][j]);
				}
			}
			System.out.print("\n");
		}
		return 0;
	}
}

