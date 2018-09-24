package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		int[][] a = new int[100][100];
		while (n-- != 0)
		{
			int x;
			int y;
			int sum = 0;
			x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			for (int i = 0;i < x;i++)
			{
			for (int j = 0;j < y;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
			}
			for (int i = 0;i < x;i++)
			{
				if (y != 1)
				{
					sum += a[i][0] + a[i][y - 1];
				}
				else
				{
					sum += a[i][0];
				}
			}
			for (int j = 1;j < y - 1;j++)
			{
				sum += a[0][j] + a[x - 1][j];
			}
			System.out.print(sum);
			System.out.print("\n");
		}

		return 0;
	}

}

