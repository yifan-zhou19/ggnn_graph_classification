package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int n;
		  int i;
		  int j;
		  int k;
		  int l;
		  int day;
		  char[][] a = new char[300][300];
		  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		for (i = 0; i < n ; i++)
		{
		   for (j = 0; j < n ; j++)
		   {
			a[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		   }
		}
		day = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 for (l = 1;l < day;l++)
		 {
				for (i = 0; i < n ; i++)
				{
				 for (j = 0; j < n ; j++)
				 {

						 if (a[i][j] == '@')
						 {
							if (a[i][j + 1] == '.')
							{
								a[i][j + 1] = '*';
							}
							if (a[i][j - 1] == '.')
							{
								a[i][j - 1] = '*';
							}
							if (a[i + 1][j] == '.')
							{
								a[i + 1][j] = '*';
							}
							if (a[i - 1][j] == '.')
							{
								a[i - 1][j] = '*';
							}
						 }

				 }


				}

			   for (i = 0; i < n ; i++)
			   {
				 for (j = 0; j < n ; j++)
				 {
					 if (a[i][j] == '*')
					 {
						 a[i][j] = '@';
					 }
				 }
			   }
		 }

				k = 0;
			 for (i = 0; i < n ; i++)
			 {
				 for (j = 0; j < n ; j++)
				 {
						 if (a[i][j] == '@')
						 {
						  k++;
						 }
				 }
			 }

				  System.out.print(k);
				  System.out.print("\n");
		   return 0;
	}

}

