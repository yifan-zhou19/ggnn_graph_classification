package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[7][7]; //????
		int cnt = 0; //??????????????

		for (int k = 0; k < 5; k++) //??
		{
			for (int l = 0; l < 5; l++)
			{
				a[k][l] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (int i = 0; i < 5; i++)
		{
			for (int j = 0; j < 5; j++) //?????????
			{
				if (a[i][j] >= a[i][0] != 0 && a[i][j] >= a[i][1] != 0 && a[i][j] >= a[i][2] != 0 && a[i][j] >= a[i][3] != 0 && a[i][j] >= a[i][4] != 0 && a[i][j] <= a[0][j] != 0 && a[i][j] <= a[1][j] != 0 && a[i][j] <= a[2][j] != 0 && a[i][j] <= a[3][j] != 0 && a[i][j] <= a[4][j])
				{
					System.out.print(i + 1);
					System.out.print(" ");
					System.out.print(j + 1);
					System.out.print(" ");
					System.out.print(a[i][j]);
					System.out.print("\n");
					cnt++; //??????????
				}
			}
		}

		if (cnt == 0) //??????0?????????not found
		{
			System.out.print("not found");
		}
		return 0;
	}

}

