package <missing>;

public class GlobalMembers
{
	public static void input(int[][] a, int m, int n)
	{
		for (int i = 0 ; i < m ; i++)
		{
			for (int j = 0 ; j < n ; j++)
			{
				* (* (a + j) + i) = ConsoleInput.readToWhiteSpace(true);
			}
		}
	}
	public static int Main()
	{
		int[][] square = new int[100][100];
		int k;
		int m;
		int n;
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1 ; i <= k ; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			input(square, m, n);
			int sum = 0;
			for (int j = 0 ; j < m ; j++)
			{
				sum = sum + * (square + j) + * (* (square + n - 1) + j);
			}
			for (int j = 1 ; j < n - 1 ; j++)
			{
				sum = sum + ** (square + j) + *(* (square + j) + m - 1);
			}
			if (m == 1)
			{
				sum = sum / 2;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
	// ( > w < ) finished~
}

