package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[6][6];
		int i;
		int j;
		int m;
		int n;
		int max;
		for (i = 1;i <= 5; i++)
		{
			for (j = 1; j <= 5;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i <= 5;i++)
		{
				max = 0;
				for (j = 1; j <= 5;j++)
				{
					if (a[i][j] > max)
					{
						max = a[i][j];
						m = i;
						n = j;
					}
				}
				for (j = 1;j <= 5; j++)
				{
						if (a[j][n] < max)
						{
							break;
						}
				}
				if (j == 6)
				{
						System.out.print(m);
						System.out.print(" ");
						System.out.print(n);
						System.out.print(" ");
						System.out.print(a[m][n]);
						System.out.print("\n");
						break;
				}
		}
			if (i == 6)
			{
				System.out.print("not found");
				System.out.print("\n");
			}
			return 0;
	}
}

