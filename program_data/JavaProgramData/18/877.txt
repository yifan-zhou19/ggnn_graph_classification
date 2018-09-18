package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] maze = new int[100 + 10][100 + 10];

		int i;
		int j;
		int k;
		int l;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));


		for (k = 0; k < n; k++)
		{
			int sum = 0;
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n ;j++)
				{
					maze[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}


			for (l = n; l >= 2; l--)
			{
				for (i = 0; i < l; i++)
				{
					int min = 1000000;
					for (j = 0; j < l; j++)
					{
						min = min < *(*(maze + i) + j) ? min : *(*(maze + i) + j);
					}
					for (j = 0; j < l; j++)
					{
						*(*(maze + i) + j) -= min;
					}
				}

				for (i = 0; i < l; i++)
				{
					int min = 1000000;
					for (j = 0; j < l; j++)
					{
						min = min < *(*(maze + j) + i) ? min : *(*(maze + j) + i);
					}
					for (j = 0; j < l; j++)
					{
						*(*(maze + j) + i) -= min;
					}
				}
				sum += *(*(maze + 1) + 1);
				for (i = 1; i < l - 1; i++)
				{
					for (j = 0; j < l; j++)
					{
						*(*(maze + i) + j) = *(*(maze + i + 1) + j);
					}
				}
				for (i = 1; i < l - 1; i++)
				{
					for (j = 0; j < l; j++)
					{
						*(*(maze + j) + i) = *(*(maze + j) + i + 1);
					}
				}
			}

			System.out.print(sum);
			System.out.print("\n");
		}

		return 0;
	}


}

