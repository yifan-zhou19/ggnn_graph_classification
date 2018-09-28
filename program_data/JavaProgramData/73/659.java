package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		int[][] a = new int[100][100];
	int i;
	int j;
	for (i = 1;i <= 5;i++)
	{
	  for (j = 1;j <= 5;j++)
	  {
	  a[i][j] = Integer.parseInt(ConsoleInput.readToWhiteSpace(true));
	  }
	}
	  int k;
	  int t;
	  int m = 0;
	  int c = 1;
	  int b = 1;
	 for (i = 1;i <= 5;i++)
	 {
	  for (j = 1;j <= 5;j++)
	  {

		   {
			   for (t = 1;t <= 5;t++)
			   {
		   if (a[i][t] > a[i][j])
		   {
			  c = 0;
		   }
			   }
	   }
		  for (k = 1;k <= 5;k++)
		  {
			  if (a[k][j] < a[i][j])
			  {
			  b = 0;
			  }
		  }
		  if ((c * b) != 0)
		  {
		  System.out.print(i);
		  System.out.print(" ");
		  System.out.print(j);
		  System.out.print(" ");
		  System.out.print(a[i][j]);
		  System.out.print("\n");
		  m = 1;
		  }
			c = 1;
			b = 1;
	  }
	 }
	 if (m == 0)
	 {
	 System.out.print("not found");
	 }

	 return 0;
	}
}

