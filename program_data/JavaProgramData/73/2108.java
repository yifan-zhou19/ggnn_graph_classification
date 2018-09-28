package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int i;
	  int j;
	  int x;
	  int r;
	  int row;
	  int colum;
	  int k;
	  int p = 0;
	  int[][] a = new int[5][5];
	  for (i = 0;i <= 4;i++)
	  {
		  for (j = 0;j <= 4;j++)
		  {
			  x = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
			  a[i][j] = x;
		  }
	  }
	 // cout<<"1";
	  for (i = 0;i <= 4;i++)
	  {
			r = a[i][0];
			row = i;
			colum = 0;
		  for (j = 0;j <= 4;j++)
		  {
			  if (a[i][j] > r)
			  {
				  r = a[i][j];
				  row = i;
				  colum = j;

			  }
		  }
		  //cout<<"r:"<<r<<endl;
			  k = a[0][colum];
		   for (int z = 0;z <= 4;z++)
		   {
			   if (a[z][colum] < k)
			   {
			   k = a[z][colum];
			   }
		   }
			// cout<<"k:"<<k<<endl;
		 if (k == r)
		 {
			 System.out.print(row + 1);
			 System.out.print(" ");
			 System.out.print(colum + 1);
			 System.out.print(" ");
			 System.out.print(k);
			   p = 1;
		 }

	  }
	  if (p == 0)
	  {
		  System.out.print("not found");
	  }
	  i = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 return 0;
	}
}

