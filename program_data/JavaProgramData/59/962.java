package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int m;
		int sum = 0;
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (int i = 0; i < n; i++)
		{
			for (int j = 0; j < n; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				b[i][j] = a[i][j];
				if (a[i][j] == '@')
				{
					sum++;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		for (int k = 1; k < m; k++)
		{
			for (int p = 0; p < n; p++)
			{
				for (int q = 0; q < n; q++)
				{
					if (b[p][q] == '@')
					{
						if (q < n - 1 && b[p][q + 1] == '.' && a[p][q + 1] == '.')
						{
							sum++;
							a[p][q + 1] = '@';
						}
						if (p < n - 1 && b[p + 1][q] == '.' && a[p + 1][q] == '.')
						{
							sum++;
							a[p + 1][q] = '@';
						}
						if (p > 0 && b[p - 1][q] == '.' && a[p - 1][q] == '.')
						{
							sum++;
							a[p - 1][q] = '@';
						}
						if (q > 0 && b[p][q - 1] == '.' && a[p][q - 1] == '.')
						{
							sum++;
							a[p][q - 1] = '@';
						}
					}
				}

			}
			for (int g = 0; g < n; g++)
			{
				for (int h = 0; h < n; h++)
				{
					b[g][h] = a[g][h];
				}
			}
		}
		System.out.print(sum);
		System.out.print("\n");

		return 0;
	}


}

