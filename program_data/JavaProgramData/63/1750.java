package <missing>;

public class GlobalMembers
{
	///********************************
	//*???????   **
	//*?????? 1300012745 **
	//*???2013.11.2  **
	//********************************
	public static int Main()
	{
		int[][] a = new int[100][100];
		int[][] b = new int[100][100];
		int[][] c = new int[100][100];
		int x1;
		int y1;
		int x2;
		int y2;
		int i;
		int j;
		int l;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= x1 - 1; i++)
		{
			for (j = 0; j <= y1 - 1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= x2 - 1; i++)
		{
			for (j = 0; j <= y2 - 1; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i <= x1 - 1; i++)
		{
			for (j = 0; j <= y2 - 1; j++)
			{
				c[i][j] = 0;
				for (l = 0; l <= x2 - 1; l++)
				{
					c[i][j] += a[i][l] * b[l][j];
				}
				if (j == 0)
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
		System.in.read();
		System.in.read();
		return 0;
	}







}

