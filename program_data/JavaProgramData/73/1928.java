package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int k;
		int max;
		int row;
		int column;
		int count = 0;
		for (i = 0; i < 5; i++)
		{
			for (j = 0; j < 5; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0; i < 5; i++)
		{
			max = 0;
			for (j = 0; j < 5; j++)
			{
				if (max < a[i][j])
				{
					max = a[i][j];
					row = i;
					column = j;
				}
			}
			for (k = 0; k < 5; k++)
			{
				if (max > a[k][column])
				{
					break;
				}
			}
			if (k == 5)
			{
				count = 1;
				System.out.print(row + 1);
				System.out.print(" ");
				System.out.print(column + 1);
				System.out.print(" ");
				System.out.print(max);
				System.out.print("\n");
			}
		}
			if (count == 0)
			{
				System.out.print("not found");
				System.out.print("\n");
			}
		return 0;
	}


}

