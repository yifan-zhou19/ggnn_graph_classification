package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int k;
		int[][] array = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		k = n;
		m = n;
		while (m > 0)
		{
			int i;
			int j;
			int min;
			for (i = 0;i < n;i++)
			{
				for (j = 0;j < n;j++)
				{
					array[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
		int sum = 0;
		while (k > 1)
		{
			for (i = 0;i < k;i++)
			{
				min = array[i][0];
				for (j = 1;j < k;j++)
				{
					if (array[i][j] < min)
					{
						min = array[i][j];
					}
				}
				for (j = 0;j < k;j++)
				{
					array[i][j] -= min;
				}
			}
			for (i = 0;i < k;i++)
			{
				min = array[0][i];
				for (j = 1;j < k;j++)
				{
					if (array[j][i] < min)
					{
						min = array[j][i];
					}
				}
				for (j = 0;j < k;j++)
				{
					array[j][i] -= min;
				}
			}
			sum += array[1][1];
			for (i = 0;i < k;i++)
			{
				for (j = 1;j < k - 1;j++)
				{
					array[i][j] = array[i][j + 1];

				}
			}
			for (j = 0;j < k - 1;j++)
			{
				for (i = 1;i < k - 1;i++)
				{
					array[i][j] = array[i + 1][j];
				}
			}
			k--;
		}
		System.out.print(sum);
		System.out.print("\n");
		k = n;
		m--;
		}
		return 0;
	}






}

