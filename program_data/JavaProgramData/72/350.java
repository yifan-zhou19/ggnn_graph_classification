package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] m = new int[20][20];
		int x;
		int y;
		int f;
		x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		y = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < y; j++)
			{
				m[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (int i = 0; i < x; i++)
		{
			for (int j = 0; j < y; j++)
			{
				f = 0;
				if (i > 0)
				{
					if (m[i][j] >= m[i - 1][j])
					{
						f++;
					}
				}
				else
				{
					f++;
				}
				if (j > 0)
				{
					if (m[i][j] >= m[i][j - 1])
					{
						f++;
					}
				}
				else
				{
					f++;
				}
				if (i < x - 1)
				{
					if (m[i][j] >= m[i + 1][j])
					{
						f++;
					}
				}
				else
				{
					f++;
				}
				if (j < y - 1)
				{
					if (m[i][j] >= m[i][j + 1])
					{
						f++;
					}
				}
				else
				{
					f++;
				}
				if (f == 4)
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

