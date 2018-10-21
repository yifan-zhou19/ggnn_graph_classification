package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int h;
		int h0;
		int m;
		int[] b = new int[10502];
		int[] c = new int[10502];
		char[][] a = new char[102][102];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1, h = 0 ; i <= n ; i++)
		{
			for (j = 1 ; j <= n ; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (a[i][j] == '@')
				{
					h++;
					b[h] = i;
					c[h] = j;
				}
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i <= n + 1 ; i++)
		{
			a[i][0] = '#';
			a[0][i] = '#';
			a[n + 1][i] = '#';
			a[i][n + 1] = '#';
		}
		for (i = 2 ; i <= m ; i++)
		{
			for (j = 1, h0 = h ; j <= h ; j++)
			{
				if (a[b[j]][c[j] + 1] == '.')
				{
					h0++;
					b[h0] = b[j];
					c[h0] = c[j] + 1;
					a[b[h0]][c[h0]] = '@';
				}
				if (a[b[j]][c[j] - 1] == '.')
				{
					h0++;
					b[h0] = b[j];
					c[h0] = c[j] - 1;
					a[b[h0]][c[h0]] = '@';
				}
				if (a[b[j] + 1][c[j]] == '.')
				{
					h0++;
					b[h0] = b[j] + 1;
					c[h0] = c[j];
					a[b[h0]][c[h0]] = '@';
				}
				if (a[b[j] - 1][c[j]] == '.')
				{
					h0++;
					b[h0] = b[j] - 1;
					c[h0] = c[j];
					a[b[h0]][c[h0]] = '@';
				}
			}
			if (h0 == h)
			{
				break;
			}
			else
			{
				h = h0;
			}
		}
		for (i = 1, h0 = 0 ; i <= n ; i++)
		{
			for (j = 1 ; j <= n ; j++)
			{
				if (a[i][j] == '@')
				{
					h0++;
				}
			}
		}
		System.out.print(h0);
		System.out.print("\n");
		return 0;
	}

}

