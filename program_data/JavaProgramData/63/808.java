package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	 int i;
	 int j;
	 int k;
	 int m;
	 int q;
	 m = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 q = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 int[][] a = new int[m][q];
	 for (i = 0;i < m;i++)
	 {
	  {
	   for (j = 0;j < q;j++)
	   {
	   a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	   }
  }
	 }
	 int n;
	 int p;
	 n = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 p = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	 int[][] b = new int[n][p];
	 for (i = 0;i < n;i++)
	 {
		{
		 for (j = 0;j < p;j++)
		 {
		 b[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
		 }
	}
	 }
	 int[][] c = new int[m][p];
	  for (k = 0;k < p;k++)
	  {
		  for (j = 0;j < m;j++)
		  {
			c[j][k] = 0;
			for (i = 0;i < q;i++)
			{
			 c[j][k] = c[j][k] + a[j][i] * b[i][k];
			}
		  }
	  }
	  for (i = 0;i < m;i++)
	  {
		for (j = 0;j < p - 1;j++)
		{
		 System.out.print(c[i][j]);
		 System.out.print(" ");
		}
		  System.out.print(c[i][p - 1]);
		  System.out.print("\n");
	  }
		System.in.read();
		System.in.read();
		System.in.read();
	return 0;
	}

}

