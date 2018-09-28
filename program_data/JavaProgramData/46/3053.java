package <missing>;

public class GlobalMembers
{
	//********************************
	//*??????? **
	//*????? 1300012839 **
	//*???2013.11.2**
	//********************************
	public static int Main()
	{
		int row; //?n????m????count??????????
		int col;
		int n;
		int m;
		int count = 0;
		int[][] array = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (row = 0;row < n;row++) //????????
		{
			for (col = 0;col < m;col++)
			{
				array[row][col] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		int k;
		for (k = 1;k <= n / 2 + 1;k++) //k????k?
		{
			for (col = k - 1;col <= m - k;col++) //????????????????????????????count????????????
			{
					if (count == m * n)
					{
						break;
					}
					System.out.print(array[k - 1][col]);
					System.out.print("\n");
					count++;
			}

			for (row = k;row <= n - k;row++)
			{
				if (count == n * m)
				{
					break;
				}
				System.out.print(array[row][m - k]);
				System.out.print("\n");
				count++;
			}

			for (col = m - k - 1;col >= k - 1;col--)
			{
				if (count == n * m)
				{
					break;
				}
				System.out.print(array[n - k][col]);
				System.out.print("\n");
				count++;
			}
			for (row = n - k - 1;row >= k;row--)
			{
				if (count == m * n)
				{
					break;
				}
				System.out.print(array[row][k - 1]);
				System.out.print("\n");
				count++;
			}
			if (count == n * m)
			{
				break;
			}
		}
		return 0;
	}
}

