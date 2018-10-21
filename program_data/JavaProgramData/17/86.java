package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int i;
		int n = 0;
		int k;
		int p;
		int count1 = 0;
		int count2 = 0;
		char[][] a = new char[100][1000];
		char[][] b = new char[1000][1000];
		for (i = 0;i < 100;i++)
		{
						  for (k = 0;k < 100;k++)
						  {
										  b[i][k] = ' ';
						  }
		}
		for (i = 0;i < 100;i++)
		{
						  String tempVar = ConsoleInput.scanfRead();
						  if (tempVar != null)
						  {
							  a[i] = tempVar.charAt(0);
						  }
						  n++;
						  if (a[i][0] == '\0')
						  {
						  break;
						  }
		}
		for (i = 0;i < n;i++)
		{
						  System.out.printf("%s\n",a[i]);
						  for (k = 0;k < String.valueOf(a[i]).length();k++)
						  {
													 if (a[i][k] == ')')
													 {
														  for (p = k - 1;p >= 0;p--)
														  {
																			 if (a[i][p] == '(')
																			 {
																							  a[i][p] = '.';
																							  a[i][k] = '.';
																							  break;
																			 }
																			 else if (a[i][p] == ')')
																			 {
																				  break;
																			 }
														  }
													 }
						  }
						  for (k = 0;k < String.valueOf(a[i]).length();k++)
						  {
													 if (a[i][k] == '(')
													 {
													 b[i][k] = '$';
													 }
													 else if (a[i][k] == ')')
													 {
													 b[i][k] = '?';
													 }
						  }
						  b[i][String.valueOf(a[i]).length()] = '\0';
						  System.out.printf("%s\n",b[i]);
		}
		return 0;
	}
}

