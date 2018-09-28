package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int t;
		int itime = 0;
		int[][] mat1 = new int[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int i = 0; i < n; i++)
		{
			m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			mat1[i][0] = m;
			for (int j = 1; j < m + 1; j++)
			{
				mat1[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (int i = 0; i < n; i++)
		{
			m = mat1[i][0];
			if (mat1[i][0] == 0)
			{
				System.out.print(60);
				System.out.print("\n");
				continue;
			}
				for (int j = 1; j < m + 1; j++)
				{

					t = mat1[i][j];

					if ((t + j * 3) >= 60 && (t + j * 3) < 63)
					{
						System.out.print(t);
						System.out.print("\n");
						break;
					}

				   if ((t + j * 3) >= 60 && (t + j * 3) >= 63)
				   {
						System.out.print((63 - j * 3));
						System.out.print("\n");
						break;
				   }
					if (j == m)
					{
						System.out.print((60 - j * 3));
						System.out.print("\n");
					}
				}
		}
		return 0;
	}
}

