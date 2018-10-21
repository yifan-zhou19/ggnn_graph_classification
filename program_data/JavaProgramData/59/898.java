package <missing>;

public class GlobalMembers
{
	public static int n;
	public static int sum = 0;
	public static int f(int[][] b, int m) //?????????M?????
	{
		int i = 1;
		int j = 1;
		if (m == 1) //?????????????
		{
				for (i = 1;i <= n;i++)
				{
					 for (j = 1;j <= n;j++)
					 {
							if (b[i][j] == 2)
							{
								sum = sum + 1; //??????
							}
					 }
				}
				  return 0;
		}

		for (i = 1;i <= n;i++) //????????????
		{
		   for (j = 1;j <= n;j++)
		   {
				  if (b[i][j] == 2)
				  {
						  if (b[i][j + 1] == 1)
						  {
							  b[i][j + 1] = 3;
						  }
						 if (b[i][j - 1] == 1)
						 {
							 b[i][j - 1] = 3;
						 }
						 if (b[i + 1][j] == 1)
						 {
							 b[i + 1][j] = 3;
						 }
						 if (b[i - 1][j] == 1)
						 {
							 b[i - 1][j] = 3;
						 }
				  }
		   }
		}
		for (i = 1;i <= n;i++)
		{
		   for (j = 1;j <= n;j++)
		   {
				   if (b[i][j] == 3)
				   {
					   b[i][j] = 2;
				   }
		   }
		}
		f(b, m - 1);
		return 0;

	}



	public static int Main()
	{
	   n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   char x;
	   cin.get(x);
	   char[][] a =
	   {
		   {0, '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0', '\0'}
	   };
	   int i;
	   int j;
	   for (i = 1;i <= n;i++) //????
	   {
		  for (j = 1;j <= n + 1;j++)
		  {
				 cin.get(x);
				a[i][j] = x;
		  }
	   }
	   int m;
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   int[][] b = new int[110][110];
	   for (i = 1;i <= n;i++) //?????
	   {
		  for (j = 1;j <= n;j++)
		  {
				 if (a[i][j] == '.')
				 {
					 b[i][j] = 1;
				 }
				if (a[i][j] == '@')
				{
					b[i][j] = 2;
				}
		  }
	   }

	   f(b, m);
	   System.out.print(sum);
	   return 0;
	}
}

