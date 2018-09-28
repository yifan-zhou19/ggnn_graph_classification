package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int row;
		int col;
		int[][] num = new int[100][100];
		int count;
		int r;
		int l;
		int i;
		int j;
		int k;
		row = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		col = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		count = row * col;
		for (i = 1; i <= row; i++) // i???
		{
			for (j = 1; j <= col; j++) // j???
			{
				num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		} // end for
		int r1;
		int r2;
		int l1;
		int l2;
		r1 = 1;
		r2 = row;
		l1 = 1;
		l2 = col;
		while ((r1 <= r2) && (l1 <= l2))
		{
			int flag = 0;
			for (l = l1; l <= l2; l++)
			{
				System.out.print(num[r1][l]);
				count--; // count?????????
				if (count != 0)
				{
					System.out.print("\n");
				}
				else
				{
					flag = 1;
				}
			}
			if (flag != 0)
			{
				break;
			}
			for (r = r1 + 1; r <= r2; r++)
			{
				System.out.print(num[r][l2]);
				count--;
				if (count != 0)
				{
					System.out.print("\n");
				}
				else
				{
					flag = 1;
				}
			}
			if (flag != 0)
			{
				break;
			}
			for (l = l2 - 1; l >= l1; l--)
			{
				System.out.print(num[r2][l]);
																				 count--;
				if (count != 0)
				{
					System.out.print("\n");
				}
				else
				{
					flag = 1;
				}
			}
			if (flag != 0)
			{
				break;
			}
			for (r = r2 - 1; r > r1; r--)
			{
				System.out.print(num[r][l1]);
				count--;
				if (count != 0)
				{
					System.out.print("\n");
				}
				else
				{
					flag = 1;
				}
			}
			if (flag != 0)
			{
				break;
			}
			else
			{
				r1++;
				r2--;
				l1++;
				l2--;
			}
		} // end while
		return 0;
	}


}

