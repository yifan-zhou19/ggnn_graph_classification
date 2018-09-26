package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????    **
	//*?????? 1300012855 **
	//*???2013.11.1  **
	//********************************


	public static int Main()
	{
		int[][] a = new int[100][100]; // ????
		int[][] b = new int[100][100];
		int x1; // ?????
		int y1;
		int x2;
		int y2;
		int sum; // ???????????
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < x1; i++) // ???????
		{
			for (int j = 0; j < y1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < x2; i++) // ???????
		{
			for (int j = 0; j < y2; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0; i < x1; i++) // ?????????????????????
		{
			for (int j = 0; j < y2; j++)
			{
				sum = 0;
				for (int k = 0, l = 0; k < y1; k++, l++)
				{
						sum += a[i][k] * b[l][j]; // ??????????
				}
				if (j == 0)
				{
					System.out.print("\n");
				}
				System.out.print(sum);
				if (j != y2 - 1)
				{
					System.out.print(' ');
				}
			}
		}
			return 0;
	}
}

