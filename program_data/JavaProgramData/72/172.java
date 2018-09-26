package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] h = new int[20][20];
		int m;
		int n;
		int i;
		int j;
		int[][] flag = new int[20][20];
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				h[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}

		}


		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i + 1 >= 0 && i + 1 < m && h[i + 1][j]> h[i][j])
				{
					flag[i][j] = 1;
				}

				if (i - 1 >= 0 && i - 1 < m && h[i - 1][j]> h[i][j])
				{
					flag[i][j] = 1;
				}

				if (j - 1 >= 0 && j - 1 < n && h[i][j - 1]> h[i][j])
				{
					flag[i][j] = 1;
				}

				if (j + 1 >= 0 && j + 1 < n && h[i][j + 1]> h[i][j])
				{
					flag[i][j] = 1;
				}


			}
		}

		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (flag[i][j] == 0)
				{
					System.out.print(i);
					System.out.print(" ");
					System.out.print(j);
					System.out.print("\n");
				}

			}
		}


		return 0;
	}

}

