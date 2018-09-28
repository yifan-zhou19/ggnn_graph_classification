package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int r;
		int c;
		int[][] a = new int[100][100];
		int i;
		int j;
		int m;
		int n = 1;
		r = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		c = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= r;i++)
		{
			for (j = 1;j <= c;j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1;i < c;i++)
		{
			m = i;
			n = 1;
			while ((m >= 1) && (n <= r))
			{
				System.out.print(a[n][m]);
				System.out.print("\n");
				m--;
				n++;
			}
		}
		for (i = 1;i <= r;i++)
		{
			m = c;
			n = i;
			while ((m >= 1) && (n <= r))
			{
				System.out.print(a[n][m]);
				System.out.print("\n");
				m--;
				n++;
			}
		}
		return 0;
	}


}

