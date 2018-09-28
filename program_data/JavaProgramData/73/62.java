package <missing>;

public class GlobalMembers
{
	public static int Main()
	{
		  int[][] a = new int[5][5];
		  int i;
		  int j;
		  int x;
		  int y;
		 int[] m = {0, 0, 0, 0, 0};
		  x = 1;
		  y = 0;
		 int[] n = {0, 0, 0, 0, 0};
		  for (i = 0;i < 5;i++)
		  {
						  for (j = 0;j < 5;j++)
						  {
						  a[i][j] = 0;
						  }
		  }
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

						  for (j = 0;j < 5;j++)
						  {
										  if (n[i] < a[i][j])
										  {
													   n[i] = a[i][j];
													   m[i] = j;
										  }
						  }
		  }
		  for (i = 0;i < 5;i++)
		  {
						  for (j = 0;j < 5;j++)
						  {
								   if (n[i] > a[j][m[i]])
								   {
													  x = 0;
									break;
								   }
						  }
		  if (x == 1)
		  {
			 System.out.printf("%d %d %d\n",i + 1,m[i] + 1,n[i]);
		  y = 1;
		  }
		  x = 1;
		  }
		  if (y == 0)
		  {
		  System.out.print("not found");
		  }

	}

}

