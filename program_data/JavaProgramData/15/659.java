package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int n;
		int i;
		int j;
		int x1 = 0;
		int x2 = 0;
		int y1 = 0;
		int y2 = 0;
		int x = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < n;i++)
		{
			for (j = 0;j < n;j++)
			{
				if (a[i][j] == 0)
				{
					x1 = j;
					y1 = i;
					x = 1;
					break;
				}

			}
			if (x != 0)
			{
				break;
			}
		}
		x = 0;
		for (i = n - 1;i >= 0;i--)
		{
			for (j = n - 1;j >= 0;j--)
			{
				if (a[i][j] == 0)
				{
					x2 = j;
					y2 = i;
					x = 1;
					break;
				}

			}
			if (x != 0)
			{
				break;
			}
		}
		if (x1 == x2 || y1 == y2)
		{
			System.out.print(0);
			System.out.print("\n");
		}
		else
		{
			System.out.print((x2 - x1 - 1) * (y2 - y1 - 1));
			System.out.print("\n");
		}

		return 0;
	}

}

