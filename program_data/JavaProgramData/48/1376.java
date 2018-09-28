package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int i;
		int[][] a = new int[N][N];
		int[][] b = new int[N][N];
		int n;
		int d;
		for (row = 0;row < N;row++)
		{
			for (col = 0;col < N;col++)
			{
			   a[row][col] = 0;
			}
		}

		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			a[4][4] = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			d = Integer.parseInt(tempVar2);
		}


		for (i = 0;i < d;i++)
		{
			for (row = 0;row < N;row++)
			{
			for (col = 0;col < N;col++)
			{
			   b[row][col] = 0;
			}
			}

			  for (row = 0;row < N;row++)
			  {
				   for (col = 0;col < N;col++)
				   {
						if (a[row][col] != 0)
						{
							b[row - 1][col - 1] += a[row][col];
							b[row][col - 1] += a[row][col];
							b[row + 1][col - 1] += a[row][col];
							b[row - 1][col] += a[row][col];
							b[row + 1][col] += a[row][col];
							b[row - 1][col + 1] += a[row][col];
							b[row][col + 1] += a[row][col];
							b[row + 1][col + 1] += a[row][col];
							a[row][col] *= 2;

						}
				   }
			  }
			  for (row = 0;row < N;row++)
			  {
				  for (col = 0;col < N;col++)
				  {
					  a[row][col] = a[row][col] + b[row][col];
				  }
			  }

		}


		for (row = 0;row < N;row++)
		{
			for (col = 0;col < N - 1;col++)
			{
				System.out.printf("%d ",a[row][col]);
			}
			System.out.printf("%d\n",a[row][N - 1]);
		}
		return 0;
	}



}

