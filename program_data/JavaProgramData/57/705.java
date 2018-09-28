package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int a;
	  int b;
	  int c;
	  int i;
	  int j;
	  int m;
	  int n;
	  char[][] u = new char[50][33];
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
		  u[i] = tempVar2.charAt(0);
	  }
	  }
	  for (i = 0;i < n;i++)
	  {
		   m = String.valueOf(u[i]).length();
		if (u[i][m - 2] == 'l' && u[i][m - 1] == 'y')
		{
			u[i][m - 2] = '\0';
		}
		else if (u[i][m - 2] == 'e' && u[i][m - 1] == 'r')
		{
			u[i][m - 2] = '\0';
		}
		else if (u[i][m - 3] == 'i' && u[i][m - 2] == 'n' && u[i][m - 1] == 'g')
		{
			u[i][m - 3] = '\0';
		}
	  }

		   for (i = 0;i < n;i++)
		   {
			   System.out.printf("%s\n",u[i]);
		   }
		return 0;
	}


}

