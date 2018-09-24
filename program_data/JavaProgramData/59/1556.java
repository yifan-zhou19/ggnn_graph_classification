package <missing>;

public class GlobalMembers
{
	//********************************
	//*????????? **
	//*????? 1300012839 **
	//*???2013.11.2**
	//********************************
	public static int Main()
	{
		int i;
		int j;
		int n;
		int m;
		int k;
		int count = 0;
		char[][][] a = new char[102][102][102];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k <= 101;k++)
		{
				for (i = 0;i <= 101;i++)
				{
				for (j = 0;j <= 101;j++)
				{
				a[k][i][j] = '.';
				}
				}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
			a[1][i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (k = 1;k < m;k++)
		{
				for (i = 1;i <= n;i++)
				{
				   for (j = 1;j <= n;j++)
				   {
						 if (a[k][i][j] == '.')
						 {
								 if ((a[k][i - 1][j] == '@') || (a[k][i + 1][j] == '@') || (a[k][i][j + 1] == '@') || (a[k][i][j - 1] == '@'))
								 {
									 a[k + 1][i][j] = '@';
								 }
						 }
						 if (a[k][i][j] == '@')
						 {
							 a[k + 1][i][j] = '@';
						 }
						 if (a[k][i][j] == '#')
						 {
							 a[k + 1][i][j] = '#';
						 }
				   }
				}
		}
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				if (a[m][i][j] == '@')
				{
					count = count + 1;
				}
			}
		}
		System.out.print(count);
		System.out.print("\n");
		return 0;
	}

}

