package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	int n;
	int i;
	int j;
	int m = 0;
	int x;
	int y;
	String tempVar = ConsoleInput.scanfRead();
	if (tempVar != null)
	{
		n = Integer.parseInt(tempVar);
	}
	char[][] a = new char[n][1000];
	System.in.read();
	for (i = 0;i < n;i++)
	{
	 a[i] = new Scanner(System.in).nextLine();
	}
	for (i = 0;i < n;i++)
	{
		  for (j = 0;a[i][j] != '\0';j++)
		  {
		 System.out.printf("%c",a[i][j]);
		  }
		 System.out.print("\n");
		 x = j;
	   for (j = 0;j < x;j++)
	   {
			if (a[i][j] == ')')
			{
			  if (j == 0)
			  {
				  a[i][j] = '?';
			  }
		   for (m = 1;j - m >= 0;m++)
		   {
			 if (a[i][j - m] == '(')
			 {
			 a[i][j - m] = ' ';
			 a[i][j] = ' ';
			 break;
			 }
			 else
			 {
				 a[i][j] = '?';
			 }
		   }
			}
		 if (a[i][j] != '(' && a[i][j] != ')' && a[i][j] != '?')
		 {
			 a[i][j] = ' ';
		 }
	   }
	   for (j = x - 1;j >= 0;j--)
	   {
		  if (a[i][j] == '(')
		  {
				 if (j == x - 1)
				 {
					 a[i][j] = '$';
				 }
			  else
			  {
				  for (m = 1;j + m < x;m++)
				  {
				if (a[i][j + m] == ')')
				{
				a[i][j] = ' ';
				a[i][j + m] = ' ';
				break;
				}
				 else
				 {
					 a[i][j] = '$';
				 }
				  }
			  }
		  }
	   }
		 for (j = 0;j < x;j++)
		 {
		   System.out.printf("%c",a[i][j]);
		 }
		 System.out.print("\n");
	}
	  return 0;
	}
}

