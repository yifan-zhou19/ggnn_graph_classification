package <missing>;

public class GlobalMembers
{
	/*************************
	??cpp5
	????
	???
	2013/11/6
	**************************/
	public static int Main()
	{
		char[][] a = new char[101][101];
		int n;
		int m;
		int k;
		int i;
		int j;
		int cont = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1; i <= n; i++)
		{
			for (j = 1; j <= n; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 2; k <= m; k++)
		{
			for (i = 1; i <= n; i++)
			{
				 for (j = 1; j <= n; j++)
				 {
					 if (a[i][j] == '@')
					 {
						 if (j != 1 && a[i][j - 1] == '.')
						 {
							 a[i][j - 1] = '*';
						 }
						 if (j != n && a[i][j + 1] == '.')
						 {
							 a[i][j + 1] = '*';
						 }
						 if (i != 1 && a[i - 1][j] == '.')
						 {
							 a[i - 1][j] = '*';
						 }
						 if (i != n && a[i + 1][j] == '.')
						 {
							 a[i + 1][j] = '*';
						 }
					 }
				 }
			}
			for (i = 1; i <= n; i++)
			{
				 for (j = 1; j <= n; j++)
				 {
					 if (a[i][j] == '*') //???????????????????????*???????????????
					 {
						 a[i][j] = '@';
					 }
				 }
			}
		}
		for (i = 1; i <= n; i++)
		{
				 for (j = 1; j <= n; j++)
				 {
					 if (a[i][j] == '@')
					 {
						 cont++;
					 }
				 }
		}
		System.out.print(cont);
		return 0;
	}


}

