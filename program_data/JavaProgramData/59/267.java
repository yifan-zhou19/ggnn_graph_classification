package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		char[][][] a = new char[102][102][102];
		char now;
	 int[][] yes = new int[102][102];
	 int i;
	 int j;
	 int k;
	 int n;
	 int m;
	 int sum;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	 memset(a,'.',(Character.SIZE / Byte.SIZE));
//C++ TO JAVA CONVERTER TODO TASK: The memory management function 'memset' has no equivalent in Java:
	 memset(yes,0,(Integer.SIZE / Byte.SIZE));
	 for (i = 1;i <= n;i++)
	 {
		  for (j = 1;j <= n;j++)
		  {
				a[1][i][j] = ConsoleInput.readToWhiteSpace(true).charAt(0);
		  }
	 }
	 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 for (k = 1;k < m;k++)
	 {

		 for (i = 1;i <= n;i++)
		 {
			   for (j = 1;j <= n;j++)
			   {
						if (a[k][i][j] == '@')
						{
							a[k + 1][i][j] = a[k][i][j];
						  if (a[k][i - 1][j] != '#')
						  {
							  a[k + 1][i - 1][j] = '@';
						  }
						  if (a[k][i][j - 1] != '#')
						  {
							  a[k + 1][i][j - 1] = '@';
						  }
						  if (a[k][i + 1][j] != '#')
						  {
							  a[k + 1][i + 1][j] = '@';
						  }
						  if (a[k][i][j + 1] != '#')
						  {
							  a[k + 1][i][j + 1] = '@';
						  }
						}
					  if (a[k][i][j] == '#')
					  {
						  a[k + 1][i][j] = a[k][i][j];
					  }
			   }
		 }
		   //for (i=1;i<=n;i++)
			//  {for (j=1;j<=n;j++)
			 //        cout<<a[k+1][i][j];
			 //  cout<<endl;
			//  }
	 }
	 sum = 0;
	 for (i = 1;i <= n;i++)
	 {
		  for (j = 1;j <= n;j++)
		  {
			   if (a[m][i][j] == '@')
			   {
				   sum++;
			   }
		  }
	 }
	 System.out.print(sum);
	 System.out.print("\n");
	 return 0;

	}

}

