package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n = 0;
	  int m = 0;
	  int i = 0;
	  int j = 0;
	  int k = 0;
	  int ge = 0;
	  char[][] s = new char[100][100];
	  char[][] s1 = new char[100][100];
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 0;i <= 99;i++)
	  {
		 for (j = 0;j <= 99;j++)
		 {
			s[i][j] = '\0';
		 }
	  }
	  for (i = 0;i <= 99;i++)
	  {
		 for (j = 0;j <= 99;j++)
		 {
			s1[i][j] = '\0';
		 }
	  }

	  for (i = 0;i <= n - 1;i++) //??
	  {
		 for (j = 0;j <= n - 1;j++)
		 {
			s[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		 }
	  }
	  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (k = 1;k <= m - 1;k++)
	  {
		   for (i = 0;i <= 99;i++)
		   {
			   for (j = 0;j <= 99;j++)
			   {
				s1[i][j] = '\0';
			   }
		   }

		   for (i = 0;i <= n - 1;i++)
		   {
			  for (j = 0;j <= n - 1;j++)
			  {
				 if (s[i][j] == '@')
				 {
					 s1[i][j] = '@';
					 if (i - 1 >= 0)
					 {
					 s1[i - 1][j] = '@';
					 }
					 if (i + 1 <= n - 1)
					 {
					 s1[i + 1][j] = '@';
					 }
					 if (j - 1 >= 0)
					 {
					 s1[i][j - 1] = '@';
					 }
					 if (j + 1 <= n - 1)
					 {
					 s1[i][j + 1] = '@';
					 }

				 }
			  }
		   }
		   for (i = 0;i <= n - 1;i++)
		   {
			  for (j = 0;j <= n - 1;j++)
			  {
				 if ((s1[i][j] == '@') && (s[i][j] == '.'))
				 {
					 s[i][j] = s1[i][j];
				 }
			  }
		   }






	  }
	for (i = 0;i <= n - 1;i++)
	{
	  for (j = 0;j <= n - 1;j++)
	  {
		if (s[i][j] == '@')
		{
		ge++;
		}
	  }
	}

	System.out.print(ge);

	return 0;
	}
}

