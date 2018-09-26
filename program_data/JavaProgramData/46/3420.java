package <missing>;

public class GlobalMembers
{
	/*????
	????????????????row?col?
	???row??????col???????????????
	??????row?col??0<row<100, 0<col<100?
	????
	????????????????????
	????
	4 4
	 1  2  3 4
	12 13 14 5
	11 16 15 6
	10  9  8 7
	*/
	public static int Main()
	{
		int n;
		int m;
		int sum = 0;
		int[][] str = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < n;i++)
		{
		for (int j = 0;j < m;j++)
		{
			str[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		}
		for (int k = 0;k < (n + 1) / 2;k++)
		{
		for (int k1 = k;k1 < m - k;k1++)
		{
			System.out.print(str[k][k1]);
			System.out.print("\n");
			sum++;
			if (sum == n * m)
			{
				return 0;
			}
		}
		for (int k2 = k + 1;k2 < n - k;k2++)
		{
			System.out.print(str[k2][m - k - 1]);
			System.out.print("\n");
				  sum++;
				if (sum == n * m)
				{
					return 0;
				}
		}
		for (int k3 = m - k - 2;k3 >= k;k3--)
		{
			System.out.print(str[n - k - 1][k3]);
			System.out.print("\n");
					  sum++;
					if (sum == n * m)
					{
						return 0;
					}
		}
		for (int k4 = n - k - 2;k4 > k;k4--)
		{
			System.out.print(str[k4][k]);
			System.out.print("\n");
					  sum++;
					if (sum == n * m)
					{
						return 0;
					}
		}
		}
		return 0;
	}

}

