package <missing>;

public class GlobalMembers
{
	//********************************
	//* ??????? **
	//* ????? 1300012990 **
	//* ???2013.11.01 **
	//********************************
	public static int Main()
	{
		int n;
		int m;
		int i;
		int j;
		int day;
		int sum = 0;
		char[][] a = new char[200][200];
		char[][] b = new char[200][200];
		n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 1;i <= n;i++)
		{
			for (j = 1;j <= n;j++)
			{
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
			}
		}
		m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (j = 0;j <= n + 1;j++)
		{
			a[0][j] = '#';
			a[n + 1][j] = '#';
		}
		for (i = 1;i <= n;i++)
		{
			a[i][0] = '#';
			a[i][n + 1] = '#';
		}
		for (day = 2;day <= m;day++)
		{
		  for (i = 1;i <= n;i++)
		  {
			  for (j = 1;j <= n;j++)
			  {
				  if (a[i][j] == '.' && (a[i - 1][j] == '@' || a[i][j - 1] == '@' || a[i + 1][j] == '@' || a[i][j + 1] == '@'))
				  {
					   b[i][j] = '@';
				  }
				  else
				  {
					  b[i][j] = a[i][j];
				  }
			  }
		  }
		  for (i = 1;i <= n;i++)
		  {
			  for (j = 1;j <= n;j++)
			  {
				  a[i][j] = b[i][j];
			  }
		  }
		}
		 for (i = 1;i <= n;i++)
		 {
			for (j = 1;j <= n;j++)
			{
				if (a[i][j] == '@')
				{
					sum++;
				}
			}
		 }
		System.out.print(sum);
		System.out.print("\n");
		return 0;
	}


}

