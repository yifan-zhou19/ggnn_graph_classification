package <missing>;

public class GlobalMembers
{
	/**********************
	*file:2.cpp
	*author:?? 
	*time:2013-12-9 
	*description:????????????? 
	**********************/
	public static int Main()
	{
		int[][] b = new int[9][9];
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j < 9; j++)
			{
				b[i][j] = 0;
			}
		}
		b[4][4] = m; //???
		void f(int p[][9], int n);
		f(b, n); //????
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j < 9; j++)
			{
				System.out.print(b[i][j]);
				if (j < 8)
				{
					System.out.print(' ');
				}
			}
			System.out.print("\n");
		} //??
		return 0;
	}
	public static void f(int[][] p, int n)
	{
		if (n == 0)
		{
		return; //??????
		}
		f(p, n - 1); //??
		int[][] w = new int[9][9];
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j < 9; j++)
			{
				w[i][j] = p[i][j];
			}
		}
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j < 9; j++)
			{
				if (p[i][j] > 0)
				{
					for (int k = i - 1; k <= i + 1; k++)
					{
						for (int s = j - 1; s <= j + 1; s++)
						{
							w[k][s] = w[k][s] + p[i][j];
						}
					}
				}
			}
		} //??????
		for (int i = 0; i < 9; i++)
		{
			for (int j = 0; j < 9; j++)
			{
				p[i][j] = w[i][j];
			}
		}
	}
}

