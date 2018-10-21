package <missing>;

public class GlobalMembers
{
	public static int[] dx = {1, -1, 0, 0};
	public static int[] dy = {0, 0, 1, -1};
	public static int Main()
	{
		int m;
		int n;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		double[][] mount = new double[22][22];
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++)
			{
				mount[i][j] = Double.parseDouble(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0; i < m; i++)
		{
			for (int j = 0; j < n; j++)
			{
				int num = 0;
				double sum = 0;
				int k;
				for (k = 0; k < 4; k++)
				{
					int tempi = i + dx[k];
					int tempj = j + dy[k];
					if (tempi >= 0 && tempi < m && tempj >= 0 && tempj < n)
					{
						if (mount[i][j] < mount[tempi][tempj])
						{
							break;
						}
					}
				}
				if (k == 4)
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

