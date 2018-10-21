package <missing>;

public class GlobalMembers
{
	/*?? 1000010573*/



	public static int Main()
	{
		int[][] a = new int[111][111];
		int[][] b = new int[111][111];
		int[][] c = new int[111][111];
		int x1 = 1;
		int x2 = 1;
		int y1 = 1;
		int y2 = 1;
		int i = 0;
		int j = 0;
		int r = 0;
		int sum = 0;
		//????a
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < x1 ; i++)
		{
			for (j = 0 ; j < y1 ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		//????b
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < x2 ; i++)
		{
			for (j = 0 ; j < y2 ; j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		//??????
		for (i = 0; i < x1 ;i++)
		{
				for (j = 0 ; j < y2 ;j++)
				{
					sum = 0;
						for (r = 0 ; r < x2 ; r++)
						{
							sum = sum + a[i][r] * b[r][j];
							c[i][j] = sum;

						}
				}
		}
		//????c??????????
		for (i = 0 ; i < x1 ; i++)
		{
			for (int j = 0 ; j < y2 ; j++)
			{
				System.out.print(c[i][j]);
				if (j != y2 - 1)
				{
					System.out.print(" ");
				}
				else
				{
					System.out.print("\n");
				}
			}
		}
		return 0;
	}


}

