package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????????   **
	//*?????? 1200012988 **
	//*???2012.11.19  **
	//********************************


	public static int[][] a = new int[100][100]; //??a?????

	public static int smaller(int a, int b)
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

	public static int Sum(int n)
	{
		for (int i = 0; i < n; i++)
		{
			int min = a[i][0];
			for (int j = 1; j < n; j++)
			{
				min = smaller(min, a[i][j]); //????????
			}
			for (int j = 0; j < n; j++)
			{
				a[i][j] -= min; //?????????????
			}
		}
		for (int j = 0; j < n; j++)
		{
			int min = a[0][j];
			for (int i = 0; i < n; i++)
			{
				min = smaller(min, a[i][j]); //????????
			}
			for (int i = 0; i < n; i++)
			{
				a[i][j] -= min; //?????????????
			}
		}
		if (n == 2) //n?2??????????????????a[1][1]
		{
			return a[1][1];
		}
		int k = a[1][1];
		for (int i = 1; i < n - 1; i++) //?n??????n-1???
		{
			a[0][i] = a[0][i + 1];
			a[i][0] = a[i + 1][0];
			for (int j = 1; j < n - 1; j++)
			{
				a[i][j] = a[i + 1][j + 1];
			}
		}
		return k + Sum(n - 1); //?????
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

