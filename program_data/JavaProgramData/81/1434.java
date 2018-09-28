package <missing>;

public class GlobalMembers
{
	public static int SwapRow(int[][] array, int row_n, int row_m)
	{
		int col;
		int a;
		if (row_n >= 0 && row_n < 5 && row_m >= 0 && row_m < 5)
		{
			for (col = 0;col < 5;col++)
			{
				a = array[row_n][col];
				array[row_n][col] = array[row_m][col];
				array[row_m][col] = a;
			}
			return 1;
		}
		else
		{
			return 0;
		}
	}

	public static void Main(String[] args)
	{
		int[][] array = new int[5][5];
		int n;
		int m;
		int row;
		int col;
		for (row = 0;row < 5;row++)
		{
			for (col = 0;col < 5;col++)
			{
				String tempVar = ConsoleInput.scanfRead();
				if (tempVar != null)
				{
					array[row][col] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead(" ");
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		if (0 == SwapRow(array, n, m))
		{
			System.out.print("error");
		}
		else
		{
			for (row = 0;row < 5;row++)
			{
				for (col = 0;col < 5;col++)
				{
					if (col == 4)
					{
						System.out.printf("%d\n", array[row][col]);
					}
					else
					{
						System.out.printf("%d ", array [row][col]);
					}
				}
			}
		}
	}

}

