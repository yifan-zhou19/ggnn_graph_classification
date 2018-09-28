package <missing>;

public class GlobalMembers
{
	public static int[][] A = new int[200][200];
	public static int n;
	public static void F(int i,int j)
	{

			if (A[i - 1][j] == -1)
			{
				A[i - 1][j] = A[i][j] + 1;
				F(i - 1, j);
			}
			else if (A[i - 1][j] > 0 && A[i][j] + 1 < A[i - 1][j])
			{

				A[i - 1][j] = A[i][j] + 1;
				F(i - 1, j);
			}

			if (A[i + 1][j] == -1)
			{
				A[i + 1][j] = A[i][j] + 1;
				F(i + 1, j);
			}
			else if (A[i + 1][j] > 0 && A[i][j] + 1 < A[i + 1][j])
			{

				A[i + 1][j] = A[i][j] + 1;
				F(i + 1, j);
			}

			if (A[i][j - 1] == -1)
			{
				A[i][j - 1] = A[i][j] + 1;
				F(i, j - 1);
			}
			else if (A[i][j - 1] > 0 && A[i][j] + 1 < A[i][j - 1])
			{

				A[i][j - 1] = A[i][j] + 1;
				F(i, j - 1);
			}
			if (A[i][j + 1] == -1)
			{
				A[i][j + 1] = A[i][j] + 1;
				  F(i, j + 1);
			}
			else if (A[i][j + 1] > 0 && A[i][j] + 1 < A[i][j + 1])
			{

				A[i][j + 1] = A[i][j] + 1;
				  F(i, j + 1);
			}


	}
	public static int Main()
	{
		for (int i = 0;i < 200;i++)
		{
			for (int j = 0;j <= 200;j++)
			{
				A[i][j] = -5;
			}
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		char p;
		for (int i = 1;i <= n;i++) //???????????
		{
			for (int j = 1;j <= n;j++)
			{
				p = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (p == '.')
				{
					A[i][j] = -1;
				}
				if (p == '@')
				{
					A[i][j] = 0;
				}
				if (p == '#')
				{
					A[i][j] = -2;
				}
			}
		}
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				if (A[i][j] >= 0)
				{
					F(i, j);
				}
			}
		}
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int num = 0;
		for (int i = 1;i <= n;i++)
		{
			for (int j = 1;j <= n;j++)
			{
				if (A[i][j] >= 0 && A[i][j] < m)
				{
					num++;
				}
			}
		}
		System.out.print(num);
			return 0;
	}



}

