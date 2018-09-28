package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int n;
	  int i;
	  int j;
	  int b = 1;
	  char[][] a = new char[100][20];
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
		  if ((a[i][0] == '_') || (a[i][0] >= 'a' && a[i][0] <= 'z') || (a[i][0] >= 'A' && a[i][0] <= 'Z'))
		  {
			  for (j = 1;j <= 20;j++)
			  {
				  if ((a[i][j] == '_') || (a[i][j] >= 'a' && a[i][j] <= 'z') || (a[i][j] >= 'A' && a[i][j] <= 'Z') || (a[i][j] >= '0' && a[i][j] <= '9'))
				  {
					  continue;
				  }
				  else if (a[i][j] != '\0')
				  {
					  System.out.print("no\n");
					  b = 0;
					  break;
				  }
				  else
				  {
					  break;
				  }
			  }
			  if (b == 1)
			  {
				  System.out.print("yes\n");
			  }
			  b = 1;
		  }
		  else
		  {
			  System.out.print("no\n");
		  }
	  }

	  return 0;
	}
}

