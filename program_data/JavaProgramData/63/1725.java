package <missing>;

public class GlobalMembers
{
	//********************************
	//*???3.cpp   **
	//*???????    **
	//*?????? 1300012838 **
	//*???2013.11.1  **
	//********************************

	public static int Main()
	{
		int x1;
		int y1;
		int x2;
		int y2;
		int[][] a = new int[101][101];
		int[][] b = new int[101][101];
		int[][] c = new int[101][101];
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= x1; i++)
		{
			for (int j = 1; j <= y1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1; i <= x2; i++)
		{
			for (int j = 1; j <= y2; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 1; i <= x1; i++)
		{
			for (int j = 1; j <= y2; j++)
			{
				c[i][j] = 0;
				for (int k = 1; k <= x2; k++)
				{
					c[i][j] += a[i][k] * b[k][j];
				}
				if (j == 1)
				{
					System.out.print(c[i][j]);
				}
				else
				{
					System.out.print(" ");
					System.out.print(c[i][j]);
				}
			}
			System.out.print("\n");
		}


		return 0;
	}
}

