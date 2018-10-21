package <missing>;

public class GlobalMembers
{
	public static void Main()
	{
	  char[][] str = new char[50][32];
	  int[] a = new int[100];
	  int n;
	  int i;
	  int l;
	  int j;
	  String tempVar = ConsoleInput.scanfRead();
	  if (tempVar != null)
	  {
		  n = Integer.parseInt(tempVar);
	  }
	  for (i = 0;i < n;i++)
	  {
		  String tempVar2 = ConsoleInput.scanfRead();
		  if (tempVar2 != null)
		  {
			  str[i] = tempVar2.charAt(0);
		  }
		  a[i] = String.valueOf(str[i]).length();
	  }
	  for (i = 0;i < n - 1;i++)
	  {
		  l = a[i];
		  if (str[i][l - 1] == 'g' && str[i][l - 2] == 'n' && str[i][l - 3] == 'i')
		  {
			  for (j = 0;j < l - 3;j++)
			  {
				  System.out.printf("%c",str[i][j]);
			  }
			  System.out.print("\n");
		  }
		  else if (str[i][l - 1] == 'r' && str[i][l - 2] == 'e')
		  {
			  for (j = 0;j < l - 2;j++)
			  {
				  System.out.printf("%c",str[i][j]);
			  }
			  System.out.print("\n");
		  }
		  else if (str[i][l - 1] == 'y' && str[i][l - 2] == 'l')
		  {
			  for (j = 0;j < l - 2;j++)
			  {
				  System.out.printf("%c",str[i][j]);
			  }
			  System.out.print("\n");
		  }
	  }
		  l = a[n - 1];
		  if (str[n - 1][l - 1] == 'g' && str[n - 1][l - 2] == 'n' && str[n - 1][l - 3] == 'i')
		  {
			  for (j = 0;j < l - 3;j++)
			  {
				  System.out.printf("%c",str[n - 1][j]);
			  }
		  }
		  else if (str[n - 1][l - 1] == 'r' && str[n - 1][l - 2] == 'e')
		  {
			  for (j = 0;j < l - 2;j++)
			  {
				  System.out.printf("%c",str[n - 1][j]);
			  }
		  }
		  else if (str[n - 1][l - 1] == 'y' && str[n - 1][l - 2] == 'l')
		  {
			  for (j = 0;j < l - 2;j++)
			  {
				  System.out.printf("%c",str[n - 1][j]);
			  }
		  }

	}

}

