package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
			   int n;
			   int i;
			   int j;
			   int l;
			   int s;
			   char[][] a = new char[20][21];
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
					   a[i] = tempVar2.charAt(0);
				   }
			   }
			   for (i = 0;i < n;i++)
			   {
				   l = String.valueOf(a[i]).length();
			   s = 1;
								 for (j = 0;j < l;j++)
								 {
													 if (a[i][j] == 95 || (a[i][j] >= 48 && a[i][j] <= 57) || (a[i][j] >= 65 && a[i][j] <= 90) || (a[i][j] >= 97 && a[i][j] <= 122))
													 {
														 continue;
													 }
												   else
												   {
													   s = 0;
													   break;
												   }
								 }
								if (a[i][0] >= 48 && a[i][0] <= 57)
								{
									s = 0;
								}
								if (s == 0)
								{
									System.out.print("no\n");
								}
								  else
								  {
									  System.out.print("yes\n");
								  }
			   }
				   return 0;
	}



}

