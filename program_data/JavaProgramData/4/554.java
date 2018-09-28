package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int r;
		int c;
		int i = 0;
		int j = 0;
		int x = 0;
		int y;
		r = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = r + c;
		for (i = 0;i < r;i++)
		{
				for (j = 0;j < c;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
		}
		while (x <= y)
		{
			for (i = 0;i < r;i++)
			{
				for (j = 0;j < c;j++)
				{
					if (i + j == x)
					{
						System.out.print(a[i][j]);
						System.out.print("\n");
					}
				}
			}
			x++;
		}
		return 0;
	}
}

