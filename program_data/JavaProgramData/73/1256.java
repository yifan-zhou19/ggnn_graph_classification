package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[5][5];
		int i;
		int j;
		int m;
		int n;
		int x = 1;
		for (i = 0;i <= 4;i++)
		{
			for (j = 0;j <= 4;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 0;i <= 4;i++)
		{
				for (j = 0;j <= 4;j++)
				{
					int w = 1;
					int v = 1;
					for (m = 0;m <= 4;m++)
					{
						if (a[i][j] < a[i][m])
						{
						w = 0;
						break;
						}
					}
					for (n = 0;n <= 4;n++)
					{
						if (a[i][j] > a[n][j])
						{
						v = 0;
						break;
						}
					}
					if (w != 0 && v != 0)
					{
						System.out.print(i + 1);
						System.out.print(" ");
						System.out.print(j + 1);
						System.out.print(" ");
						System.out.print(a[i][j]);
						System.out.print("\n");
						x = 0;
					}
				}
		}
		if (x != 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}
		return 0;
	}
}

