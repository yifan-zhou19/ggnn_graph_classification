package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????????   **
	//*?????? 1200012964 **
	//*???2012-11-19  **
	//********************************

	public static void fact(int n)
	{
		//?????????
		for (i = 0; i < n; i++)
		{
			int min = a[i][0];
			for (j = 0; j < n; j++)
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
				for (j = 0; j < n; j++)
				{
					a[i][j] -= min;
				}
		}
		//?????????
		for (i = 0; i < n; i++)
		{
			int min = a[0][i];
			for (j = 0; j < n; j++)
			{
				if (a[j][i] < min)
				{
					min = a[j][i];
				}
			}
				for (j = 0; j < n; j++)
				{
					a[j][i] -= min;
				}
		}
	}
	public static int sum(int n)
	{
		fact(n);
		if (n == 2)
		{
			return a[1][1]; //?n?2?????a[1][1]
		}
		int k = a[1][1];
		//????
		for (i = 1; i < n - 1; i++)
		{
			a[0][i] = a[0][i + 1];
			a[i][0] = a[i + 1][0];
			for (j = 1; j < n - 1; j++)
			{
				a[i][j] = a[i + 1][j + 1];
			}
		}
		return k + sum(n - 1); //??
	}
	public static int[][] a = new int[100][100];
	public static int i = 0; //??????
	public static int j = 0;
	public static int Main()
	{
		int n; //n?????
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int k = 0;
		for (k = 1; k <= n; k++)
		{
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
				System.out.print(sum(n));
				System.out.print("\n");
		}
		return 0;
	}
}

