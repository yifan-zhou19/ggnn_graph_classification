package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
		int m;
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 1;i <= m;i++)
		{
			int n;
			n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			if (n == 0)
			{
				System.out.print(60);
				System.out.print("\n");
			}
			else
			{
				for (int j = 1;j <= n;j++)
				{
					a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				}
			}
		}


		for (int i = 1;i <= m;i++)
		{
			for (int j = 1;j < 99;j++)
			{

				if ((a[i][j] + 3 * j) <= 60)
				{

					if (a[i][j + 1] != 0 && (a[i][j + 1] + 3 * (j + 1)) > 60)
					{
						if (a[i][j + 1] <= (60 - 3 * j))
						{
							System.out.print(a[i][j + 1]);
							System.out.print("\n");
						}
						if (a[i][j + 1] > (60 - 3 * j))
						{
							System.out.print(60 - 3 * j);
							System.out.print("\n");
						}
					}
					if (a[i][j] != 0 && a[i][j + 1] == 0)
					{
						System.out.print(60 - 3 * j);
						System.out.print("\n");
					}



				}


			}


		}
		return 0;
	}

}

