package <missing>;

public class GlobalMembers
{
	public static int[][] map = new int[20000][20000];
	public static int Main()
	{
		int n;
		int i;
		int j;
		int found = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		while ((i != 0) || (j != 0))
		{
			map[i][j] = 1;
			i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			j = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		for (i = 0; i < n; i++)
		{
			int mark = 0;
			for (j = 0; j < n; j++)
			{
				if ((map[i][j] == 1) && (i != j))
				{
					mark = 1;
					break;
				}
			}
			if (mark == 0)
			{
				int mark2 = 0;
				for (j = 0; j < n; j++)
				{
					if ((j != i) && (map[j][i] == 1))
					{
						mark2++;
					}
				}
				if (mark2 == n - 1)
				{
					found = 1;
					System.out.print(i);
					System.out.print("\n");
					break;
				}
			}
		}
		if (found == 0)
		{
			System.out.print("NOT FOUND");
			System.out.print("\n");
		}
		return 0;
	}
}

