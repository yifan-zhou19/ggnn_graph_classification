package <missing>;

public class GlobalMembers
{
	//1000012915???

	public static int GL(int n, int[][] a)
	{
		int Sum;
		int i;
		int j;
		int MIN;

		for (i = 0;i < n;i++) //????????
		{
			MIN = a[i][0];
			for (j = 1;j < n;j++)
			{
				MIN = min(MIN, a[i][j]);
			}
			for (j = 0;j < n;j++)
			{
				a[i][j] = a[i][j] - MIN;
			}
		}

		for (j = 0;j < n;j++) //?????????
		{
			MIN = a[0][j];
			for (i = 1;i < n;i++)
			{
				MIN = min(MIN, a[i][j]);
			}
			for (i = 0;i < n;i++)
			{
				a[i][j] = a[i][j] - MIN;
			}
		}

		Sum = a[1][1]; //????a[1][1]

		if (n != 2) //??
		{
			Delete(n, a);
			Sum = Sum + GL(n - 1, a);
			return Sum;
		}

		else
		{
			return Sum; //????
		}
	}
	public static int Delete(int n, int[][] a)
	{
		int i;
		int j;
		for (i = 0;i < n;i++)
		{
			for (j = 1;j < n - 1;j++)
			{
				a[i][j] = a[i][j + 1];
			}
			a[i][n - 1] = 0;
		}

		for (j = 0;j < n - 1;j++)
		{
			for (i = 1;i < n - 1;i++)
			{
				a[i][j] = a[i + 1][j];
			}
			a[n - 1][j] = 0;
		}

		return 0;

	}
	public static int min(int a, int b)
	{
		if (a >= b)
		{
			return b;
		}
		else
		{
			return a;
		}
	}

	public static int Main()
	{
		int[] Sum = new int[101]; //????????Sum
		int n;
		int[][] a = new int[101][101];
		int i;
		int j;
		int k;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++) //????
			{
				for (k = 0;k < n;k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}

			Sum[i] = GL(n, a); //????
		}

		for (i = 0;i < n;i++)
		{
			System.out.print(Sum[i]);
			System.out.print("\n");
		}
		return 0;
	}
}

