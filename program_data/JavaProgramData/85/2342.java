package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		   int n;
		   String tempVar = ConsoleInput.scanfRead();
		   if (tempVar != null)
		   {
			   n = Integer.parseInt(tempVar);
		   }
		   char[][] s = new char[100][100];
		   int i;
		   int j;
		   int[] a = new int[100];
		   for (i = 0;i < n;i++)
		   {
			   String tempVar2 = ConsoleInput.scanfRead();
			   if (tempVar2 != null)
			   {
				   s[i] = tempVar2.charAt(0);
			   }
		   }
		   for (i = 0;i < n;i++)
		   {
					 a[i] = 0;
		  for (j = 0;s[i][j] != '\0';j++)
		  {
						 if (j == 0)
						 {
						if ((s[i][j] >= 'A' && s[i][j] <= 'Z') || (s[i][j] >= 'a' && s[i][j] <= 'z') || (s[i][j] == '_'))
						{
						a[i] = 1;
						}
					else
					{
							a[i] = 0;
							break;
					}
						 }
			else if (j > 0)
			{
					if ((s[i][j] >= 'A' && s[i][j] <= 'Z') || (s[i][j] >= 'a' && s[i][j] <= 'z') || (s[i][j] == '_') || (s[i][j] >= '0' && s[i][j] <= '9'))
					{
					  a[i] = 1;
					}
			else
			{
				a[i] = 0;
				break;
			}
			}
			else
			{
				a[i] = 0;
				break;
			}
		  }
			if (a[i] == 0)
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

