package <missing>;

public class GlobalMembers
{
	//********************************
	//*???????     **
	//*?????? 1300012887 **
	//*???2013.11.03 **
	//********************************
	public static int Main()
	{
		char[][] a = new char[102][102];
		int[][] b = new int[102][102];
		int n;
		int m;
		int i;
		int j;
		int k;
		int l = 0;
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		System.in.read();
		for (i = 0; i <= n - 1; i++)
		{
			for (j = 0; j <= n - 2; j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
			a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			System.in.read();
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i <= n - 1; i++)
		{
			for (j = 0; j <= n - 1; j++)
			{
				if (a[i][j] == '@') //????????
				{
					b[i][j] = 1;
				}
			}
		}
		for (k = 2; k <= m; k++) //????????
		{
			l = 0;
			for (i = 0; i <= n - 1; i++)
			{
				for (j = 0; j <= n - 1; j++) //???????????????
				{
					if (a[i][j] == '@')
					{
						 if (a[i - 1][j] == '.')
						 {
							b[i - 1][j] = 1;
						 }
						if (a[i + 1][j] == '.')
						{
							b[i + 1][j] = 1;
						}
						if (a[i][j - 1] == '.')
						{
							b[i][j - 1] = 1;
						}
						if (a[i][j + 1] == '.')
						{
							b[i][j + 1] = 1;
						}
					}
				}
			}
		for (i = 0; i <= n - 1; i++)
		{
			for (j = 0; j <= n - 1; j++)
			{
				   if (b[i][j] == 1)
				   {
					a[i][j] = '@';
					l++; //???m????????
				   }
			}
		}
		}
		System.out.print(l);
		return 0;
	}


}

