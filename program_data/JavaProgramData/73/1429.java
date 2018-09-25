package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
	  int[][] a = new int[5][5];
	  int i;
	  int j;
	  int b = 0;
	  int c = 0;
	  int n = 0;
	  int k;
	  for (i = 0;i < 5;i++)
	  {
		  for (j = 0;j < 5;j++)
		  {
		  String tempVar = ConsoleInput.scanfRead();
		  if (tempVar != null)
		  {
			  a[i][j] = Integer.parseInt(tempVar);
		  }
		  }
	  }
	  for (i = 0;i < 5;i++)
	  {
		  b = 0;
		  c = 0;
		  for (j = 0;j < 5;j++)
		  {
			 if (a[i][j] > b)
			 {
			 b = a[i][j];
			 }
		  }
		  for (j = 0;j < 5;j++)
		  {
			 if (a[i][j] == b)
			 {
				 c = a[0][j];
				 for (k = 0;k < 5;k++)
				 {
					 if (a[k][j] < c)
					 {
					 c = a[k][j];
					 }
				 }
				 if (b == c)
				 {
					 n++;
					 if (n == 1)
					 {
					 System.out.printf("%d %d %d",i + 1,j + 1,b);
					 }
					 if (n > 1)
					 {
							System.out.print(" ");
							System.out.printf("%d",i,j,b);
					 }
				 }
			 }
		  }
	  }
	if (n == 0)
	{
	System.out.print("not found");
	}
	return 0;
	}
}

