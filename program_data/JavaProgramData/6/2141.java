package <missing>;

public class GlobalMembers
{
	//****************************************************
	// file: 3.cpp
	// description: ??????????
	// author? ?? 1200012858
	// date? 2012-11-8
	//****************************************************
	public static int Main()
	{
		int k;
		int l;
		int m;
		int n;
		int i;
		int j;
		int sum = 0;
		int[][] array = new int[100][100];
		k = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (l = 1; l <= k; l++)
		{
			sum = 0;
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (m == 1 || n == 1)
			{
				for (i = 0; i < m; i++)
				{
					for (j = 0; j < n; j++)
					{
							array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
							sum += array[i][j];
					}
				}
				System.out.print(sum);
				System.out.print("\n");
				break;
			}
			i = 0;
			for (j = 0; j < n; j++)
			{
				array[0][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				sum += array[0][j];
			}
			for (i = 1; i < m - 1; i++)
			{
				for (j = 0; j < n; j++)
				{
					array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
				sum = sum + array[i][0] + array[i][j - 1];
			}
			i = m - 1;
			for (j = 0; j < n; j++)
			{
				array[m - 1][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				sum += array[m - 1][j];
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

