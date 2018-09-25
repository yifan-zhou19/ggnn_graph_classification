package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????   **
	//*?????? 1300012713 **
	//*???2013.11.02  **
	//********************************
	public static int Main()
	{
		int[][] a = new int[5][5]; //????a?????num
		int num = 0;
		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 5; j++)
			{
				a[i - 1][j - 1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int m = 1; m <= 5; m++) //?????
		{
			for (int n = 1; n <= 5; n++)
			{
				//???????
				if (a[m - 1][n - 1] >= a[m - 1][0] != 0 && a[m - 1][n - 1] >= a[m - 1][1] != 0 && a[m - 1][n - 1] >= a[m - 1][2] != 0 && a[m - 1][n - 1] >= a[m - 1][3] != 0 && a[m - 1][n - 1] >= a[m - 1][4] != 0 && a[m - 1][n - 1] <= a[0][n - 1] != 0 && a[m - 1][n - 1] <= a[1][n - 1] != 0 && a[m - 1][n - 1] <= a[2][n - 1] != 0 && a[m - 1][n - 1] <= a[3][n - 1] != 0 && a[m - 1][n - 1] <= a[4][n - 1])
				{
					System.out.print(m);
					System.out.print(" ");
					System.out.print(n);
					System.out.print(" ");
					System.out.print(a[m - 1][n - 1]);
					num = num + 1; //????
				}
			}
		}
		if (num == 0)
		{
			System.out.print("not found");
		}
		return 0;
	}


}

