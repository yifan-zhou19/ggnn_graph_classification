package <missing>;

public class GlobalMembers
{
	//***************************
	//*???????          **
	//*????? 1300012921   **
	//*???2013.11.05        **
	//*************************** 
	public static int Main()

	{
		int[][] a = new int[6][6];

		for (int i = 1; i <= 5; i++)
		{
			for (int j = 1; j <= 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		int max;
		int min;
		int row;
		int col;
		int flag = 0;
		for (int i = 1; i <= 5; i++)
		{
			col = 1;
			max = a[i][1];
			for (int j = 2; j <= 5; j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					col = j;
				}
			}

			row = 1;
			min = a[1][col];
			for (int k = 2; k <= 5; k++)
			{
				if (a[k][col] < min)
				{
					min = a[k][col];
					row = k;
				}
			}

			if (row == i)
			{
				System.out.print(row);
				System.out.print(" ");
				System.out.print(col);
				System.out.print(" ");
				System.out.print(a[row][col]);
				System.out.print("\n");
				flag += 1;
			}
			else
			{
				flag += 0;
			}
		}
		if (flag == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

