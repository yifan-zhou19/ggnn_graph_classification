package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????   **
	//*?????? 1300012861 **
	//*???2013.11.01  **
	//********************************
	public static int Main()
	{
		int[][] a = new int[102][102];
		int[][] b = new int[102][102];
		int[][] c = new int[102][102];
		int i;
		int j;
		int k;
		int x1;
		int x2;
		int y1;
		int y2;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < x1; i++) //???????????
		{
			for (j = 0; j < y1; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < x2; i++) //???????????
		{
			for (j = 0; j < y2; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < x1; i++)
		{
			for (j = 0; j < y2; j++) //?????????c??
			{
				for (k = 0; k < y1; k++)
				{
					c[i][j] += a[i][k] * b[k][j]; //??????????????????????????? ???????
				}
			}
		}
		for (i = 0; i < x1; i++) //????
		{
			for (j = 0; j < y2 - 1; j++)
			{
				System.out.print(c[i][j]);
				System.out.print(" ");
			}
			System.out.print(c[i][j]);
			System.out.print("\n");
		}
		return 0;
	}


}

