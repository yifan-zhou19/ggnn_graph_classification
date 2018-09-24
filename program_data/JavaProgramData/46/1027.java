package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		String tempVar = ConsoleInput.scanfRead();
		if (tempVar != null)
		{
			row = Integer.parseInt(tempVar);
		}
		String tempVar2 = ConsoleInput.scanfRead(" ");
		if (tempVar2 != null)
		{
			col = Integer.parseInt(tempVar2);
		}
		int[][] array = new int[100][100];
		for (int rr = 0;rr < row;rr++)
		{
			for (int cc = 0;cc < col;cc++)
			{
				String tempVar3 = ConsoleInput.scanfRead();
				if (tempVar3 != null)
				{
					array[rr][cc] = Integer.parseInt(tempVar3);
				}
			}
		}


		for (int t = 1;t < 100;t++)
		{

			int leftc = t - 1;
			int rightc = col - t;
			if (leftc <= rightc)
			{
				if (leftc == rightc)
				{
				}
				for (int c = leftc;c <= rightc;c++)
				{
					if (c == 0)
					{
						System.out.printf("%d",array[0][0]);
					}
					else
					{
						System.out.printf("\n%d",array[t - 1][c]);
					}

				}
			}
			else
			{
				break;
			}



			int upr = t;
			int downr = row - 1 - t;



			if (upr <= downr)
			{
				for (int r = upr;r <= downr;r++)
				{
					System.out.printf("\n%d",array[r][col - t]);
				}

			}

			if (upr - downr >= 2)
			{
				break;
			}



			if (leftc <= rightc)
			{
				for (int c = rightc;c >= leftc;c--)
				{
					System.out.printf("\n%d",array[row - t][c]);
				}
			}

			if (leftc == rightc)
			{
				break;
			}

			if (upr <= downr)
			{
				for (int r = downr;r >= upr;r--)
				{
					System.out.printf("\n%d",array[r][t - 1]);
				}
			}
		}
		return 0;
	}
}

