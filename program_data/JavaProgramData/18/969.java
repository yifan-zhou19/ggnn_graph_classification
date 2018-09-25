package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int nn;
		int n;
		int i;
		int j;
		int k;
		int[] min = new int[100];
		int[][] maze = new int[100][100];
		int sum;
		nn = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 0; k < nn; k++)
		{
			sum = 0;
			n = nn;
			for (i = 0; i < nn; i++)
			{
				for (j = 0; j < nn; j++)
				{
					maze[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
			while (n > 1)
			{
			for (i = 0; i < n; i++)
			{
				min[i] = maze[i][0];
				for (j = 1; j < n; j++)
				{
					min[i] = min[i] < maze[i][j] != 0 ? min[i] : maze[i][j];
				}
			}
			for (i = 0; i < n; i++)
			{
				for (j = 0; j < n; j++)
				{
					maze[i][j] -= min[i];
				}
			}
			for (j = 0; j < n; j++)
			{
				min[j] = maze[0][j];
				for (i = 1; i < n; i++)
				{
					min[j] = min[j] < maze[i][j] != 0 ? min[j] : maze[i][j];
				}
			}
			for (j = 0; j < n; j++)
			{
				for (i = 0; i < n; i++)
				{
					maze[i][j] -= min[j];
				}
			}
			sum += maze[1][1];
			for (i = 1; i < n - 1; i++)
			{
				maze[i][0] = maze[i + 1][0];
			}
			for (j = 1; j < n - 1; j++)
			{
				maze[0][j] = maze[0][j + 1];
			}
			for (i = 1; i < n - 1; i++)
			{
				for (j = 1; j < n - 1; j++)
				{
					maze[i][j] = maze[i + 1][j + 1];
				}
			}
			n--;
			}
			System.out.print(sum);
			System.out.print("\n");
		}
		return 0;
	}


}

