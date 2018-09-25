package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	   char[][] a = new char[100][110];
	   char c;
	   char h;
	   int i;
	   int j;
	   int k;
	   int[] t = new int[100];
	   int p;
	   int m;
	   int n = 0;
	   while ((a[n] = ConsoleInput.readToWhiteSpace(true).charAt(0)).length() > 0)
	   {
		  n = n + 1;
	   }
	   for (i = 0;i < n;i++)
	   {
	   for (j = 0;j < 110;j++)
	   {
		  if (a[i][j] != '\0')
		  {
		  t[i] = t[i] + 1;
		  }
		  if (a[i][j] == '\0')
		  {
		  break;
		  }
	   }
	   }
	   for (i = 0;i < n;i++)
	   {
		  for (j = 0;j < t[i];j++)
		  {
		  System.out.print(a[i][j]);
		  }
		  System.out.print("\n");
		  for (j = 0;j < t[i];j++)
		  {
			 if ((a[i][j] >= 'a' && a[i][j] <= 'z') || (a[i][j] >= 'A' && a[i][j] <= 'Z'))
			 {
			 a[i][j] = ' ';
			 }
		  }
		  for (j = 0;j < t[i] - 1;j++)
		  {
			 if (a[i][j] == '(')
			 {
				for (k = j + 1;k < t[i];k++)
				{
					if (a[i][k] == ')')
					{
					   a[i][j] = ' ';
					   a[i][k] = ' ';
					   j = -1;
					   break;
					}
					if (a[i][k] == '(')
					{
					   j = k - 1;
					   break;
					}
				}
				continue;
			 }
		  }
			 for (j = 0;j < t[i];j++)
			 {
				if (a[i][j] == ' ')
				{
				  System.out.print(a[i][j]);
				}
				if (a[i][j] == '(')
				{
				  System.out.print('$');
				}
				if (a[i][j] == ')')
				{
				  System.out.print('?');
				}
			 }
			 System.out.print("\n");
	   }
			 return 0;
	}



}

