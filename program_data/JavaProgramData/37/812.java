package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int t;
	 t = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 char[][] a = new char[10][100000];
	 char[][] b = new char[10][2];
	 for (int i = 0;i < t;i++)
	 {
		a[i] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		for (int j = 0 ; a[i][j] != '\0' ;j++)
		{
		   int flag = 0;
		   for (int k = 0 ;a[i][k] != '\0';k++)
		   {
			  if (k == j)
			  {
				  continue;
			  }
			  if (a[i][j] == a[i][k])
			  {
				  flag = 1;
				  break;
			  }
		   }
		   if (flag == 0)
		   {
			   b[i][0] = a[i][j];
			   break;
		   }
		}
		if (b[i][0] == '\0')
		{
			b[i][0] = 'n',b[i][1] = 'o';
		}
	 }
	 for (int i = 0;i < t;i++)
	 {
		 System.out.print(b[i]);
		 System.out.print("\n");
		 System.out.print("\n");
	 }
	 return 0;
	}
}

