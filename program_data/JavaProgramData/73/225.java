package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int t = 0;
		int col;
		int g = 0;
		for (i = 0; i <= 4; i++)
		{
			for (j = 0; j <= 4; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
			for (i = 0; i <= 4; i++)
			{
				for (j = 0; j <= 4; j++)
				{
					if (t < a[i][j])
					{
						t = a[i][j];
						col = j;
					}
				}
				if (t <= a[0][col] != 0 && t <= a[1][col] != 0 && t <= a[2][col] != 0 && t <= a[3][col] != 0 && t <= a[4][col])
				{
					System.out.print(i + 1);
					System.out.print(" ");
					System.out.print(col + 1);
					System.out.print(" ");
					System.out.print(t);
					System.out.print("\n");
				}
				else
				{
					t = 0;
					g++;
				}
			}
			if (g == 5)
			{
				System.out.print("not found");
				System.out.print("\n");
			}
			return 0;
	}
}

