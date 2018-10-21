package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] array = new int[100][100];
		int n;
		int m;
		int i1;
		int i2;
		int j1;
		int j2;
		int s1;
		int s2;
		int t;
		int h;
		int num = 0;
		int k;

		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));

		k = n * m;

		if (n % 2 == 0)
		{
			h = n / 2;
		}
		else
		{
			h = n / 2 + 1;
		}

		for (i1 = 0; i1 < n; i1++)
		{
		for (j1 = 0; j1 < m; j1++)
		{
		array[i1][j1] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		}
		}

		for (i1 = 0; i1 < h; i1++)
		{
			for (j1 = i1; j1 < m - i1; j1++)
			{
				if (num >= k)
				{
					break;
				}

				System.out.print(array[i1][j1]);
				System.out.print("\n");

				s1 = j1;

				num++;
			}

			for (i2 = i1 + 1; i2 < n - i1; i2++)
			{
				if (num >= k)
				{
					break;
				}

				System.out.print(array[i2][s1]);
				System.out.print("\n");

				t = i2;

				num++;
			}

			for (j2 = s1 - 1; j2 >= i1; j2--)
			{
				if (num >= k)
				{
					break;
				}

				System.out.print(array[t][j2]);
				System.out.print("\n");

				s2 = j2;

				num++;
			}

			for (i2 = t - 1; i2 >= i1 + 1; i2--)
			{
				if (num >= k)
				{
					break;
				}

				System.out.print(array[i2][s2]);
				System.out.print("\n");

				num++;
			}
		}

		return 0;
	}

}

