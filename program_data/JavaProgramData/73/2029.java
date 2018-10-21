package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int j;
		int k;
		int m;
		int row1;
		int row2;
		int column;
		int max;
		int min;
		int flag = 0;
		int[][] a = new int[5][5];
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				a[i][j] = m;
			}
		}
		for (i = 0; i < 5; i++)
		{
			max = 0;
			for (j = 0; j < 5; j++)
			{
				if (a[i][j] > max)
				{
					max = a[i][j];
					row1 = i;
					column = j;
				}
			}
			min = a[0][column];
			for (k = 0; k < 5; k++)
			{
				if (a[k][column] <= min)
				{
					min = a[k][column];
					row2 = k;
				}
			}
			if (row1 == row2)
			{
				flag = 1;
				System.out.print(row1 + 1);
				System.out.print(" ");
				System.out.print(column + 1);
				System.out.print(" ");
				System.out.print(max);
				System.out.print("\n");
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

