package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int m;
	int i;
	int j;
	int k;
	int s = 0;
	int[][] b = new int[120][120];
	char[][] a = new char[200][200];
	for (i = 0;i <= 119;i++)
	{
	 for (j = 0;j <= 119;j++)
	 {
	   b[i][j] = -1;
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
	for (i = 1;i <= n;i++)
	{
	for (j = 1;j <= n;j++)
	{
		if (a[i][j] == '.')
		{
		 b[i][j] = 0;
		}
		 if (a[i][j] == '@')
		 {
		 b[i][j] = 1;
		 }
	}
	}
	for (k = 1;k <= m - 1;k++)
	{
	  for (i = 1;i <= n;i++)
	  {
	   for (j = 1;j <= n;j++)
	   {
		  if (b[i][j] == 1)
		  {
			  if (b[i][j - 1] == 0)
			  {
				 b[i][j - 1] = 2;
			  }
			  if (b[i][j + 1] == 0)
			  {
				 b[i][j + 1] = 2;
			  }
			  if (b[i + 1][j] == 0)
			  {
				b[i + 1][j] = 2;
			  }
			  if (b[i - 1][j] == 0)
			  {
			   b[i - 1][j] = 2;
			  }
		  }
	   }
	  }
	  for (i = 1;i <= n;i++)
	  {
	   for (j = 1;j <= n;j++)
	   {
		if (b[i][j] == 2)
		{
		  b[i][j] = 1;
		}
	   }
	  }

	}
	 for (i = 1;i <= n;i++)
	 {
	   for (j = 1;j <= n;j++)
	   {
		if (b[i][j] == 1)
		{
	   s = s + 1;
		}
	   }
	 }
	System.out.print(s);
	return 0;
	}




}

