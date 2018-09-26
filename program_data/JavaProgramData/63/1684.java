package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[200][200];
		int[][] b = new int[200][200];
		int[][] c = new int[200][200];
		int x1;
		int y1;
		int x2;
		int y2;
		x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < x1;i++)
		{
			for (int j = 0;j < y1;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0;i < x2;i++)
		{
			for (int j = 0;j < y2;j++)
			{
				b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (int i = 0;i < x1;i++)
		{
			for (int j = 0;j < y2;j++)
			{
		int t = 0;
				while (t <= y1)
				{
					c[i][j] = c[i][j] + a[i][t] * b[t][j];
					t++;
				}
			}
		}
		int count = 0;
		for (int i = 0;i < x1;i++)
		{
			System.out.print(c[i][0]);
			if ((y2 - 1) == 0)
			{
				System.out.print("\n");
			}
			for (int j = 1;j < y2;j++)
			{
				System.out.print(" ");
				System.out.print(c[i][j]);
				count++;
				if ((count % (y2 - 1)) == 0)
				{
					System.out.print("\n");
				}
			}
		}
		return 0;
	}
}

