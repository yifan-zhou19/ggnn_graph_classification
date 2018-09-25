package <missing>;

public class GlobalMembers
{
	public static int check(int[][] a, int n, int m)
	{
		int row;
		int col;
		int indin = 0;
		int indim = 0;
		int indi;
		for (row = 0;row < 5;row++)
		{
			for (col = 0;col < 5;col++)
			{
				if ((a[row][col]) == n)
				{
					indin = 1;
				}
				if ((a[row][col]) == m)
				{
					indim = 1;
				}
			}
		}
		indi = indin * indim;
		return indi;
	}


	public static int Main()
	{
		int[][] square = new int[5][5];
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
					square[row][col] = Integer.parseInt(tempVar);
				}
			}
		}
		String tempVar2 = ConsoleInput.scanfRead();
		if (tempVar2 != null)
		{
			n = Integer.parseInt(tempVar2);
		}
		String tempVar3 = ConsoleInput.scanfRead();
		if (tempVar3 != null)
		{
			m = Integer.parseInt(tempVar3);
		}
		int result;
		int temp;
		result = check(square, n, m);
		if (result == 0 || n > 4 || m > 4)
		{
			System.out.print("error");
		}
		else
		{
			for (col = 0;col < 5;col++)
			{
				temp = square[n][col];
				square[n][col] = square[m][col];
				square[m][col] = temp;
			}
		for (row = 0;row < 5;row++)
		{
			System.out.printf("\n%d",square[row][0]);
			for (col = 1;col < 5;col++)
			{
				System.out.printf(" %d",square[row][col]);
			}
		}
		}

		return 0;
	}

}

