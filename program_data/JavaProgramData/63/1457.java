package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????   **
	//*?????? 1200012837 **
	//*???2012.11.5  **
	//********************************

	public static int Main()
	{
		int x1;
		int x2;
		int y1;
		int y2;
		int i;
		int j;
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c =
		{
			{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}
		};
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= x1 - 1; i++) //???????
		{
		for (j = 0; j <= y1 - 1; j++)
		{
			a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= x2 - 1; i++) //???????
		{
		for (j = 0; j <= y2 - 1; j++)
		{
			b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		}
		for (i = 0; i <= x1 - 1; i++) //??????
		{
		for (j = 0; j <= y2 - 1; j++)
		{
		for (int k = 0; k <= x2 - 1; k++)
		{
			c[i][j] += a[i][k] * b[k][j];
		}
		}
		}
		for (i = 0; i <= x1 - 1; i++)
		{
			for (j = 0; j <= y2 - 2; j++)
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

