package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int m;
		int n;
		int i;
		int j;
		int[][] hill = new int[20][20];
		int ave;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				hill[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < m;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (i == 0 || hill[i][j] >= hill[i - 1][j])
				{
					if (i == m - 1 || hill[i][j] >= hill[i + 1][j])
					{
						if (j == 0 || hill[i][j] >= hill[i][j - 1])
						{
							if (j == n - 1 || hill[i][j] >= hill[i][j + 1])
							{
								System.out.print(i);
								System.out.print(" ");
								System.out.print(j);
								System.out.print("\n");
							}
						}
					}
				}
			}
		}
			return 0;


	}
}

