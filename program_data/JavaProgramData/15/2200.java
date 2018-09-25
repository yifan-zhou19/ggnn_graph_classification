package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int x1;
		int y1;
		int x2;
		int y2;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] s = new int[100][100];
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				s[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i <= n;i++)
		{
			s[i][0] = 255;
			s[i][n + 1] = 255;
		}
		for (j = 1;j <= n;j++)
		{
			s[0][j] = 255;
			s[n + 1][j] = 255;
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (s[i][j] == 0 && s[i][j + 1] == 0 && s[i + 1][j] == 0)
				{
					x1 = i;
					y1 = j;
				}
				if (s[i][j] == 0 && s[i][j - 1] == 0 && s[i - 1][j] == 0)
				{
					x2 = i;
					y2 = j;
				}
			}
		}
		System.out.print((x2 - x1 - 1) * (y2 - y1 - 1));
		return 0;
	}

}

