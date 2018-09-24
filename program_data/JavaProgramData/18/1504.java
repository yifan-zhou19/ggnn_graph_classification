package <missing>;

public class GlobalMembers
{
	//********************************
	//*???2.cpp   **
	//*?????? 1200012768 **
	//*???2012.11.21  **
	//*????????????  **
	//********************************
	public static int sum = 0;
	public static int[] r_small = new int[100];
	public static int[] c_small = new int[100];

	public static int fun(int[][] num, int n)
	{
		if (n == 1)
		{
			return sum;
		}
		int i;
		int j;
		small1(num, n); //????????
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				num[i][j] = num[i][j] - r_small[i]; //????????????
			}
		}
		small2(num, n); //????????????
		for (j = 0; j < n; j++)
		{
			for (i = 0; i < n; i++)
			{
				num[i][j] = num[i][j] - c_small[j]; //????????????
			}
		}
		sum += num[1][1]; //??sum
		for (i = 0; i < n; i++)
		{
			for (j = 1; j < n - 1; j++)
			{
				num[i][j] = num[i][j + 1]; //??
			}
		}
		for (j = 0; j < n - 1; j++)
		{
			for (i = 1; i < n - 1; i++)
			{
				num[i][j] = num[i + 1][j];
			}
		}
		fun(num, n - 1); //??
	}

	public static void small1(int[][] num, int n)
	{
		int i;
		int j;
		for (i = 0; i < n; i++)
		{
			r_small[i] = num[i][0];
			for (j = 1; j < n; j++)
			{
				r_small[i] = (r_small[i] < num[i][j]) ? r_small[i] : num[i][j];
			}
		}
	}

	public static void small2(int[][] num, int n)
	{
		int i;
		int j;
		for (j = 0; j < n; j++)
		{
			c_small[j] = num[0][j];
			for (i = 1; i < n; i++)
			{
				c_small[j] = (c_small[j] < num[i][j]) ? c_small[j] : num[i][j];
			}
		}
	}

	public static int Main()
	{
		int n;
		int i;
		int j;
		int[][] num = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int p = 0; p < n; p++)
		{
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					num[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			fun(num, n);
			System.out.print(sum);
			System.out.print("\n");
			sum = 0; //???????????
		}
		return 0;
	}
}

