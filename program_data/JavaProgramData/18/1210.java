package <missing>;

public class GlobalMembers
{
	//
	// ????3.cpp
	// ????????????
	// ?????? 1200012943
	// ??:2012.11.21
	//
	public static int[][] a = new int[100][100];
	public static void shrink(int n)
	{
		for (int i = 1; i < n - 1; i++) // ?n??????n-1???
		{
			a[0][i] = a[0][i + 1];
			a[i][0] = a[i + 1][0];
			for (int j = 1; j < n - 1; j++)
			{
			a[i][j] = a[i + 1][j + 1];
			}
		}
	}
	public static int Sum(int n)
	{
		int i;
		for (i = 0; i < n; i++)
		{
			int min = a[i][0];
			int j;
			for (j = 1; j < n; j++)
			{
			if (a[i][j] < min)
			{
			min = a[i][j]; //?????
			}
			}
			for (j = 0; j < n; j++)
			{
			a[i][j] -= min; //?????
			}
		}
		for (i = 0; i < n; i++)
		{
			int min = a[0][i];
			int j;
			for (j = 1; j < n; j++)
			{
			if (a[j][i] < min)
			{
			min = a[j][i]; //?????
			}
			}
			for (j = 0; j < n; j++)
			{
			a[j][i] -= min; //?????
			}
		}
		if (n == 2) // n?2?????a[1][1]
		{
		return a[1][1];
		}
		int k = a[1][1];
		shrink(n);
		return k + Sum(n - 1);
	}
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				for (int k = 0; k < n; k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
				System.out.print(Sum(n));
				System.out.print("\n");
		}
		return 0;
	}
}

