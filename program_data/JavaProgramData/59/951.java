package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i = 0;
		int j = 0;
		int k = 0;
		int n;
		int m;
		int num;
		int c;
		int[][] b = new int[10000][2];
		char[][] a = new char[110][110];
		for (i = 0;i < 110;i++)
		{
			for (j = 0;j < 110;j++)
			{
				a[i][j] = ' ';
			}
		}
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
		a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k < m;k++)
		{
			c = 0;
			num = 0;
		  for (i = 1;i <= n;i++)
		  {
			for (j = 1;j <= n;j++)
			{
			if (a[i][j] == '@')
			{
			if (a[i - 1][j] == '.')
			{
			b[c][0] = i - 1;
			b[c][1] = j;
			c++;
			num = c;
			}
			if (a[i + 1][j] == '.')
			{
			b[c][0] = i + 1;
			b[c][1] = j;
			c++;
			num = c;
			}
			if (a[i][j - 1] == '.')
			{
			b[c][0] = i;
			b[c][1] = j - 1;
			c++;
			num = c;
			}
			if (a[i][j + 1] == '.')
			{
			b[c][0] = i;
			b[c][1] = j + 1;
			c++;
			num = c;
			}
			}
			}
		  }
		for (c = 0;c < num;c++)
		{
			a[b[c][0]][b[c][1]] = '@';
		}
		}
		num = 0;
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
			 if (a[i][j] == '@')
			 {
				 num++;
			 }
			}
		}
		System.out.print(num);
		System.out.print("\n");
		return 0;
	}

}

