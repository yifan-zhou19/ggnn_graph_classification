package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][] a = new char[100][100];
		char[][] b = new char[100][100];
		int[][] s = new int[100][100];
		int c = 0;
		int p = 0;
		int i;
		int j;
		int k;
		int n;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n; i++)
		{
			a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			b[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
		for (k = 0; k < n; k++)
		{
			c = 0;
			p = 0;
			for (i = String.valueOf(a[k]).length() - 1, j = String.valueOf(b[k]).length() - 1; j >= 0; i--, j--)
			{
				s[k][c] += a[k][i] - '0' - (b[k][j] - '0');
				if (s[k][c] < 0)
				{
					s[k][c] += 10;
					s[k][c + 1]--;
				}
				c++;
			}
			for (; i >= 0; i--)
			{
				s[k][c] += a[k][i] - '0';
				if (s[k][c] < 0)
				{
					s[k][c] += 10;
					s[k][c + 1]--;
				}
				c++;
			}
			for (i = 100; i >= 0; i--)
			{
				if (s[k][i] == 0 && p == 0)
				{
					continue;
				}
				else
				{
					p = 1;
					System.out.print(s[k][i]);
				}
			}
			if (p == 0)
			{
				System.out.print("0");
			}
			System.out.print("\n");
		}
		return 0;
	}
}

