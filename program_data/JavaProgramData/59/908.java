package <missing>;

public class GlobalMembers
{
	 public static char[][] c = new char[110][110];
	 public static int[][] b = new int[100][100];
	 public static int n;
	public static int pat(int m)
	{
	   int result = 0;
	   int i = 0;
	   int j = 0;
	   if (m == 0)
	   {
	   for (i = 0;i < n;i++)
	   {
		 for (j = 0;j < n;j++)
		 {
			if (c[i][j] == '@')
			{
				result++;
			}
		 }
	   }
		 return result;
	   }
	   else
	   {
		  for (i = 0;i < n;i++)
		  {
		  for (j = 0;j < n;j++)
		  {
			 if (c[i][j] == '@')
			 {
				 if (c[i][j - 1] == '.')
				 {
					 b[i][j - 1] = 1;
				 }
			  if (c[i][j + 1] == '.')
			  {
				  b[i][j + 1] = 1;
			  }
			  if (c[i + 1][j] == '.')
			  {
				  b[i + 1][j] = 1;
			  }
			  if (c[i - 1][j] == '.')
			  {
				  b[i - 1][j] = 1;
			  }
			 }
		  }
		  }
		  for (i = 0;i < n;i++)
		  {
		  for (j = 0;j < n;j++)
		  {
			 if (b[i][j] == 1)
			 {
				 c[i][j] = '@';
			 }
		  }
		  }
	   }
	   pat(m - 1);
	}
	public static int Main()
	{

	   int m;
	   int i = 0;
	   int j = 0;
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   for (i = 0;i < n;i++)
	   {
	   for (j = 0;j < n;j++)
	   {
	   c[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
	   }
	   }
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   m--;
	   System.out.print(pat(m));
	   return 0;
	}
}

