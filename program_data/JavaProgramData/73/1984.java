package <missing>;

public class GlobalMembers
{
	/**
	* @file 1000012853_1
	* @author 1000012853 ??
	* @date 2010?11?05
	* @desc ????
	*/
	public static int Main()
	{
		int i;
		int j;
		int row;
		int column;
		int m;
		int[][] a = new int[5][5];
		int[] b = new int[5];
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < 5; i++)
		{
			m = a[i][0];
			row = i;
			column = 0;
			for (j = 0; j < 5; j++)
			{
				int flag = 0;
				if (a[i][j] > m)
				{
					m = a[i][j];
					row = i;
					column = j;
				}
				if (j == 4)
				{
				for (int k = 0; k < 5; k++)
				{
					if (k != row && m > a[k][column])
					{
						flag = 1;
						break;
					}
				}
					if (flag == 0)
					{
					   System.out.print(row + 1);
					   System.out.print(' ');
					   System.out.print(column + 1);
					   System.out.print(' ');
					   System.out.print(a[row][column]);
					   System.out.print("\n");
					   b[i] = 1;
					}
				}
			}
		}
		if ((b[0] + b[1] + b[2] + b[3] + b[4]) == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

