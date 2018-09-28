package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] x = new int[5][5];
		int i;
		int j;
		int m;
		int r;
		int c;
		for (i = 0;i < 5;i++)
		{
			for (j = 0;j < 5;j++)
			{
				x[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i < 5;i++)
		{
			m = 1 << 31;
			for (j = 0;j < 5;j++)
			{
				if (x[i][j] > m)
				{
					m = x[i][j];
					r = i;
					c = j;
				}
			}
			if (m <= x[0][c] != 0 && m <= x[1][c] != 0 && m <= x[2][c] != 0 && m <= x[3][c] != 0 && m <= x[4][c])
			{
				System.out.print(r + 1);
				System.out.print(" ");
				System.out.print(c + 1);
				System.out.print(" ");
				System.out.print(m);
				System.out.print("\n");
				return 0;
			}
		}
		System.out.print("not found\n");
		return 0;
	}
}

