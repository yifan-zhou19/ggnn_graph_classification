package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] matrix = new int[100][100];
		int time;
		int min;
		int sum = 0;
		int k;
		for (k = 1; k <= n; k++)
		{
			int i;
			int j;
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					*(*(matrix + i) + j) = ConsoleInput.readToWhiteSpace(true);
				}
			}
			sum = 0;
			for (time = 1; time < n; time++)
			{
				for (i = 0; i <= n - time; i++)
				{
					min = (*(matrix + i));
					for (j = 0; j <= n - time; j++)
					{
						if (*(*(matrix + i) + j) < min)
						{
							min = (*(matrix + i) + j);
						}
					}
					for (j = 0; j <= n - time; j++)
					{
						*(*(matrix + i) + j) -= min;
					}
				}
				for (j = 0; j <= n - time; j++)
				{
					min = ((matrix) + j);
					for (i = 0; i <= n - time; i++)
					{
						if (*(*(matrix + i) + j) < min)
						{
							min = (*(matrix + i) + j);
						}
					}
					for (i = 0; i <= n - time; i++)
					{
						*(*(matrix + i) + j) -= min;
					}
				}
				sum += *(*(matrix + 1) + 1);
				for (i = 1; i <= n - time; i++)
				{
					for (j = 0; j <= n - time; j++)
					{
						*(*(matrix + i) + j) = *(*(matrix + i + 1) + j);
					}
				}
				for (j = 1; j <= n - time; j++)
				{
					for (i = 0; i <= n - time; i++)
					{
						*(*(matrix + i) + j) = *(*(matrix + i) + j + 1);
					}
				}
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}
}

