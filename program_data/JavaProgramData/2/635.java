package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int m;
	  m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  int p;
	  char[][] a = new char[m + 1][27];
	  int[] len = new int[m + 1];
	  int[] b = new int[m + 1];
	  int[] c = new int[26];
	  int i;
	  int j;
	  int k;
	  int l;
	  for (i = 0 ;i <= 25 ; i++)
	  {
		   c[i] = 0;
	  }
		   for (i = 1 ; i <= m ; i++)
		   {
				  b[i] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
				   a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
					  len[i] = String.valueOf(a[i]).length();
					  for (j = 0; j <= len[i] - 1 ; j++)
					  {
							 c[a[i][j] - 'A']++;
					  }
		   }
	  int temp = -1;
	  for (i = 0; i <= 25 ; i++)
	  {
		if (c[i] > temp)
		{
		   temp = c[i];
		   p = i;
		}
	  }
	  char n = 'A' + p;
	  System.out.print(n);
	  System.out.print("\n");
	  System.out.print(temp);
	  System.out.print("\n");
	  for (i = 1; i <= m ; i++)
	  {
	   for (j = 0 ; j <= len[i] - 1 ; j++)
	   {
			 if (a[i][j] == '\0')
			 {
			  break;
			 }
			 else if (a[i][j] == n)
			 {
			  System.out.print(b[i]);
			  System.out.print("\n");
			  break;
			 }
	   }
	  }
	   return 0;
	}
}

