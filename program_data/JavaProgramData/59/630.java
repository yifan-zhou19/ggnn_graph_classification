package <missing>;

public class GlobalMembers
{
	///#include <string>
	public static int[][][] grids = new int[100][100][100]; //day y x; grids: 0 noperson,1 healthyperson,2 illperson

	public static int Main()
	{
		int n;
		int i;
		int j;
		int k;
		int day;
		int illCount = 0;
		char stat;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			for (j = 0; j < n; j++)
			{
				stat = ConsoleInput.readToWhiteSpace(true).charAt(0);
				switch (stat)
				{
				case '.':
					grids[0][i][j] = 1;
					break;
				case '#':
					grids[0][i][j] = 0;
					break;
				case '@':
					grids[0][i][j] = 2;
					illCount++;
					break;
				}
			};
		}
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i < day; i++)
		{
			for (j = 0; j < n; j++)
			{
				for (k = 0; k < n; k++)
				{
					if (grids[i - 1][j][k] == 2)
					{
						grids[i][j][k] = 2;
						if (j != 0 && grids[i - 1][j - 1][k] == 1 && grids[i][j - 1][k] != 2)
						{
							illCount++;
							grids[i][j - 1][k] = 2;
						}
						if (j != n - 1 && grids[i - 1][j + 1][k] == 1 && grids[i][j + 1][k] != 2)
						{
							illCount++;
							grids[i][j + 1][k] = 2;
						}
						if (k != 0 && grids[i - 1][j][k - 1] == 1 && grids[i][j][k - 1] != 2)
						{
							illCount++;
							grids[i][j][k - 1] = 2;
						}
						if (k != n - 1 && grids[i - 1][j][k + 1] == 1 && grids[i][j][k + 1] != 2)
						{
							illCount++;
							grids[i][j][k + 1] = 2;
						}
					}
					else
					{
						if (grids[i][j][k] != 2)
						{
							grids[i][j][k] = grids[i - 1][j][k];
						}
					}
				}
			}
		}
		System.out.print(illCount);
		return 0;
	}
}

