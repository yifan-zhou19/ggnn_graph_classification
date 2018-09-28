package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int x;
	  int x1;
	  int y1;
	  int x2;
	  int y2;
	  int r;
	  int k = 0;
	  int p = 0;
	  int[][] a = new int[100][100];
	  int[][] b = new int[100][100];
	  int[][] c = new int[100][100];
	  x1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  y1 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 0;i <= x1 - 1;i++)
	  {
		  for (j = 0;j <= y1 - 1;j++)
		  {
		  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  }
	  }
	  /*
	  for (i=0;i<=x1-1;i++)
	  {
		  for(j=0;j<=y1-1;j++)
			  cout<<a[i][j]<<" ";
		  cout<<endl;
	  }
	  */
	  x2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  y2 = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  for (i = 0;i <= x2 - 1;i++)
	  {
		  for (j = 0;j <= y2 - 1;j++)
		  {
			  x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		  b[i][j] = x;
		  }
	  }
	  /*
	  for (i=0;i<=x2-1;i++)
	  {
		  for(j=0;j<=y2-1;j++)
			  cout<<b[i][j]<<" ";
		  cout<<endl;
	  }
	  */
	  for (i = 0;i <= x1 - 1;i++)
	  {
			  for (j = 0;j <= y2 - 1;j++)
			  {
				k = 0;
				for (r = 0;r <= y1 - 1;r++)
				{
					  k = k + a[i][r] * b[r][j];
				}
				  c[i][j] = k;
			  }

	  }
	  /*
	  for (i=0;i<=x1-1;i++)
	  {
		  for(j=0;j<=y2-1;j++)
			  cout<<c[i][j]<<" ";
		  cout<<endl;
	  }
	  */
	  for (i = 0;i <= x1 - 1;i++)
	  {
		  for (j = 0;j <= y2 - 2;j++)
		  {
				System.out.print(c[i][j]);
				System.out.print(" ");
		  }
			System.out.print(c[i][j]);
			System.out.print("\n");
		  /*{if (p==0) {cout<<c[i][j];
			  p=1;}
		  else cout<<" "<<c[i][j];}
		  */


	  }
	  i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 return 0;
	}
}

