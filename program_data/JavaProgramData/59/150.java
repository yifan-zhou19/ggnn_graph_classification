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
	  char[][] aa = new char[1000][1000];
	  int m;
	  n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 0;i < n;i++)
	  {
		for (j = 0;j < n;j++)
		{
		 aa[i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		}
	  }
	   m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (k = 1;k < m;k++)
	  {
	   for (i = 0;i < n;i++)
	   {
		for (j = 0;j < n;j++)
		{
			 if (aa[i][j] == '$')
			 {
				   aa[i][j] = '@';
			 }
		}
	   }
	   for (i = 0;i < n;i++)
	   {
		for (j = 0;j < n;j++)
		{
		 if (aa[i][j] == '@')
		 {
			  if ((i - 1 >= 0) && (aa[i - 1][j] == '.'))
			  {
				  aa[i - 1][j] = '$';
			  }

			   if ((i + 1 <= n - 1) && (aa[i + 1][j] == '.'))
			   {
				  aa[i + 1][j] = '$';
			   }

				  if ((j - 1 >= 0) && (aa[i][j - 1] == '.'))
				  {
				  aa[i][j - 1] = '$';
				  }

				   if ((j + 1 <= n - 1) && (aa[i][j + 1] == '.'))
				   {
				  aa[i][j + 1] = '$';
				   }
		 }
		}
	   }
	  }
		l = 0;
		   for (i = 0;i < n;i++)
		   {
			for (j = 0;j < n;j++)
			{
		  if (aa[i][j] == '@' || aa[i][j] == '$')
		  {
			  l++;
		  }
			}
		   }
	  System.out.print(l);
	  System.out.print("\n");
	return 0;
	}

}

