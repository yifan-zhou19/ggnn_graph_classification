package <missing>;

public class GlobalMembers
{
	public static int sum = 0;
	public static int FindMin_i(int[][] M, int i, int n)
	{
		int Min = M[i][0];
		for (int j = 0 ; j < n ; j++)
		{
			if (Min > M[i][j])
			{
				Min = M[i][j];
			}
		}
		return Min;
	}
	public static int FindMin_j(int[][] M, int j, int n)
	{
		int Min = M[0][j];
		for (int i = 0 ; i < n ; i++)
		{
			if (Min > M[i][j])
			{
				Min = M[i][j];
			}
		}
		return Min;
	}
	public static int S(int[][] M, int n)
	{
		if (n == 1)
		{
			return sum;
		}
		int Min_i = 0;
		for (int i = 0 ; i < n ; i++)
		{
			Min_i = FindMin_i(M, i, n);
			for (int j = 0 ; j < n ;j++)
			{
				M[i][j] = M[i][j] - Min_i;
			}
		}
		int Min_j = 0;
		for (int j = 0 ; j < n ; j++)
		{
			Min_j = FindMin_j(M, j, n);
			for (int i = 0 ; i < n ; i++)
			{
				M[i][j] = M[i][j] - Min_j;
			}
		}
		sum = sum + M[1][1];
		///////////////////////////
		for (int i = 1 ; i < n - 1 ; i++)
		{
			M[i][0] = M[i + 1][0];
		}
		//////////////////////////
		for (int j = 1 ; j < n - 1 ; j++)
		{
			M[0][j] = M[0][j + 1];
		}
		/////////////////////////
		for (int i = 1 ; i < n - 1 ; i++)
		{
			for (int j = 1 ; j < n - 1 ; j++)
			{
				M[i][j] = M[i + 1][j + 1];
			}
		}
		//////////////////////////////////////////////////
		S(M, n - 1);
	}

	public static int Main()
	{
		int[][] M = new int[100][100];
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int num = 0 ; num < n ; num++)
		{
			for (int i = 0 ; i < n ; i++)
			{
				for (int j = 0 ; j < n ; j++)
				{
					M[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			sum = 0;
			System.out.print(S(M, n));
			System.out.print("\n");
		}
		return 0;
	}
}

