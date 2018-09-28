package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			  char[][] c = new char[101][101];
			  char[][] d = new char[101][101];
			  int n;
			  int m;
			  int i;
			  int j;
			  int k;
			  int t = 0;
			  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  for (i = 1;i <= n;i++)
			  {
				  for (j = 1;j <= n;j++)
				  {
					 c[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				  }
			  }
			  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  for (k = 0;k < m - 1;k++)
			  {
				  for (i = 1;i <= n;i++)
				  {
					  for (j = 1;j <= n;j++)
					  {
						  if (c[i][j] == '@')
						  {
							  if (c[i - 1][j] == '.')
							  {
								  d[i - 1][j] = '@';
							  }
							  if (c[i + 1][j] == '.')
							  {
								  d[i + 1][j] = '@';
							  }
							  if (c[i][j - 1] == '.')
							  {
								  d[i][j - 1] = '@';
							  }
							  if (c[i][j + 1] == '.')
							  {
								  d[i][j + 1] = '@';
							  }
						  }
					  }
				  }
				  for (i = 1;i <= n;i++)
				  {
					  for (j = 1;j <= n;j++)
					  {
						  if (d[i][j] == '@')
						  {
							  c[i][j] = d[i][j];
						  }
					  }
				  }
			  }
			  for (i = 1;i <= n;i++)
			  {
				  for (j = 1;j <= n;j++)
				  {
					  if (c[i][j] == '@')
					  {
						  t += 1;
					  }
				  }
			  }
			  System.out.print(t);
			  return 0;
	}

}

