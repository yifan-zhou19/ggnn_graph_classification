package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int k;
	  int n;
	  int m;
	  int liu = 0;
	  int[][] count = new int[101][101];
	  char[][] a = new char[101][101];
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 0;i < n;i++)
	  {
		  for (j = 0;j < n;j++)
		  {
				a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
				if (a[i][j] == '@')
				{
				  liu += 1;
				}
		  }
	  }
	m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	for (k = m;k > 1;k--)
	{
		for (i = 0;i < n;i++)
		{
		  for (j = 0;j < n;j++)
		  {
			  count[i][j] = 0;
		  }
		}
		for (i = 0;i < n;i++)
		{
		  for (j = 0;j < n;j++)
		  {
			  if ((a[i][j] == '@') && (count[i][j] == 0))
			  {
					if ((i > 0) && (a[i - 1][j] == '.'))
					{
						liu += 1;
					   a[i - 1][j] = '@';
					   count[i - 1][j] = 1;
					}
				  if ((j > 0) && (a[i][j - 1] == '.'))
				  {
						liu += 1;
					   a[i][j - 1] = '@';
					   count[i][j - 1] = 1;
				  }
				  if ((i + 1 < n) && (a[i + 1][j] == '.'))
				  {
						liu += 1;
					   a[i + 1][j] = '@';
					   count[i + 1][j] = 1;
				  }
				  if ((j + 1 < n) && (a[i][j + 1] == '.'))
				  {
						liu += 1;
					   a[i][j + 1] = '@';
					   count[i][j + 1] = 1;
				  }
			  }
		  }
		}
	}
	System.out.print(liu);
	System.out.print("\n");
	return 0;
	}
}

