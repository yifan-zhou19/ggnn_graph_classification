package <missing>;

public class GlobalMembers
{
	/*????:?????????
	 *??:???
	 *??:2010/12/1
	 *??:1000010449
	*/
	public static int[][] a = new int[100][100];
	public static int change(int m)
	{
		int i;
		int j;
		int k = 0;
		int min;
		int value;

		if (m == 1)
		{
			return 0;
		}

		for (i = 0; i < m; i++) //????
		{
			min = a[i][0];
			for (j = 0; j < m; j++) //????
			{
				if (a[i][j] < min)
				{
					min = a[i][j];
				}
			}
			for (j = 0; j < m; j++)
			{
				a[i][j] -= min;
			}
		}

		for (i = 0; i < m; i++) //????
		{
			min = a[0][i];
			for (j = 0; j < m; j++) //????
			{
				if (a[j][i] < min)
				{
					min = a[j][i];
				}
			}
			for (j = 0; j < m; j++)
			{
				a[j][i] -= min;
			}
		}

		value = a[1][1]; //??a[1][1]??
		//??
		for (i = 1; i < m - 1; i++) //??
		{
			for (j = 0; j < m; j++) //??
			{
				a[i][j] = a[i + 1][j]; //?????
			}
		}

		for (j = 1; j < m - 1; j++) //??
		{
			for (i = 0; i < m - 1; i++) //??
			{
				a[i][j] = a[i][j + 1]; //?????
			}
		}

		return value + change(m - 1);
	}
	public static int Main()
	{
		int n;
		int i;
		int j;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n * n; j++)
			{
				a[j / n][j % n] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

			System.out.print(change(n));
			System.out.print("\n");
		}
		return 0;
	}

}

