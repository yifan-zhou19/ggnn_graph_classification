package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????   **
	//*????? 1200012917 **
	//*???2012.11.24  **
	//********************************
	public static int[][] a = new int[101][101];
	public static int min1(int[][] b, int i, int n)
	{
		int min = b[i][0];
		for (int j = 1; j < n; j++)
		{
			if (min > b[i][j])
			{
				min = b[i][j];
			}
		}
		return min;
	}
	public static int min2(int[][] b, int i, int n)
	{
		int min = b[0][i];
		for (int j = 1; j < n; j++)
		{
			if (min > b[j][i])
			{
				min = b[j][i];
			}
		}
		return min;
	}
	public static int sum(int n)
	{
		for (int i = 0; i < n; i++)
		{
			int min = min1(a, i, n);
			/*int min = a[i][0];
			for (int j = 1; j < n; j++)
			{
				if (min > a[i][j])
				{
					min = a[i][j];        
				}
			}*/
			for (int j = 0; j < n; j++)
			{
				a[i][j] -= min; //??????????
			}
		}
		for (int i = 0; i < n; i++)
		{
			int min = min2(a, i, n);
			/*int min = a[0][i];
			for (int j = 1; j < n; j++)
			{
				if (min > a[j][i])
				{
					min = a[j][i];         
				}
			}*/
			for (int j = 0; j < n; j++)
			{
				a[j][i] -= min; //????????
			}
		}
		if (n == 2)
		{
			return a[1][1]; //??n = 2,??????2????????a[1][1]
		}
		else
		{
			int k = a[1][1]; //????????????
			for (int i = 1; i < n - 1; i++)
			{
				a[0][i] = a[0][i + 1];
				a[i][0] = a[i + 1][0];
				for (int j = 1; j < n - 1; j++)
				{
					a[i][j] = a[i + 1][j + 1]; //????????????????
				}
			}
			return k + sum(n - 1);
		}
	}
	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 0; j < n; j++)
			{
				for (k = 0; k < n; k++)
				{
					a[j][k] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
				System.out.print(sum(n));
				System.out.print("\n");
		}
		return 0;
	}

}

