package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int n;
		int i;
		int j;
		int leftrow;
		int leftcolumn;
		int rightrow;
		int rightcolumn;
		int s;
		int[][] a = new int[1000][1000];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0 ; i < n + 2 ; i++)
		{
			for (j = 0 ; j < n + 2 ; j++)
			{
				a[i][j] = 255;
			}
		}
		for (i = 1 ; i < n + 1 ; i++)
		{
			for (j = 1 ; j < n + 1 ; j++)
			{
				a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			}
		}
		for (i = 1 ; i < n + 1 ; i++)
		{
			for (j = 1 ; j < n + 1 ; j++)
			{
				if (a[i][j] == 0 && a[i - 1][j] == 255 && a[i][j - 1] == 255)
				{
					leftrow = i;
					leftcolumn = j;
				}
				if (a[i][j] == 0 && a[i + 1][j] == 255 && a[i][j + 1] == 255)
				{
					rightrow = i;
					rightcolumn = j;
				}
			}
		}
		s = (rightcolumn - leftcolumn - 1) * (rightrow - leftrow - 1);
		System.out.print(s);
	}
}

