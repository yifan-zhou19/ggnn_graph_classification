package <missing>;

public class GlobalMembers
{
	// ????
	public static int Main()
	{
		int[][] a = new int[5][5]; // ????
		// row, column????????i,j,k????? max???????
		int row = 0;
		int column = 0;
		int i;
		int j;
		int k;
		int flag;
		int result = 0;
		int max;
		for (i = 0; i < 5; i++) // ???????
		{
			for (j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < 5; i++)
		{
			max = 0;
			flag = 1;
			for (j = 0; j < 5; j++) // ?????????
			{
				if (a[i][j] > max)
				{
					max = a[i][j]; // max???????
					row = i;
					column = j;
				}
			}
			for (k = 0; k < 5; k++) // ??????????????
			{
				if (max > a[k][column]) // ???????????
				{
					flag = 0;
					break;
				}
			}
				if (flag == 1) // flag??1???????????
				{
					System.out.print((row + 1));
					System.out.print(" ");
					System.out.print((column + 1));
					System.out.print(" ");
					System.out.print(max);
					System.out.print("\n");
					result = 1;
				}
		}
		if (result == 0) // ???????
		{
			System.out.print("not found");
		}
		return 0;
	}
}

