package <missing>;

public class GlobalMembers
{
	//********************************
	//*????                     **
	//*????? 1300012848        **
	//*???2013.11.1              **
	//********************************
	public static int Main()
	{
		int[][] a = new int[5][5];
		int g = 0;
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++)
			{
				if (a[i][j] <= a[0][j] != 0 && a[i][j] <= a[1][j] != 0 && a[i][j] <= a[2][j] != 0 && a[i][j] <= a[3][j] != 0 && a[i][j] <= a[4][j] != 0 && a[i][j] >= a[i][0] != 0 && a[i][j] >= a[i][1] != 0 && a[i][j] >= a[i][2] != 0 && a[i][j] >= a[i][3] != 0 && a[i][j] >= a[i][4])
				{
					System.out.print(i + 1);
					System.out.print(" ");
					System.out.print(j + 1);
					System.out.print(" ");
					System.out.print(a[i][j]);
					System.out.print("\n");
					g = 1; //???????g=1
				}
			}
		}
		if (g == 0) //g=0?????
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

