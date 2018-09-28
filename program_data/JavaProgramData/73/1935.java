package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] s =
		{
			{0, 0, 0, 0, 0, 0}
		};
		int i;
		int j;
		int[][] t = new int[6][6];
		int a;
		int b;
		int c = 0;
		int m = 0;

		for (i = 1 ; i <= 5 ; i++)
		{
			for (j = 1 ; j <= 5 ; j++)
			{
				s[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}

		for (i = 1 ; i <= 5 ; i++)
		{
			a = i, b = 1, t[a][b] = s[i][1];

			for (j = 1 ; j <= 5 ; j++)
			{
				if (t[a][b] < s[i][j])
				{
					a = i, b = j, t[a][b] = s[i][j];
				}
			}

			for (j = 1 ; j <= 5 ; j++)
			{
				if (t[a][b] <= s[j][b])
				{
					c++;
				}
			}

			if (c == 5)
			{
				System.out.print(a);
				System.out.print(' ');
				System.out.print(b);
				System.out.print(' ');
				System.out.print(t[a][b]);
				System.out.print("\n");
				m = 1;
			}

			c = 0;
		}

		if (m == 0)
		{
			System.out.print("not found");
			System.out.print("\n");
		}

		return 0;
	}




}

