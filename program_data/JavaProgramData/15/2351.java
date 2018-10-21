package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] shuzu = new int[1002][1002];
		int n;
		int i;
		int j;
		int x1;
		int y1;
		int x2;
		int y2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				shuzu[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				if (shuzu[i][j] == 0 && shuzu[i][j + 1] == 0 && shuzu[i + 1][j] == 0)
				{
					x1 = i;
					y1 = j;
				}
				if (shuzu[i][j] == 0 && shuzu[i][j - 1] == 0 && shuzu[i - 1][j] == 0)
				{
					x2 = i;
					y2 = j;
				}
			}
		}
		System.out.print((x2 - x1 + 1) * (y2 - y1 + 1) - 2 * (x2 - x1 + 1) - 2 * (y2 - y1 + 1) + 4);
		System.out.print("\n");
		return 0;
	}


}

