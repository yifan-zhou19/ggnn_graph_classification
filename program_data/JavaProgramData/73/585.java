package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????   **
	//*?????? 1300012934 **
	//*???2013.11.6  **
	//********************************


	public static int Main()
	{
		int[][] a = new int[5][5];
		int[][] b =
		{
			{INT_MIN, INT_MIN, INT_MIN, INT_MIN, INT_MIN},
			{INT_MAX, INT_MAX, INT_MAX, INT_MAX, INT_MAX}
		};
		int k = 0;

		for (int i = 0; i <= 4; i++)
		{
			for (int j = 0; j <= 4; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				if (a[i][j] >= b[0][i])
				{
					b[0][i] = a[i][j];
				}
				if (a[i][j] <= b[1][j])
				{
					b[1][j] = a[i][j];
				}
			}
		}
		for (int i = 0; i <= 4; i++)
		{
			for (int j = 0; j <= 4; j++)
			{
				if (a[i][j] == b[0][i] && a[i][j] == b[1][j])
				{
					System.out.print(i + 1);
					System.out.print(" ");
					System.out.print(j + 1);
					System.out.print(" ");
					System.out.print(a[i][j]);
					k = 1;
				}
			}
		}
		if (k == 0)
		{
			System.out.print("not found");
		}


		return 0;

	}

}

