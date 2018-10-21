package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int i;
		  int l;
		  int b;
		  int j;
		  int k;
		  int x;
		  char[][] c = new char[6][1000];
		  char[][] a = new char[6][1000];
		  for (i = 0;i <= 5;i++)
		  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  c[i] = tempVar.charAt(0);
		  }
		  }
		  for (i = 0;i <= 5;i++)
		  {
						   l = String.valueOf(c[i]).length();
						   if (l == 1)
						   {
								   a[i][0] = c[i][0];
								   a[i][1] = '\0';
						   }
						  else if (c[i][0] < '0' || c[i][0]>'9')
						  {

								 b = 1;
								 if (l == 2 && c[i][1] == '0')
								 {
													  a[i][0] = '0';
													  a[i][1] = '\0';
								 }
								  else
								  {
								  a[i][0] = c[i][0];
								  }
						  }
						  else
						  {
						  b = 0;
						  }
						  for (j = l - 1;j >= b;j--)
						  {
								  a[i][b] = c[i][j];
								  if (a[i][b] != '0')
								  {
								  break;
								  }
						  }
						  x = b + 1;
						  for (k = j - 1;k >= b;k--)
						  {
								   a[i][x] = c[i][k];
								   x++;
						  }
						  a[i][j + 1] = '\0';
						  if (i == 0)
						  {
						  System.out.printf("%s",a[i]);
						  }
						  else
						  {
						  System.out.printf("\n%s",a[i]);
						  }
		  }
		  System.in.read();
		  System.in.read();
	}

}

